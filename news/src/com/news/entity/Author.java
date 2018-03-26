package com.news.entity;

import java.util.Date;

public class Author {
    private String authorId;

    private String authorAbstract;

    private Date authorCreatetime;

    private Integer authorSubscribe;

    private String userId;

    public String getAuthorId() {
        return authorId;
    }

    public void setAuthorId(String authorId) {
        this.authorId = authorId == null ? null : authorId.trim();
    }

    public String getAuthorAbstract() {
        return authorAbstract;
    }

    public void setAuthorAbstract(String authorAbstract) {
        this.authorAbstract = authorAbstract == null ? null : authorAbstract.trim();
    }

    public Date getAuthorCreatetime() {
        return authorCreatetime;
    }

    public void setAuthorCreatetime(Date authorCreatetime) {
        this.authorCreatetime = authorCreatetime;
    }

    public Integer getAuthorSubscribe() {
        return authorSubscribe;
    }

    public void setAuthorSubscribe(Integer authorSubscribe) {
        this.authorSubscribe = authorSubscribe;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId == null ? null : userId.trim();
    }
}