package com.imooc.service.impl;

import java.util.Date;
import java.util.List;

import org.apache.commons.lang3.StringUtils;
import org.n3r.idworker.Sid;
import org.springframework.aop.framework.AopContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import com.github.pagehelper.PageHelper;
import com.imooc.mapper.SysUserMapper;
import com.imooc.mapper.SysUserMapperCustom;
import com.imooc.pojo.SysUser;
import com.imooc.service.UserService;
import tk.mybatis.mapper.entity.Example;

@Service
public class    UserServiceImpl implements UserService{

	@Autowired
	private SysUserMapper userMapper;
	
	@Autowired
	private SysUserMapperCustom userMapperCustom;

	@Autowired
	private Sid sid;
	
	@Override
	@Transactional(propagation = Propagation.REQUIRED)
	public void saveUser2(SysUser user) throws Exception {
		
		try {
			Thread.sleep(4000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		userMapper.insert(user);
	}

    @Override
	@Transactional(propagation = Propagation.REQUIRED)
	public void updateUser(SysUser user) {
//		userMapper.updateByPrimaryKeySelective(user);
		userMapper.updateByPrimaryKey(user);
	}

	@Override
	@Transactional(propagation = Propagation.REQUIRED)
	public void deleteUser(String userId) {
		userMapper.deleteByPrimaryKey(userId);
	}

	@Override
	@Transactional(propagation = Propagation.SUPPORTS)
	public SysUser queryUserById(String userId) {
		
//		try {
//			Thread.sleep(6000);
//		} catch (InterruptedException e) {
//			e.printStackTrace();
//		}
		
		return userMapper.selectByPrimaryKey(userId);
	}

	@Override
	@Transactional(propagation = Propagation.SUPPORTS)
	public List<SysUser> queryUserList(SysUser user) {
		
		try {
			Thread.sleep(11000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		Example example = new Example(SysUser.class);
		Example.Criteria criteria = example.createCriteria();
		
		if (StringUtils.isNotBlank(user.getUsername())) {
			criteria.andLike("username", "%" + user.getUsername() + "%");
		}
		
		if (StringUtils.isNotBlank(user.getNickname())) {
			criteria.andLike("nickname", "%" + user.getNickname() + "%");
		}
		
		List<SysUser> userList = userMapper.selectByExample(example);
		
		return userList;
	}
	
	@Override
	@Transactional(propagation = Propagation.SUPPORTS)
	public List<SysUser> queryUserListPaged(SysUser user, Integer page, Integer pageSize) {
		// 开始分页
        PageHelper.startPage(page, pageSize);
		
		Example example = new Example(SysUser.class);
		Example.Criteria criteria = example.createCriteria();
		
		if (StringUtils.isNotBlank(user.getNickname())) {
			criteria.andLike("nickname", "%" + user.getNickname() + "%");
		}
		example.orderBy("registTime").desc();
		List<SysUser> userList = userMapper.selectByExample(example);
		
		return userList;
	}
	
	@Override
	@Transactional(propagation = Propagation.SUPPORTS)
	public SysUser queryUserByIdCustom(String userId) {
		
		List<SysUser> userList = userMapperCustom.queryUserSimplyInfoById(userId);
		
		if (userList != null && !userList.isEmpty()) {
			return (SysUser)userList.get(0);
		}
		
		return null;
	}
	
	@Override
	@Transactional(propagation = Propagation.REQUIRES_NEW)
	public void saveUserTransactional(SysUser user) {
        String userNoId = sid.nextShort();
        SysUser userNo = new SysUser();
        userNo.setId(userNoId);
        userNo.setUsername("lee2" + new Date());
        userNo.setNickname("lee2" + new Date());
        userNo.setPassword("1abc123");
        userNo.setIsDelete(0);
        userNo.setRegistTime(new Date());
		userMapper.insert(userNo);
//     	int i = 1/0;
		userMapper.updateByPrimaryKeySelective(userNo);

	}

	@Transactional(propagation = Propagation.REQUIRED)
	public void parent() {
            String userNoId = sid.nextShort();
            SysUser userNo = new SysUser();
            userNo.setId(userNoId);
            userNo.setUsername("lee1" + new Date());
            userNo.setNickname("lee1" + new Date());
            userNo.setPassword("1abc123");
            userNo.setIsDelete(0);
            userNo.setRegistTime(new Date());
            userMapper.insert(userNo);
            userMapper.updateByPrimaryKeySelective(userNo);
//        this.saveUserTransactional(new SysUser());
//        this.child();
//        ((UserServiceImpl)AopContext.currentProxy()).saveUserTransactional(new SysUser());
		  ((UserServiceImpl)AopContext.currentProxy()).saveUserTransactional(new SysUser());
		    try {
				((UserServiceImpl)AopContext.currentProxy()).child();
			}catch (Exception e){
		    	e.printStackTrace();
		    	throw new RuntimeException("抛出异常事务");
			}


	}

	@Override
	@Transactional(propagation = Propagation.REQUIRES_NEW)
	public void child() {
		String userNoId = sid.nextShort();
		SysUser userNo = new SysUser();
		userNo.setId(userNoId);
		userNo.setUsername("lee3" + new Date());
		userNo.setNickname("lee3" + new Date());
		userNo.setPassword("1abc123");
		userNo.setIsDelete(0);
		userNo.setRegistTime(new Date());
		userMapper.insert(userNo);
		userMapper.updateByPrimaryKeySelective(userNo);
//		try {
//			int i=1/0;
//		}catch (Exception e){
//			e.printStackTrace();
//		}

		int i= 1/0;

	}

	@Override
	@Transactional(propagation = Propagation.REQUIRED)
	public void reduceAge(String userId, int reduceAge) {
       userMapper.reduceAge(userId,reduceAge);
	}

    @Override
    @Transactional(propagation = Propagation.REQUIRED)
    public void saveUser(SysUser user) {
        userMapper.insert(user);
    }


}
