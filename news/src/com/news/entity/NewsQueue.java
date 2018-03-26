package com.news.entity;

import java.util.Date;

public class NewsQueue {
	private String newsId;//新闻id
	private String newsTitle;//新闻标题
	private Date newsUpdateTime;//提交时间
	private double newsTimeWeight;//新闻时间权重
	public String getNewsId() {
		return newsId;
	}
	public void setNewsId(String newsId) {
		this.newsId = newsId;
	}
	public String getNewsTitle() {
		return newsTitle;
	}
	public void setNewsTitle(String newsTitle) {
		this.newsTitle = newsTitle;
	}
	public double getNewsTimeWeight() {
		return newsTimeWeight;
	}
	public void setNewsTimeWeight(double newsTimeWeight) {
		this.newsTimeWeight = newsTimeWeight;
	}
	public Date getNewsUpdateTime() {
		return newsUpdateTime;
	}
	public void setNewsUpdateTime(Date newsUpdateTime) {
		this.newsUpdateTime = newsUpdateTime;
	}
	
}
