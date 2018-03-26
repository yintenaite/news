package com.news.entity;

public class Nav {
    private Integer navId;

    private String navName;

    private String navHref;

    private String navImg;

    public Integer getNavId() {
        return navId;
    }

    public void setNavId(Integer navId) {
        this.navId = navId;
    }

    public String getNavName() {
        return navName;
    }

    public void setNavName(String navName) {
        this.navName = navName == null ? null : navName.trim();
    }

    public String getNavHref() {
        return navHref;
    }

    public void setNavHref(String navHref) {
        this.navHref = navHref == null ? null : navHref.trim();
    }

    public String getNavImg() {
        return navImg;
    }

    public void setNavImg(String navImg) {
        this.navImg = navImg == null ? null : navImg.trim();
    }
}