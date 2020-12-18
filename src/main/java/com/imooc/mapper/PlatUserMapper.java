package com.imooc.mapper;

import com.imooc.pojo.PlatUser;
import com.imooc.utils.MyMapper;

public interface PlatUserMapper extends MyMapper<PlatUser> {
    PlatUser queryUserByPhone(String phone);
}