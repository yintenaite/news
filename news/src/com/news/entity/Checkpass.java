package com.news.entity;

import java.util.Date;

public class Checkpass {
    private Integer chpId;

    private Date chpCreatetime;

    private String newId;

    private Integer managerId;

    public Integer getChpId() {
        return chpId;
    }

    public void setChpId(Integer chpId) {
        this.chpId = chpId;
    }

    public Date getChpCreatetime() {
        return chpCreatetime;
    }

    public void setChpCreatetime(Date chpCreatetime) {
        this.chpCreatetime = chpCreatetime;
    }

    public String getNewId() {
        return newId;
    }

    public void setNewId(String newId) {
        this.newId = newId == null ? null : newId.trim();
    }

    public Integer getManagerId() {
        return managerId;
    }

    public void setManagerId(Integer managerId) {
        this.managerId = managerId;
    }
}