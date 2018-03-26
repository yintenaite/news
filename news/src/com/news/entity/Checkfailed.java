package com.news.entity;

import java.util.Date;

public class Checkfailed {
    private Integer chfId;

    private String chfReason;

    private Date chfCreatetime;

    private String newId;

    private Integer managerId;

    public Integer getChfId() {
        return chfId;
    }

    public void setChfId(Integer chfId) {
        this.chfId = chfId;
    }

    public String getChfReason() {
        return chfReason;
    }

    public void setChfReason(String chfReason) {
        this.chfReason = chfReason == null ? null : chfReason.trim();
    }

    public Date getChfCreatetime() {
        return chfCreatetime;
    }

    public void setChfCreatetime(Date chfCreatetime) {
        this.chfCreatetime = chfCreatetime;
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