package com.news.entity;

public class DingyueVo extends Subscribe{
	private String userImgUrl;
	 private String userName;
	 private String authorAbstract;
	public DingyueVo() {
		super();
	}
	public String getUserImgUrl() {
		return userImgUrl;
	}
	public void setUserImgUrl(String userImgUrl) {
		this.userImgUrl = userImgUrl;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getAuthorAbstract() {
		return authorAbstract;
	}
	public void setAuthorAbstract(String authorAbstract) {
		this.authorAbstract = authorAbstract;
	}
	
}
