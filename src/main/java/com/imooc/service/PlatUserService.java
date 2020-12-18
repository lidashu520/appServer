package com.imooc.service;

import com.imooc.pojo.PlatUser;

import java.util.List;

public interface PlatUserService {

	public void saveUser(PlatUser platUser);

	public void updateUser(PlatUser platUser);

	public void deleteUser(String Id);

	public PlatUser queryUserById(String Id);

	public List<PlatUser> queryUserList(PlatUser platUser);

	public PlatUser queryUserByPhone(String phone);

}
