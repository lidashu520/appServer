package com.imooc.service;

import com.imooc.pojo.ProxyAccountInfo;

import java.util.List;

public interface ProxyInfoService {

	public void saveProxyAccountInfo(ProxyAccountInfo proxyAccountInfo);

	public void updateProxyAccountInfo(ProxyAccountInfo proxyAccountInfo);

	public void deleteProxyAccountInfo(String Id);

	public ProxyAccountInfo queryProxyAccountInfoById(String Id);

	public List<ProxyAccountInfo> queryProxyAccountInfoList(ProxyAccountInfo proxyAccountInfo);

	public List<ProxyAccountInfo> queryProxyAccountInfoListByPage(int page);

	int queryProxyAccountInfoCount();
}
