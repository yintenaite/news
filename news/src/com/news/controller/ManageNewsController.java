package com.news.controller;

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
import com.news.entity.Manager;
import com.news.entity.Nav;
import com.news.entity.New;
import com.news.entity.NewsQueue;
import com.news.entity.User;
import com.news.service.NewsService;
import com.news.service.UserService;
import com.news.tools.ManageNewsQueue;

@Controller
public class ManageNewsController {
	@Autowired
	private ManageNewsQueue manageNewQueue;
	@Autowired
	private NewsService newsService;
	@Autowired
	private UserService userService;
	
	@RequestMapping(value="/getNewsQueue",method=RequestMethod.GET)
	public @ResponseBody List<NewsQueue> getNewsQueue(HttpSession session) throws InterruptedException{
		Manager m = (Manager) session.getAttribute("manager");
		if(m != null){
			List<NewsQueue> list = new ArrayList<NewsQueue>();
			list =  (List<NewsQueue>) session.getAttribute("newslist");
			if(list.size() < 10){
				int i = 10-list.size();
				List<NewsQueue> l = manageNewQueue.getNewsQueue(i);
				list.addAll(l);
			}
			return list;
		}else{
			return null;
		}
		
	}
	
	@RequestMapping(value="/getManageNews/{newsid}",method=RequestMethod.GET)
	public  @ResponseBody Map<String,Object> getManageNews(@PathVariable("newsid") String newsid) throws Exception{
		Map<String,Object> map=new HashMap<String,Object>();
		New news = newsService.getNewsDetail(newsid);
		Nav n = newsService.getCategoryName(news.getCategoryId());
		User u = userService.getUserById(news.getUserId());
		map.put("news", news);
		map.put("userName", u.getUserName());
		map.put("categoryName", n.getNavName());
		map.put("category", n);
		return map;
	}
	@RequestMapping(value="/setPass/{newsid}",method=RequestMethod.GET)
	public  @ResponseBody Map<String,Object> setPass(@PathVariable("newsid") String newsid,HttpSession session) throws Exception{
		Map<String,Object> map=new HashMap<String,Object>();
		Manager m = (Manager) session.getAttribute("manager");
		if(m!= null){
			newsService.setPass(newsid,m.getManagerId());
			List<NewsQueue> list =new ArrayList<NewsQueue>();
			list= (List<NewsQueue>) session.getAttribute("newslist");
			for( int i = 0;i<list.size();i++){
				if(newsid.equals(list.get(i).getNewsId())){
					list.remove(i);break;
				}
			}
			if(list.size() >0){
				map.put("nextid", list.get(0).getNewsId());
			}else{
				map.put("nextid", null);
			}
		}
		return map;
	}
	@RequestMapping(value="/setNoPass",method=RequestMethod.POST)
	public  @ResponseBody Map<String,Object> setNoPass(@RequestBody Checkfailed nopass,HttpSession session) throws Exception{
		Map<String,Object> map=new HashMap<String,Object>();
		Manager m = (Manager) session.getAttribute("manager");
		if(m!= null){
			newsService.setNoPass(nopass,m.getManagerId());
			List<NewsQueue> list = new ArrayList<NewsQueue>();
			list = (List<NewsQueue>) session.getAttribute("newslist");
			for( int i = 0;i<list.size();i++){
				if((nopass.getNewId()).equals(list.get(i).getNewsId())){
					list.remove(i);break;
				}
			}
			if(list.size() >0){
				map.put("nextid", list.get(0).getNewsId());
			}else{
				map.put("nextid", null);
			}
		}
		return map;
	}

	/*public ManageNewsQueue getManageNewQueue() {
		return manageNewQueue;
	}*/
	
}
