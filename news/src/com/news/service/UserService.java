package com.news.service;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;

import com.news.entity.Author;
import com.news.entity.Manager;
import com.news.entity.User;
import com.news.mapper.AuthorMapper;
import com.news.mapper.ManagerMapper;
import com.news.mapper.UserMapper;
import com.news.tools.UUIDUtil;

public class UserService {

	@Autowired
	private UserMapper userMapper;
	@Autowired
	private AuthorMapper authorMapper;
	@Autowired
	private ManagerMapper managerMapper;
	
	public Integer checkuserloginname(String loginName){
		return userMapper.checkuserloginname(loginName);
		
	}
	public void updateImg(String userId,String imgUrl){
		User u = new User();
		u.setUserId(userId);
		u.setUserImgUrl(imgUrl);
		userMapper.updateUser(u);
	}
	public void updatePassword(String userId,String userPassword){
		User u = new User();
		u.setUserId(userId);
		u.setUserPassword(userPassword);
		userMapper.updateUser(u);
	}
	
	public void updatejianjie(String userId,String content){
		Author a = new Author();
		a.setAuthorId(userId);
		a.setAuthorAbstract(content);
		authorMapper.updateByPrimaryKeySelective(a);
	}
	
	public Manager managerLogin(Manager m){
		return managerMapper.getManagerToLogin(m);
	}
	
	public User userLogin(User u) throws Exception{
		return userMapper.getUserToLogin(u);
	}
	
	public User getUserById(String id) throws Exception{
		return userMapper.getUserById(id);
	}
	public Author getAuthorByUserId(String id) throws Exception{
		return authorMapper.getAuthorByUserId(id);
	}
	
	public User userRegister(User u) throws Exception{
		String id = UUIDUtil.getUUID();
		u.setUserId(id);//id
		u.setUserCreatetime(new Date());//创建日期
		u.setUserBlacklist(0);//黑名单
		u.setUserIsauthor(1);//是否为作者
		userMapper.addUser(u);
		authorRegister(new Author(),id);
		return u;
	}
	
	public void authorRegister(Author author,String userId)throws Exception{
		author.setAuthorId(userId);
		author.setUserId(userId);
		author.setAuthorCreatetime(new Date());
		author.setAuthorSubscribe(0);
		if(author.getAuthorAbstract() == null || "".equals(author.getAuthorAbstract())) 
			author.setAuthorAbstract("该用户没有留下任何介绍。");
		User u = new User();u.setUserId(userId);u.setUserIsauthor(1);
		authorMapper.addAuthor(author);
	}
	
}
