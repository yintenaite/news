package com.news.controller;

import java.util.List;

import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.context.ContextLoader;
import org.springframework.web.context.WebApplicationContext;

import com.news.entity.Manager;
import com.news.entity.NewsQueue;
import com.news.tools.ManageNewsQueue;

public class SessionListener implements HttpSessionListener{
	
	@Override
	public void sessionCreated(HttpSessionEvent arg0) {
		// TODO Auto-generated method stub
	}

	@Override
	public void sessionDestroyed(HttpSessionEvent session) {
		// TODO Auto-generated method stub
		Manager m = (Manager) session.getSession().getAttribute("manager");
		if(m != null){
			List<NewsQueue> reBackList = (List<NewsQueue>) session.getSession().getAttribute("newslist");
			if(reBackList != null && reBackList.size() > 0){
				WebApplicationContext wac = ContextLoader.getCurrentWebApplicationContext();
				ManageNewsQueue manageNewQueue = (ManageNewsQueue) wac.getBean("manageNewsQueue");
				manageNewQueue.reBackList(reBackList);
			}
		}
	}
	
}
