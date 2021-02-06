package com.bjpowernode.crm.settings.domain;

public class User {
    /*
    * 关于字符串中的字符集表现方式
    * 
    *
    * */
    private String id;  //编号 主键
    private String loginAct; //登录账号
    private String name; //用户的真实姓名
    private String loginPwd; //登录密码
    private String emai; //用户的邮箱
    private String expireTime; //
    private String lockate;
    private String deptno;
    private String allops;
    private String createTime;
    private String creaBy;
    private String editTime;
    private String edit;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getLoginAct() {
        return loginAct;
    }

    public void setLoginAct(String loginAct) {
        this.loginAct = loginAct;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLoginPwd() {
        return loginPwd;
    }

    public void setLoginPwd(String loginPwd) {
        this.loginPwd = loginPwd;
    }

    public String getEmai() {
        return emai;
    }

    public void setEmai(String emai) {
        this.emai = emai;
    }

    public String getExpireTime() {
        return expireTime;
    }

    public void setExpireTime(String expireTime) {
        this.expireTime = expireTime;
    }

    public String getLockate() {
        return lockate;
    }

    public void setLockate(String lockate) {
        this.lockate = lockate;
    }

    public String getDeptno() {
        return deptno;
    }

    public void setDeptno(String deptno) {
        this.deptno = deptno;
    }

    public String getAllops() {
        return allops;
    }

    public void setAllops(String allops) {
        this.allops = allops;
    }

    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    public String getCreaBy() {
        return creaBy;
    }

    public void setCreaBy(String creaBy) {
        this.creaBy = creaBy;
    }

    public String getEditTime() {
        return editTime;
    }

    public void setEditTime(String editTime) {
        this.editTime = editTime;
    }

    public String getEdit() {
        return edit;
    }

    public void setEdit(String edit) {
        this.edit = edit;
    }
}
