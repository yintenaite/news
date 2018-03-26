package com.news.controller;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.news.entity.Author;
import com.news.entity.Manager;
import com.news.entity.NewsQueue;
import com.news.entity.User;
import com.news.mapper.ManagerMapper;
import com.news.service.UserService;
import com.news.tools.ManageNewsQueue;

@Controller
public class UserController {
	
	@Autowired
	private UserService userService;
	@Autowired
	private ManageNewsQueue manageNewQueue;
	
	@RequestMapping(value="/logout",method=RequestMethod.GET)
	public @ResponseBody Map logout(HttpSession session) throws Exception{
		Map<String, String> map = new HashMap<String, String>();
		session.invalidate();
		map.put("message","1");
		return map;
	}
	
	@RequestMapping(value="/getUser/{sessionid}",method=RequestMethod.GET)
	public @ResponseBody Map getUser(@PathVariable("sessionid") String sessionid,HttpSession session) throws Exception{
		Map<String, String> map = new HashMap<String, String>();
		if(sessionid.equals(session.getId())){
			map.put("message", "1");
		}else{
			map.put("message", "0");
		}
		return map;
	}
	
	@RequestMapping(value="/userLogin",method=RequestMethod.POST)
	public @ResponseBody Map userLogin(@RequestBody User u,	HttpSession session) throws Exception{
		User user = userService.userLogin(u);
		Map<String, String> map = new HashMap<String, String>();
		if(user != null){
			session.setAttribute("user", user); 
			map.put("userId", user.getUserId());
			map.put("userName", user.getUserName());
			map.put("status", "1001");
			map.put("token", session.getId());
		}else{map.put("status", "1000");}
		return map;
	}
	@RequestMapping(value="/updatePassword",method=RequestMethod.POST)
	public @ResponseBody Map<String, String> updatePassword(@RequestBody String password,HttpSession session){
		Map<String, String> map = new HashMap<String, String>();
		User user = (User) session.getAttribute("user");
		if(user != null){
			try {
				userService.updatePassword(user.getUserId(),password);
				map.put("status", "8001");
			} catch (Exception e) {
				map.put("status", "8000");
				e.printStackTrace();
			}
		}else{
			map.put("status", "8000");
		}
		
		return map;
	}
	@RequestMapping(value="/updatejianjie",method=RequestMethod.POST)
	public @ResponseBody Map<String, String> updatejianjie(@RequestBody String content,HttpSession session){
		Map<String, String> map = new HashMap<String, String>();
		User user = (User) session.getAttribute("user");
		if(user != null){
			try {
				userService.updatejianjie(user.getUserId(),content);
				map.put("status", "8001");
			} catch (Exception e) {
				map.put("status", "8000");
				e.printStackTrace();
			}
		}else{
			map.put("status", "8000");
		}
		
		return map;
	}
	@RequestMapping(value="/updateImg",method=RequestMethod.POST)
	public @ResponseBody Map<String, String> updateImg(@RequestBody String imgUrl,HttpSession session){
		Map<String, String> map = new HashMap<String, String>();
		User user = (User) session.getAttribute("user");
		if(user != null){
			try {
				userService.updateImg(user.getUserId(),imgUrl);
				map.put("status", "8001");
			} catch (Exception e) {
				map.put("status", "8000");
				e.printStackTrace();
			}
		}else{
			map.put("status", "8000");
		}
		
		return map;
	}
	
	@RequestMapping(value="/checkuserloginname",method=RequestMethod.POST)
	public @ResponseBody Map<String, String> checkuserloginname(@RequestBody String loginName){
		Map<String, String> map = new HashMap<String, String>();
			Integer count =	userService.checkuserloginname(loginName);
			if(count > 0){
				map.put("message", "error");
			}else{
				map.put("message","success");
			}
		
		return map;
	}
	@SuppressWarnings("finally")
	@RequestMapping(value="/userRegister",method=RequestMethod.POST)
	public @ResponseBody Map<String, String> userRegister(@RequestBody User u,HttpSession session){
		Map<String, String> map = new HashMap<String, String>();
		try {
			User user = userService.userRegister(u);
			session.setAttribute("user", user);
			map.put("userId", user.getUserId());
			map.put("userName", user.getUserName());
			map.put("status", "2001");
			map.put("token", session.getId());
		} catch (Exception e) {
			map.put("status", "2000");
		}finally{
			return map;
		}
	}
	@SuppressWarnings("finally")
	@RequestMapping(value="/authorRegister",method=RequestMethod.GET)
	public @ResponseBody Map<String, String> authorRegister(Author author, HttpSession session){
		User user = (User) session.getAttribute("user");
		Map<String, String> map = new HashMap<String, String>();
		//拦截器拦截登陆，这里不验证
		try {
			userService.authorRegister(author, user.getUserId());
			map.put("status", "3001");
		} catch (Exception e) {
			map.put("status", "3000");
		}finally{
			return map;
		}
	}
	@RequestMapping(value="/getUserMsg",method=RequestMethod.GET)
	public @ResponseBody Map<String,Object> getUserMsg(HttpSession session) throws Exception{
		Map<String, Object> map = new HashMap<String, Object>();
		User user = (User) session.getAttribute("user");
		if(user != null){
			Author a = userService.getAuthorByUserId(user.getUserId());
			map.put("user", user);
			map.put("jianjie",a.getAuthorAbstract());
		}else{
			map.put("user",null);
			map.put("jianjie","");
		}
		return map;
	}
	
	@RequestMapping(value="/manageLogin",method=RequestMethod.POST)
	public @ResponseBody Map manageLogin(@RequestBody Manager m,	HttpSession session) throws Exception{
		Manager manager = userService.managerLogin(m);
		Map<String, Object> map = new HashMap<String, Object>();
		if(manager != null){
			session.setAttribute("manager", manager); 
			List<NewsQueue> list = new ArrayList<NewsQueue>();
			list =   manageNewQueue.getNewsQueue(10);
			session.setAttribute("newslist", list); 
			map.put("managerId", manager.getManagerId());
			map.put("managerName", manager.getManagerName());
			map.put("status", "1001");
			map.put("token", session.getId());
		}else{map.put("status", "1000");}
		return map;
	}
	@RequestMapping(value="/getManager/{sessionid}",method=RequestMethod.GET)
	public @ResponseBody Map getManager(@PathVariable("sessionid") String sessionid,HttpSession session) throws Exception{
		Map<String, Object> map = new HashMap<String, Object>();
		if(sessionid.equals(session.getId())){
			map.put("message", "1");
		}else{
			map.put("message", "0");
		}
		return map;
	}

}
