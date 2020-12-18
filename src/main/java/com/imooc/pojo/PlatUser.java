package com.imooc.pojo;

import java.util.Date;
import javax.persistence.*;

@Table(name = "plat_user")
public class PlatUser {
    /**
     * 关键字
     */
    @Id
    private Integer id;

    /**
     * 登录生成密码
     */
    private String fcode;

    /**
     * 微信ID
     */
    private String wxpass;

    /**
     * 微信登录uid
     */
    private String wxuid;

    /**
     * 是否在线0不在线，1在线
     */
    private Integer isonline;

    /**
     * 加密串
     */
    private String fencrpty;

    /**
     * 用户vip等级
     */
    private Integer vip;

    /**
     * 用户最后登录时间
     */
    private Date lgtime;

    /**
     * 用户头像
     */
    private Integer head;

    /**
     * 用户头像
     */
    private String headurl;

    private String nick;

    /**
     * 姓别
     */
    private Integer gener;

    /**
     * 真实姓名
     */
    private String name;

    /**
     * 联系电话
     */
    private String phone;

    /**
     * 用户邮箱
     */
    private String email;

    /**
     * 用户类型(10000是管理员),1000为代理
     */
    private Integer fusertype;

    /**
     * 注册时间
     */
    private Date registertime;

    /**
     * 用户IP地址
     */
    private String ipaddress;

    /**
     * 用户地址
     */
    private String address;

    /**
     * 等级
     */
    private Integer lv;

    /**
     * 用户经验值
     */
    private Integer exp;

    /**
     * 身份证号码
     */
    @Column(name = "identity_no")
    private String identityNo;

    /**
     * 获取关键字
     *
     * @return id - 关键字
     */
    public Integer getId() {
        return id;
    }

    /**
     * 设置关键字
     *
     * @param id 关键字
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * 获取登录生成密码
     *
     * @return fcode - 登录生成密码
     */
    public String getFcode() {
        return fcode;
    }

    /**
     * 设置登录生成密码
     *
     * @param fcode 登录生成密码
     */
    public void setFcode(String fcode) {
        this.fcode = fcode;
    }

    /**
     * 获取微信ID
     *
     * @return wxpass - 微信ID
     */
    public String getWxpass() {
        return wxpass;
    }

    /**
     * 设置微信ID
     *
     * @param wxpass 微信ID
     */
    public void setWxpass(String wxpass) {
        this.wxpass = wxpass;
    }

    /**
     * 获取微信登录uid
     *
     * @return wxuid - 微信登录uid
     */
    public String getWxuid() {
        return wxuid;
    }

    /**
     * 设置微信登录uid
     *
     * @param wxuid 微信登录uid
     */
    public void setWxuid(String wxuid) {
        this.wxuid = wxuid;
    }

    /**
     * 获取是否在线0不在线，1在线
     *
     * @return isonline - 是否在线0不在线，1在线
     */
    public Integer getIsonline() {
        return isonline;
    }

    /**
     * 设置是否在线0不在线，1在线
     *
     * @param isonline 是否在线0不在线，1在线
     */
    public void setIsonline(Integer isonline) {
        this.isonline = isonline;
    }

    /**
     * 获取加密串
     *
     * @return fencrpty - 加密串
     */
    public String getFencrpty() {
        return fencrpty;
    }

    /**
     * 设置加密串
     *
     * @param fencrpty 加密串
     */
    public void setFencrpty(String fencrpty) {
        this.fencrpty = fencrpty;
    }

    /**
     * 获取用户vip等级
     *
     * @return vip - 用户vip等级
     */
    public Integer getVip() {
        return vip;
    }

    /**
     * 设置用户vip等级
     *
     * @param vip 用户vip等级
     */
    public void setVip(Integer vip) {
        this.vip = vip;
    }

    /**
     * 获取用户最后登录时间
     *
     * @return lgtime - 用户最后登录时间
     */
    public Date getLgtime() {
        return lgtime;
    }

    /**
     * 设置用户最后登录时间
     *
     * @param lgtime 用户最后登录时间
     */
    public void setLgtime(Date lgtime) {
        this.lgtime = lgtime;
    }

    /**
     * 获取用户头像
     *
     * @return head - 用户头像
     */
    public Integer getHead() {
        return head;
    }

    /**
     * 设置用户头像
     *
     * @param head 用户头像
     */
    public void setHead(Integer head) {
        this.head = head;
    }

    /**
     * 获取用户头像
     *
     * @return headurl - 用户头像
     */
    public String getHeadurl() {
        return headurl;
    }

    /**
     * 设置用户头像
     *
     * @param headurl 用户头像
     */
    public void setHeadurl(String headurl) {
        this.headurl = headurl;
    }

    /**
     * @return nick
     */
    public String getNick() {
        return nick;
    }

    /**
     * @param nick
     */
    public void setNick(String nick) {
        this.nick = nick;
    }

    /**
     * 获取姓别
     *
     * @return gener - 姓别
     */
    public Integer getGener() {
        return gener;
    }

    /**
     * 设置姓别
     *
     * @param gener 姓别
     */
    public void setGener(Integer gener) {
        this.gener = gener;
    }

    /**
     * 获取真实姓名
     *
     * @return name - 真实姓名
     */
    public String getName() {
        return name;
    }

    /**
     * 设置真实姓名
     *
     * @param name 真实姓名
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 获取联系电话
     *
     * @return phone - 联系电话
     */
    public String getPhone() {
        return phone;
    }

    /**
     * 设置联系电话
     *
     * @param phone 联系电话
     */
    public void setPhone(String phone) {
        this.phone = phone;
    }

    /**
     * 获取用户邮箱
     *
     * @return email - 用户邮箱
     */
    public String getEmail() {
        return email;
    }

    /**
     * 设置用户邮箱
     *
     * @param email 用户邮箱
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * 获取用户类型(10000是管理员),1000为代理
     *
     * @return fusertype - 用户类型(10000是管理员),1000为代理
     */
    public Integer getFusertype() {
        return fusertype;
    }

    /**
     * 设置用户类型(10000是管理员),1000为代理
     *
     * @param fusertype 用户类型(10000是管理员),1000为代理
     */
    public void setFusertype(Integer fusertype) {
        this.fusertype = fusertype;
    }

    /**
     * 获取注册时间
     *
     * @return registertime - 注册时间
     */
    public Date getRegistertime() {
        return registertime;
    }

    /**
     * 设置注册时间
     *
     * @param registertime 注册时间
     */
    public void setRegistertime(Date registertime) {
        this.registertime = registertime;
    }

    /**
     * 获取用户IP地址
     *
     * @return ipaddress - 用户IP地址
     */
    public String getIpaddress() {
        return ipaddress;
    }

    /**
     * 设置用户IP地址
     *
     * @param ipaddress 用户IP地址
     */
    public void setIpaddress(String ipaddress) {
        this.ipaddress = ipaddress;
    }

    /**
     * 获取用户地址
     *
     * @return address - 用户地址
     */
    public String getAddress() {
        return address;
    }

    /**
     * 设置用户地址
     *
     * @param address 用户地址
     */
    public void setAddress(String address) {
        this.address = address;
    }

    /**
     * 获取等级
     *
     * @return lv - 等级
     */
    public Integer getLv() {
        return lv;
    }

    /**
     * 设置等级
     *
     * @param lv 等级
     */
    public void setLv(Integer lv) {
        this.lv = lv;
    }

    /**
     * 获取用户经验值
     *
     * @return exp - 用户经验值
     */
    public Integer getExp() {
        return exp;
    }

    /**
     * 设置用户经验值
     *
     * @param exp 用户经验值
     */
    public void setExp(Integer exp) {
        this.exp = exp;
    }

    /**
     * 获取身份证号码
     *
     * @return identity_no - 身份证号码
     */
    public String getIdentityNo() {
        return identityNo;
    }

    /**
     * 设置身份证号码
     *
     * @param identityNo 身份证号码
     */
    public void setIdentityNo(String identityNo) {
        this.identityNo = identityNo;
    }
}