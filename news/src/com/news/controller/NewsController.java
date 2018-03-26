package com.news.controller;

import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.news.entity.Checkfailed;
import com.news.entity.Collection;
import com.news.entity.Comment;
import com.news.entity.CommentVo;
import com.news.entity.DingyueVo;
import com.news.entity.Nav;
import com.news.entity.New;
import com.news.entity.NewsOfIndex;
import com.news.entity.Subscribe;
import com.news.entity.User;
import com.news.service.NewsService;
import com.news.service.UserService;

@Controller
public class NewsController {
	@Autowired
	private NewsService newsService;
	@Autowired
	private UserService userService;
	
	@SuppressWarnings("finally")
	@RequestMapping(value="/getNewsDetail/{id}",method=RequestMethod.GET)
	public @ResponseBody Map<String,Object> getNewsDetail(@PathVariable("id") String id){
		Map<String,Object> map=new HashMap<String,Object>();
		try {
			New news = newsService.getNewsDetail(id);
			List<CommentVo> commentVo = newsService.getCommentsVo(id);
			User u = userService.getUserById(news.getUserId());
			map.put("news", news);
			map.put("comment", commentVo);
			map.put("commentsize", commentVo.size());
			map.put("userName", u.getUserName());
		} catch (Exception e) {
			e.printStackTrace();
		}finally{
			return map;
		}
	}
	
	@RequestMapping(value="/getFastNews",method=RequestMethod.GET)
	public @ResponseBody Map<String,Object> getFastNews(){
		Map<String,Object> map=new HashMap<String,Object>();
		List<NewsOfIndex> list = newsService.getFastNews();
		map.put("fastNews", list);
		return map;
	}
	@RequestMapping(value="/getreason/{newsid}",method=RequestMethod.GET)
	public @ResponseBody Map<String,Object> getreason(@PathVariable("newsid") String newsid){
		Map<String,Object> map=new HashMap<String,Object>();
		Checkfailed cf = newsService.getReason(newsid);
		map.put("message", cf.getChfReason());
		return map;
	}
	@SuppressWarnings("finally")
	@RequestMapping(value="/getNewsOfIndex/{nav}",method=RequestMethod.GET)
	public @ResponseBody Map<String,Object> getNewsOfIndex(@PathVariable("nav") String nav){
		Map<String,Object> map=new HashMap<String,Object>();
		List<NewsOfIndex> list = new ArrayList<NewsOfIndex>();
		try {
			list = newsService.getNewsOfIndex(nav);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			map.put("mainNews", list);
			return map;
		}
	}
	@SuppressWarnings("finally")
	@RequestMapping(value="/addNews",method=RequestMethod.POST)
	public @ResponseBody Map<String,Object> addNews(@RequestBody New news,HttpSession session){
		User u = (User) session.getAttribute("user");
		Map<String,Object> map = new HashMap<String,Object>();
		String picPath = session.getServletContext().getRealPath("/");
		String contextPath = session.getServletContext().getContextPath();
		try {
			if(u != null){
				newsService.addNews(news, u.getUserId(),picPath,contextPath);
				map.put("status", "3001");
			}else{
				map.put("status", "3000");
			}
		} catch (Exception e) {
			map.put("status", "3000");
			e.printStackTrace();
		}finally{
			return map;
		}
	}
	@RequestMapping(value="/updateNews",method=RequestMethod.POST)
	public @ResponseBody Map<String,Object> updatNews(@RequestBody New news,HttpSession session) throws Exception{
		Map<String,Object> map = new HashMap<String,Object>();
		String picPath = session.getServletContext().getRealPath("/");
		String contextPath = session.getServletContext().getContextPath();
				newsService.updateNews(news,picPath,contextPath);
				map.put("status", "3001");
			return map;
	}
	
	@RequestMapping(value="/getComments/{id}",method=RequestMethod.GET)
	public @ResponseBody Map<String, Object> getCommentVo(@PathVariable("id") String id) throws Exception{
		Map<String, Object> map = new HashMap<String, Object>();
		List<CommentVo> commentVo = newsService.getCommentsVo(id);
		map.put("comment", commentVo);
		map.put("commentsize", commentVo.size());
		return map;
	}
	
	@SuppressWarnings("finally")
	@RequestMapping(value="/addComment",method=RequestMethod.POST)
	public @ResponseBody Map<String,Object> addComment(@RequestBody Comment comment,HttpSession session){
		Map<String,Object> map = new HashMap<String,Object>();
		User u = (User) session.getAttribute("user");
		//if(u != null){
			try {
				newsService.addComment(comment,u.getUserId());
				map.put("status", "4001");
				List<CommentVo> commentVo = newsService.getCommentsVo(comment.getNewId());
				map.put("comment", commentVo);
				map.put("commentsize", commentVo.size());
			} catch (Exception e) {
				map.put("status", "4000");
				e.printStackTrace();
			}finally{
				return map;
			}
	//	}else{
		//	map.put("status", "4003");
		//	return map;
	//	}
		
	}
	
	@SuppressWarnings("finally")
	@RequestMapping(value="/search/{q}",method=RequestMethod.GET)
	public @ResponseBody List<NewsOfIndex> indexSearch(@PathVariable("q") String q) throws UnsupportedEncodingException{
		List<NewsOfIndex> list = new ArrayList<NewsOfIndex>();
		String param = new String(q.getBytes("ISO8859-1"),"utf-8");
		try {
			list = newsService.search(param);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			return list;
		}
		
	}
	@RequestMapping(value="/getAllNav",method=RequestMethod.GET)
	public @ResponseBody List<Nav> getAllNav(){
		List<Nav> list = new ArrayList<Nav>();
		list = newsService.getAllNav();
		return list;
	}
	@RequestMapping(value="/getNewsOfCollection",method=RequestMethod.GET)
	public @ResponseBody Map<String,Object> getNewsOfCollection(HttpSession session){
		Map<String,Object> map=new HashMap<String,Object>();
		List<NewsOfIndex> list = new ArrayList<NewsOfIndex>();
		User u = (User) session.getAttribute("user");
		if(u != null){
			list = newsService.getNewsOfCollection(u.getUserId());
		}
		map.put("news", list);
		return map;
	}
	@RequestMapping(value="/getDingyue",method=RequestMethod.GET)
	public  @ResponseBody Map<String,Object> getDingyue(HttpSession session){
		Map<String,Object> map=new HashMap<String,Object>();
		List<DingyueVo> list = new ArrayList<DingyueVo>();
		User u = (User) session.getAttribute("user");
		if(u != null){
			list = newsService.getDingyue(u.getUserId());
			map.put("message", list);
		}
		return map;
	}
	@RequestMapping(value="/getNewsByAuthor",method=RequestMethod.GET)
	public  @ResponseBody Map<String,Object> getNewsByAuthor(HttpSession session){
		Map<String,Object> map=new HashMap<String,Object>();
		List<NewsOfIndex> list = new ArrayList<NewsOfIndex>();
		User u = (User) session.getAttribute("user");
		if(u != null){
			list = newsService.getNewsOfAuthor(u.getUserId());
			map.put("message", list);
		}
		return map;
		
	}
	@RequestMapping(value="/getNewsByAuthoring",method=RequestMethod.GET)
	public  @ResponseBody Map<String,Object> getNewsByAuthoring(HttpSession session){
		Map<String,Object> map=new HashMap<String,Object>();
		List<NewsOfIndex> list = new ArrayList<NewsOfIndex>();
		User u = (User) session.getAttribute("user");
		if(u != null){
			list = newsService.getNewsOfAuthoring(u.getUserId());
			map.put("message", list);
		}
		return map;
		
	}
	@RequestMapping(value="/getNewsByAuthorno",method=RequestMethod.GET)
	public  @ResponseBody Map<String,Object> getNewsByAuthorno(HttpSession session){
		Map<String,Object> map=new HashMap<String,Object>();
		List<NewsOfIndex> list = new ArrayList<NewsOfIndex>();
		User u = (User) session.getAttribute("user");
		if(u != null){
			list = newsService.getNewsOfAuthorno(u.getUserId());
			map.put("message", list);
		}
		return map;
		
	}
	@RequestMapping(value="/getauthormessage/{authorid}",method=RequestMethod.GET)
	public @ResponseBody Map<String,Object> getauthormessage(@PathVariable("authorid") String authorid) throws Exception{
		Map<String,Object> map=new HashMap<String,Object>();
		List<NewsOfIndex> list = new ArrayList<NewsOfIndex>();
		list = newsService.getNewsOfAuthor(authorid);
		User user = userService.getUserById(authorid);
		map.put("newslist", list);
		map.put("listsize", list.size());
		Integer count = newsService.getDingyueOfAuthor(authorid);
		map.put("dingyue", count);
		map.put("authorname", user.getUserName());
		map.put("img", user.getUserImgUrl());
		map.put("authordesc", userService.getAuthorByUserId(authorid).getAuthorAbstract());
		return map;
	}
	@RequestMapping(value="/addCollection/{newsid}/{newstitle}",method=RequestMethod.GET)
	public @ResponseBody Map<String,Object> addCollection(@PathVariable("newsid") String newsid,@PathVariable("newstitle") String newstitle,HttpSession session) throws UnsupportedEncodingException{
		Map<String,Object> map=new HashMap<String,Object>();
		User u = (User) session.getAttribute("user");
		String param = new String(newstitle.getBytes("ISO8859-1"),"utf-8");
		String message = newsService.addCollection(newsid,param,u.getUserId());
		map.put("message", message);
		return map;
	}
	
	@RequestMapping(value="/delCollection/{newid}",method=RequestMethod.GET)
	public @ResponseBody Map<String,Object> delCollection(@PathVariable("newid") String newid,HttpSession session){
		
		Map<String,Object> map=new HashMap<String,Object>();
		User u = (User) session.getAttribute("user");
		Collection c = new Collection();
		c.setNewId(newid);
		c.setUserId(u.getUserId());
		try {
			newsService.delCollection(c);
			map.put("status", "5001");
		} catch (Exception e) {
			map.put("status", "5000");
		}
		return map;
	}
	@RequestMapping(value="/delSubscribe/{authorid}",method=RequestMethod.GET)
	public @ResponseBody Map<String,Object> delSubscribe(@PathVariable("authorid") String authorid,HttpSession session){
		Map<String,Object> map=new HashMap<String,Object>();
		User u = (User) session.getAttribute("user");
		Subscribe s= new Subscribe();
		s.setAuthorId(authorid);
		s.setUserId(u.getUserId());
		try {
			newsService.delSubscribe(s);
			map.put("status", "6001");
		} catch (Exception e) {
			map.put("status", "6000");
		}
		return map;
	}
	
	@RequestMapping(value="/adddingyue/{authorid}",method=RequestMethod.GET)
	public @ResponseBody Map<String,Object> adddingyue(@PathVariable("authorid") String authorid,HttpSession session){
		Map<String,Object> map=new HashMap<String,Object>();
		User u = (User) session.getAttribute("user");
		String m = newsService.adddingyue(authorid,u.getUserId());
		map.put("message", m);
		return map;
	}
	
	@RequestMapping(value="/delnews/{newid}",method=RequestMethod.GET)
	public @ResponseBody Map<String,Object> delnews(@PathVariable("newid") String newid){
		Map<String,Object> map=new HashMap<String,Object>();
		try {
			newsService.delnews(newid);
			map.put("status", "7001");
		} catch (Exception e) {
			e.printStackTrace();
			map.put("status", "7000");
		}finally{
			return map;
		}
	}
	

	/*@RequestMapping(value="/getdingyue",method=RequestMethod.GET)
	public @ResponseBody Map<String,Object> getdingyue(HttpSession session){
		Map<String,Object> map=new HashMap<String,Object>();
		User u = (User) session.getAttribute("user");
		List<DingyueVo> dv = newsService.getdingyue(u.getUserId());
		map.put("dv", dv);
	}*/
}
