package com.imooc.service.impl;

import com.imooc.mapper.ProxyAccountInfoMapper;
import com.imooc.pojo.PlatUser;
import com.imooc.pojo.ProxyAccountInfo;
import com.imooc.service.ProxyInfoService;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tk.mybatis.mapper.entity.Example;

import java.util.List;

@Service
public class ProxyInfoServiceImpl implements ProxyInfoService{
    @Autowired
    private ProxyAccountInfoMapper proxyAccountInfoMapper;

    @Override
    public void saveProxyAccountInfo(ProxyAccountInfo proxyAccountInfo) {
        proxyAccountInfoMapper.insert(proxyAccountInfo);
    }

    @Override
    public void updateProxyAccountInfo(ProxyAccountInfo proxyAccountInfo) {
        proxyAccountInfoMapper.updateByPrimaryKey(proxyAccountInfo);
    }

    @Override
    public void deleteProxyAccountInfo(String Id) {
        proxyAccountInfoMapper.deleteByPrimaryKey(Id);
    }

    @Override
    public ProxyAccountInfo queryProxyAccountInfoById(String Id) {

        return proxyAccountInfoMapper.selectByPrimaryKey(Id);
    }

    @Override
    public List<ProxyAccountInfo> queryProxyAccountInfoList(ProxyAccountInfo proxyAccountInfo) {

        Example example = new Example(ProxyAccountInfo.class);
        Example.Criteria criteria = example.createCriteria();

        if (StringUtils.isNotBlank(proxyAccountInfo.getName())) {
            criteria.andEqualTo("name",proxyAccountInfo.getName());
        }
        List<ProxyAccountInfo> proxyAccountInfoList = proxyAccountInfoMapper.selectByExample(example);
        return  proxyAccountInfoList;
    }

    @Override
    public List<ProxyAccountInfo> queryProxyAccountInfoListByPage(int page) {

        return proxyAccountInfoMapper.queryProxyAccountInfoListByPage(page);
    }

    @Override
    public int queryProxyAccountInfoCount() {
        return proxyAccountInfoMapper.queryProxyAccountInfoCount();
    }
}
