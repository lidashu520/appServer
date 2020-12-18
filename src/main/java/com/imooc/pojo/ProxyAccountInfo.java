package com.imooc.pojo;

import javax.persistence.*;

@Table(name = "proxy_account_info")
public class ProxyAccountInfo {
    /**
     * 编号
     */
    @Id
    private Integer id;

    /**
     * 代理id
     */
    @Column(name = "proxy_id")
    private Integer proxyId;

    /**
     * 代理真实姓名
     */
    private String name;

    /**
     * 微信号
     */
    @Column(name = "wechat_account")
    private String wechatAccount;

    /**
     * 支付宝帐号
     */
    @Column(name = "alipay_account")
    private String alipayAccount;

    /**
     * 银行卡号
     */
    @Column(name = "bank_account")
    private String bankAccount;

    /**
     * 开户行名称
     */
    @Column(name = "bank_name")
    private String bankName;

    /**
     * 获取编号
     *
     * @return id - 编号
     */
    public Integer getId() {
        return id;
    }

    /**
     * 设置编号
     *
     * @param id 编号
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * 获取代理id
     *
     * @return proxy_id - 代理id
     */
    public Integer getProxyId() {
        return proxyId;
    }

    /**
     * 设置代理id
     *
     * @param proxyId 代理id
     */
    public void setProxyId(Integer proxyId) {
        this.proxyId = proxyId;
    }

    /**
     * 获取代理真实姓名
     *
     * @return name - 代理真实姓名
     */
    public String getName() {
        return name;
    }

    /**
     * 设置代理真实姓名
     *
     * @param name 代理真实姓名
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 获取微信号
     *
     * @return wechat_account - 微信号
     */
    public String getWechatAccount() {
        return wechatAccount;
    }

    /**
     * 设置微信号
     *
     * @param wechatAccount 微信号
     */
    public void setWechatAccount(String wechatAccount) {
        this.wechatAccount = wechatAccount;
    }

    /**
     * 获取支付宝帐号
     *
     * @return alipay_account - 支付宝帐号
     */
    public String getAlipayAccount() {
        return alipayAccount;
    }

    /**
     * 设置支付宝帐号
     *
     * @param alipayAccount 支付宝帐号
     */
    public void setAlipayAccount(String alipayAccount) {
        this.alipayAccount = alipayAccount;
    }

    /**
     * 获取银行卡号
     *
     * @return bank_account - 银行卡号
     */
    public String getBankAccount() {
        return bankAccount;
    }

    /**
     * 设置银行卡号
     *
     * @param bankAccount 银行卡号
     */
    public void setBankAccount(String bankAccount) {
        this.bankAccount = bankAccount;
    }

    /**
     * 获取开户行名称
     *
     * @return bank_name - 开户行名称
     */
    public String getBankName() {
        return bankName;
    }

    /**
     * 设置开户行名称
     *
     * @param bankName 开户行名称
     */
    public void setBankName(String bankName) {
        this.bankName = bankName;
    }
}