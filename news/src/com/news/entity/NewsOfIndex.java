package com.news.entity;

import java.util.Date;

public class NewsOfIndex {
	private String newId;
	private String newImg;
    private String newTitle;
    private String newText;
    private Date newCreatetime;
    private String userId;
    private String userName;
    private Integer statisticComment;
    
    
	public String getNewId() {
		return newId;
	}
	public void setNewId(String newId) {
		this.newId = newId;
	}
	public String getNewImg() {
		return newImg;
	}
	public void setNewImg(String newImg) {
		this.newImg = newImg;
	}
	public String getNewTitle() {
		return newTitle;
	}
	public void setNewTitle(String newTitle) {
		this.newTitle = newTitle;
	}
	
	public String getNewText() {
		return newText;
	}
	public void setNewText(String newText) {
		this.newText = newText;
	}
	public Date getNewCreatetime() {
		return newCreatetime;
	}
	public void setNewCreatetime(Date newCreatetime) {
		this.newCreatetime = newCreatetime;
	}
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public Integer getStatisticComment() {
		return statisticComment;
	}
	public void setStatisticComment(Integer statisticComment) {
		this.statisticComment = statisticComment;
	}
}
