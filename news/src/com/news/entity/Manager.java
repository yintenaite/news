package com.news.entity;

import java.util.Date;

public class Manager {
    private Integer managerId;

    private String managerNumber;

    private String managerLoginname;

    private String managerPassword;

    private String managerName;

    private Date managerCreatetime;

    public Integer getManagerId() {
        return managerId;
    }

    public void setManagerId(Integer managerId) {
        this.managerId = managerId;
    }

    public String getManagerNumber() {
        return managerNumber;
    }

    public void setManagerNumber(String managerNumber) {
        this.managerNumber = managerNumber == null ? null : managerNumber.trim();
    }

    public String getManagerLoginname() {
        return managerLoginname;
    }

    public void setManagerLoginname(String managerLoginname) {
        this.managerLoginname = managerLoginname == null ? null : managerLoginname.trim();
    }

    public String getManagerPassword() {
        return managerPassword;
    }

    public void setManagerPassword(String managerPassword) {
        this.managerPassword = managerPassword == null ? null : managerPassword.trim();
    }

    public String getManagerName() {
        return managerName;
    }

    public void setManagerName(String managerName) {
        this.managerName = managerName == null ? null : managerName.trim();
    }

    public Date getManagerCreatetime() {
        return managerCreatetime;
    }

    public void setManagerCreatetime(Date managerCreatetime) {
        this.managerCreatetime = managerCreatetime;
    }
}