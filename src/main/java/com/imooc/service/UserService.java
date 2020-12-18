package com.imooc.service;

import java.util.List;

import com.imooc.pojo.SysUser;

public interface UserService {

	public void saveUser2(SysUser user) throws Exception;

	public void saveUser(SysUser user);

	public void updateUser(SysUser user);

	public void deleteUser(String userId);

	public SysUser queryUserById(String userId);

	public List<SysUser> queryUserList(SysUser user);

	public List<SysUser> queryUserListPaged(SysUser user, Integer page, Integer pageSize);

	public SysUser queryUserByIdCustom(String userId);
	
	public void saveUserTransactional(SysUser user);

	public void parent();

	public void child();

	public void reduceAge(String userId,int reduceAge);
}
