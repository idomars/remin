package me.remin.entity;

import java.util.Date;
import javax.persistence.*;

@Table(name = "t_user")
public class Users {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String id;

    /**
     * 用户账号
     */
    @Column(name = "login_name")
    private String loginName;

    /**
     * 用户密码
     */
    private String password;

    /**
     * 用户昵称
     */
    @Column(name = "nick_name")
    private String nickName;

    /**
     * 用户网址
     */
    @Column(name = "user_url")
    private String userUrl;

    /**
     * 用户手机号
     */
    private String mobile;

    /**
     * 性别
     */
    private String gender;

    /**
     * 邮箱
     */
    private String email;

    /**
     * QQ
     */
    private String qq;

    /**
     * 微信
     */
    private String wechat;

    /**
     * 用户头像
     */
    @Column(name = "head_img")
    private String headImg;

    /**
     * 个人说明
     */
    @Column(name = "user_statement")
    private String userStatement;

    @Column(name = "register_time")
    private Date registerTime;

    /**
     * @return id
     */
    public String getId() {
        return id;
    }

    /**
     * @param id
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * 获取用户账号
     *
     * @return login_name - 用户账号
     */
    public String getLoginName() {
        return loginName;
    }

    /**
     * 设置用户账号
     *
     * @param loginName 用户账号
     */
    public void setLoginName(String loginName) {
        this.loginName = loginName;
    }

    /**
     * 获取用户密码
     *
     * @return password - 用户密码
     */
    public String getPassword() {
        return password;
    }

    /**
     * 设置用户密码
     *
     * @param password 用户密码
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * 获取用户昵称
     *
     * @return nick_name - 用户昵称
     */
    public String getNickName() {
        return nickName;
    }

    /**
     * 设置用户昵称
     *
     * @param nickName 用户昵称
     */
    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    /**
     * 获取用户网址
     *
     * @return user_url - 用户网址
     */
    public String getUserUrl() {
        return userUrl;
    }

    /**
     * 设置用户网址
     *
     * @param userUrl 用户网址
     */
    public void setUserUrl(String userUrl) {
        this.userUrl = userUrl;
    }

    /**
     * 获取用户手机号
     *
     * @return mobile - 用户手机号
     */
    public String getMobile() {
        return mobile;
    }

    /**
     * 设置用户手机号
     *
     * @param mobile 用户手机号
     */
    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    /**
     * 获取性别
     *
     * @return gender - 性别
     */
    public String getGender() {
        return gender;
    }

    /**
     * 设置性别
     *
     * @param gender 性别
     */
    public void setGender(String gender) {
        this.gender = gender;
    }

    /**
     * 获取邮箱
     *
     * @return email - 邮箱
     */
    public String getEmail() {
        return email;
    }

    /**
     * 设置邮箱
     *
     * @param email 邮箱
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * 获取QQ
     *
     * @return qq - QQ
     */
    public String getQq() {
        return qq;
    }

    /**
     * 设置QQ
     *
     * @param qq QQ
     */
    public void setQq(String qq) {
        this.qq = qq;
    }

    /**
     * 获取微信
     *
     * @return wechat - 微信
     */
    public String getWechat() {
        return wechat;
    }

    /**
     * 设置微信
     *
     * @param wechat 微信
     */
    public void setWechat(String wechat) {
        this.wechat = wechat;
    }

    /**
     * 获取用户头像
     *
     * @return head_img - 用户头像
     */
    public String getHeadImg() {
        return headImg;
    }

    /**
     * 设置用户头像
     *
     * @param headImg 用户头像
     */
    public void setHeadImg(String headImg) {
        this.headImg = headImg;
    }

    /**
     * 获取个人说明
     *
     * @return user_statement - 个人说明
     */
    public String getUserStatement() {
        return userStatement;
    }

    /**
     * 设置个人说明
     *
     * @param userStatement 个人说明
     */
    public void setUserStatement(String userStatement) {
        this.userStatement = userStatement;
    }

    /**
     * @return register_time
     */
    public Date getRegisterTime() {
        return registerTime;
    }

    /**
     * @param registerTime
     */
    public void setRegisterTime(Date registerTime) {
        this.registerTime = registerTime;
    }
}