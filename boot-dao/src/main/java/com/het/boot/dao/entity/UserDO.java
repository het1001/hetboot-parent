package com.het.boot.dao.entity;

import java.util.Date;

public class UserDO extends BaseEntity {

    private String realName;

    private String sex;

    private String idCardNo;

    private String phone;

    private String standbyPhone;

    private String workId;

    private String account;

    private String passWord;

    private String job;

    private String jobLevel;

    private Long teamId;

    private String workMail;

    private String hkMail;

    private String state;

    private Date lastLoginTime;

    private String areaZone;

    private String property;

    private Date entryDate;

    private Date leaveDate;

    private Long bizZoneId;

    public String getRealName() {
        return realName;
    }

    public void setRealName(String realName) {
        this.realName = realName == null ? null : realName.trim();
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex == null ? null : sex.trim();
    }

    public String getIdCardNo() {
        return idCardNo;
    }

    public void setIdCardNo(String idCardNo) {
        this.idCardNo = idCardNo == null ? null : idCardNo.trim();
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone == null ? null : phone.trim();
    }

    public String getStandbyPhone() {
        return standbyPhone;
    }

    public void setStandbyPhone(String standbyPhone) {
        this.standbyPhone = standbyPhone == null ? null : standbyPhone.trim();
    }

    public String getWorkId() {
        return workId;
    }

    public void setWorkId(String workId) {
        this.workId = workId == null ? null : workId.trim();
    }

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account == null ? null : account.trim();
    }

    public String getPassWord() {
        return passWord;
    }

    public void setPassWord(String passWord) {
        this.passWord = passWord == null ? null : passWord.trim();
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job == null ? null : job.trim();
    }

    public String getJobLevel() {
        return jobLevel;
    }

    public void setJobLevel(String jobLevel) {
        this.jobLevel = jobLevel == null ? null : jobLevel.trim();
    }

    public Long getTeamId() {
        return teamId;
    }

    public void setTeamId(Long teamId) {
        this.teamId = teamId;
    }

    public String getWorkMail() {
        return workMail;
    }

    public void setWorkMail(String workMail) {
        this.workMail = workMail == null ? null : workMail.trim();
    }

    public String getHkMail() {
        return hkMail;
    }

    public void setHkMail(String hkMail) {
        this.hkMail = hkMail == null ? null : hkMail.trim();
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state == null ? null : state.trim();
    }

    public Date getLastLoginTime() {
        return lastLoginTime;
    }

    public void setLastLoginTime(Date lastLoginTime) {
        this.lastLoginTime = lastLoginTime;
    }

    public String getAreaZone() {
        return areaZone;
    }

    public void setAreaZone(String areaZone) {
        this.areaZone = areaZone == null ? null : areaZone.trim();
    }

    public String getProperty() {
        return property;
    }

    public void setProperty(String property) {
        this.property = property == null ? null : property.trim();
    }

    public Date getEntryDate() {
        return entryDate;
    }

    public void setEntryDate(Date entryDate) {
        this.entryDate = entryDate;
    }

    public Date getLeaveDate() {
        return leaveDate;
    }

    public void setLeaveDate(Date leaveDate) {
        this.leaveDate = leaveDate;
    }

    public Long getBizZoneId() {
        return bizZoneId;
    }

    public void setBizZoneId(Long bizZoneId) {
        this.bizZoneId = bizZoneId;
    }
}