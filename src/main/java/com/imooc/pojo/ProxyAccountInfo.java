package com.imooc.pojo;

import javax.persistence.*;

@Table(name = "proxy_account_info")
public class ProxyAccountInfo {
    /**
     * ���
     */
    @Id
    private Integer id;

    /**
     * ����id
     */
    @Column(name = "proxy_id")
    private Integer proxyId;

    /**
     * ������ʵ����
     */
    private String name;

    /**
     * ΢�ź�
     */
    @Column(name = "wechat_account")
    private String wechatAccount;

    /**
     * ֧�����ʺ�
     */
    @Column(name = "alipay_account")
    private String alipayAccount;

    /**
     * ���п���
     */
    @Column(name = "bank_account")
    private String bankAccount;

    /**
     * ����������
     */
    @Column(name = "bank_name")
    private String bankName;

    /**
     * ��ȡ���
     *
     * @return id - ���
     */
    public Integer getId() {
        return id;
    }

    /**
     * ���ñ��
     *
     * @param id ���
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * ��ȡ����id
     *
     * @return proxy_id - ����id
     */
    public Integer getProxyId() {
        return proxyId;
    }

    /**
     * ���ô���id
     *
     * @param proxyId ����id
     */
    public void setProxyId(Integer proxyId) {
        this.proxyId = proxyId;
    }

    /**
     * ��ȡ������ʵ����
     *
     * @return name - ������ʵ����
     */
    public String getName() {
        return name;
    }

    /**
     * ���ô�����ʵ����
     *
     * @param name ������ʵ����
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * ��ȡ΢�ź�
     *
     * @return wechat_account - ΢�ź�
     */
    public String getWechatAccount() {
        return wechatAccount;
    }

    /**
     * ����΢�ź�
     *
     * @param wechatAccount ΢�ź�
     */
    public void setWechatAccount(String wechatAccount) {
        this.wechatAccount = wechatAccount;
    }

    /**
     * ��ȡ֧�����ʺ�
     *
     * @return alipay_account - ֧�����ʺ�
     */
    public String getAlipayAccount() {
        return alipayAccount;
    }

    /**
     * ����֧�����ʺ�
     *
     * @param alipayAccount ֧�����ʺ�
     */
    public void setAlipayAccount(String alipayAccount) {
        this.alipayAccount = alipayAccount;
    }

    /**
     * ��ȡ���п���
     *
     * @return bank_account - ���п���
     */
    public String getBankAccount() {
        return bankAccount;
    }

    /**
     * �������п���
     *
     * @param bankAccount ���п���
     */
    public void setBankAccount(String bankAccount) {
        this.bankAccount = bankAccount;
    }

    /**
     * ��ȡ����������
     *
     * @return bank_name - ����������
     */
    public String getBankName() {
        return bankName;
    }

    /**
     * ���ÿ���������
     *
     * @param bankName ����������
     */
    public void setBankName(String bankName) {
        this.bankName = bankName;
    }
}