package com.news.entity;

import java.util.Date;

public class New {
    private String newId;

    private String newTitle;

    private String newImg;

    private Date newCreatetime;

    private Date newUpdatetime;

    private Integer newPass;

    private Integer categoryId;

    private String userId;

    private String newContent;
    
    private String newText;

    public String getNewId() {
        return newId;
    }

    public void setNewId(String newId) {
        this.newId = newId == null ? null : newId.trim();
    }

    public String getNewTitle() {
        return newTitle;
    }

    public void setNewTitle(String newTitle) {
        this.newTitle = newTitle == null ? null : newTitle.trim();
    }

    public String getNewImg() {
        return newImg;
    }

    public void setNewImg(String newImg) {
        this.newImg = newImg == null ? null : newImg.trim();
    }

    public Date getNewCreatetime() {
        return newCreatetime;
    }

    public void setNewCreatetime(Date newCreatetime) {
        this.newCreatetime = newCreatetime;
    }

    public Date getNewUpdatetime() {
        return newUpdatetime;
    }

    public void setNewUpdatetime(Date newUpdatetime) {
        this.newUpdatetime = newUpdatetime;
    }

    public Integer getNewPass() {
        return newPass;
    }

    public void setNewPass(Integer newPass) {
        this.newPass = newPass;
    }

    public Integer getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(Integer categoryId) {
        this.categoryId = categoryId;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId == null ? null : userId.trim();
    }

    public String getNewContent() {
        return newContent;
    }

    public void setNewContent(String newContent) {
        this.newContent = newContent == null ? null : newContent.trim();
    }

	public String getNewText() {
		return newText;
	}

	public void setNewText(String newText) {
		this.newText = newText;
	}
    
}