package com.news.entity;

import java.util.Date;

public class User {
    private String userId;
    /*@Size(min=1,max=30,message="{items.name.length.error}",groups={ValidGroup1.class})*/
    private String userName;

    private String userLoginName;

    private String userPassword;

    private Date userCreatetime;

    private Integer userBlacklist;

    private String userNav;

    private Integer userIsauthor;
    
    private String userImgUrl;

    public String getUserId() {
        return userId;
    }
    
    public String getUserImgUrl() {
        return userImgUrl;
    }

    public void setUserImgUrl(String userImgUrl) {
        this.userImgUrl = userImgUrl == null ? null : userImgUrl.trim();
    }


    public void setUserId(String userId) {
        this.userId = userId == null ? null : userId.trim();
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName == null ? null : userName.trim();
    }

    public String getUserLoginName() {
		return userLoginName;
	}

	public void setUserLoginName(String userLoginName) {
		this.userLoginName = userLoginName;
	}

	public String getUserPassword() {
        return userPassword;
    }

    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword == null ? null : userPassword.trim();
    }

    public Date getUserCreatetime() {
        return userCreatetime;
    }

    public void setUserCreatetime(Date userCreatetime) {
        this.userCreatetime = userCreatetime;
    }

    public Integer getUserBlacklist() {
        return userBlacklist;
    }

    public void setUserBlacklist(Integer userBlacklist) {
        this.userBlacklist = userBlacklist;
    }

    public String getUserNav() {
        return userNav;
    }

    public void setUserNav(String userNav) {
        this.userNav = userNav == null ? null : userNav.trim();
    }

    public Integer getUserIsauthor() {
        return userIsauthor;
    }

    public void setUserIsauthor(Integer userIsauthor) {
        this.userIsauthor = userIsauthor;
    }
}