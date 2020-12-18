package com.imooc.mapper;

import com.imooc.pojo.ProxyAccountInfo;
import com.imooc.utils.MyMapper;

import java.util.List;

public interface ProxyAccountInfoMapper extends MyMapper<ProxyAccountInfo> {
    List<ProxyAccountInfo> queryProxyAccountInfoListByPage(int page);

    int queryProxyAccountInfoCount();
}