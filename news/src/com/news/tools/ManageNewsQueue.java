package com.news.tools;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;

import com.news.entity.NewsQueue;
import com.news.mapper.NewsQueueMapper;

public class ManageNewsQueue {
	
	private List<NewsQueue> queue;//新闻队列
	private double timeWeight = -1;//时间权重
	private boolean lock;//锁标记
	@Autowired
	private  NewsQueueMapper newsQueueMapper;
	
	public ManageNewsQueue() {
		if(getTimeWeight() == -1){
			queue = new ArrayList<NewsQueue>();
			timeWeight = 0;
			lock =false;
		}
	}
	public void reBackList(List<NewsQueue> reBackList){
		List<NewsQueue> l = getQueue();
		getQueue().addAll(reBackList);
	}
	public  List<NewsQueue> getNewsQueue(Integer requestCount) throws InterruptedException{
		while(true){
			if(!isLock()){
				setLock();//加锁
				break;
			}
			else Thread.sleep(500);
		}
		Integer length = getQueue().size();
		if(length<10){
			Map<String, Object> map = new HashMap<String, Object>();
			map.put("quantity", 20-length);
			map.put("weight", getTimeWeight());
			List<NewsQueue> list = newsQueueMapper.getNewstoQueue(map);
			if(list.size()>0){
				setTimeWeight(list.get(list.size()-1).getNewsTimeWeight());
				getQueue().addAll(list);
			}
		}
		List<NewsQueue> q = new ArrayList<NewsQueue>();
			int count = 0;
			if( getQueue().size() > 0){
				while(count <= getQueue().size()){
					q.add(getQueue().get(0));
					getQueue().remove(0);
					if(++count >= requestCount)break;
				}
			}
		setLock();//解锁
		return q;
	}

	public List<NewsQueue> getQueue() {
		return queue;
	}

	public void setQueue(List<NewsQueue> queue) {
		this.queue = queue;
	}

	public double getTimeWeight() {
		return timeWeight;
	}

	public void setTimeWeight(double timeWeight) {
		this.timeWeight = timeWeight;
	}


	public boolean isLock() {
		return lock;
	}


	public void setLock() {
		this.lock = !this.lock;
	}

	
	
	
	
}
