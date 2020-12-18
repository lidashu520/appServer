package com.imooc.mapper;

import com.imooc.pojo.SysUser;
import com.imooc.utils.MyMapper;
import org.apache.ibatis.annotations.Param;

public interface SysUserMapper extends MyMapper<SysUser> {
     void reduceAge(@Param("userId") String userId, int reduceAge);
}