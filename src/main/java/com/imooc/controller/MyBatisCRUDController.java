package com.imooc.controller;

import java.util.Date;
import java.util.List;
import java.util.concurrent.Semaphore;

import org.n3r.idworker.Sid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.imooc.pojo.IMoocJSONResult;
import com.imooc.pojo.SysUser;
import com.imooc.service.UserService;

@RestController
@RequestMapping("mybatis")
public class MyBatisCRUDController {
	
	@Autowired
	private UserService userService;
	
	@Autowired
	private Sid sid;

	//处理并发事件
	//定义资源的总数量
	Semaphore semaphore=new Semaphore(5,true);
	
	@RequestMapping("/saveUser")
	public IMoocJSONResult saveUser() throws Exception {
		
		String userId = sid.nextShort();
		
		SysUser user = new SysUser();
		user.setId(userId);
		user.setUsername("imooc" + new Date());
		user.setNickname("imooc" + new Date());
		user.setPassword("abc123");
		user.setIsDelete(0);
		user.setRegistTime(new Date());
		
		userService.saveUser(user);
		
		return IMoocJSONResult.ok("保存成功");
	}
	
	@RequestMapping("/updateUser")
	public IMoocJSONResult updateUser() {
		
		SysUser user = new SysUser();
		user.setId("10011001");
		user.setUsername("10011001-updated" + new Date());
		user.setNickname("10011001-updated" + new Date());
		user.setPassword("10011001-updated");
		user.setIsDelete(0);
		user.setRegistTime(new Date());
		
		userService.updateUser(user);
		
		return IMoocJSONResult.ok("保存成功");
	}
	
	@RequestMapping("/deleteUser")
	public IMoocJSONResult deleteUser(String userId) {
		
		userService.deleteUser(userId);
		
		return IMoocJSONResult.ok("删除成功");
	}
	
	@RequestMapping("/queryUserById")
	public IMoocJSONResult queryUserById(String userId) {
		
		return IMoocJSONResult.ok(userService.queryUserById(userId));
	}
	
	@RequestMapping("/queryUserList")
	public IMoocJSONResult queryUserList() {
		
		SysUser user = new SysUser();
		user.setUsername("imooc");
		user.setNickname("lee");
		
		List<SysUser> userList = userService.queryUserList(user);
		
		return IMoocJSONResult.ok(userList);
	}
	
	@RequestMapping("/queryUserListPaged")
	public IMoocJSONResult queryUserListPaged(Integer page) {
		
		if (page == null) {
			page = 1;
		}

		int pageSize = 10;
		
		SysUser user = new SysUser();
//		user.setNickname("lee");
		
		List<SysUser> userList = userService.queryUserListPaged(user, page, pageSize);
		
		return IMoocJSONResult.ok(userList);
	}
	
	@RequestMapping("/queryUserByIdCustom")
	public IMoocJSONResult queryUserByIdCustom(String userId) {
		
		return IMoocJSONResult.ok(userService.queryUserByIdCustom(userId));
	}
	
	@RequestMapping("/saveUserTransactional")
	public IMoocJSONResult saveUserTransactional() {

		String userNoId = sid.nextShort();

		SysUser userNo = new SysUser();
		userNo.setId(userNoId);
		userNo.setUsername("lee1" + new Date());
		userNo.setNickname("lee1" + new Date());
		userNo.setPassword("1abc123");
		userNo.setIsDelete(0);
		userNo.setRegistTime(new Date());
		try {
			userService.saveUser2(userNo);
		}catch (Exception e){
			e.printStackTrace();
		}
		System.out.println("============事务require执行=====");
		String userId = sid.nextShort();

		SysUser user = new SysUser();
		user.setId(userId);
		user.setUsername("lee" + new Date());
		user.setNickname("lee" + new Date());
		user.setPassword("abc123");
		user.setIsDelete(0);
		user.setRegistTime(new Date());

		try {
			userService.saveUserTransactional(user);
		}catch (Exception e){
			e.printStackTrace();
			System.out.println("插入数据库异常");
			throw new NullPointerException("失败new");
		}
		System.out.println("插入数据成功");
		return IMoocJSONResult.ok("保存成功");
	}






	@RequestMapping("/trans")
	public IMoocJSONResult trans() {
            userService.parent();
            int i= 1/0;
		return IMoocJSONResult.ok("保存成功");
	}

	@RequestMapping("/reduce")
	public String reduce(String userId) {
        boolean flag=false;
		int availablePermits = semaphore.availablePermits();
		System.out.println("可用资源数量---"+availablePermits);
		if(availablePermits>0) {
			System.out.println("抢到资源****根据id修改该图书的库存");
			try {
				//请求占用一个资源
				semaphore.acquire();
				//根据id修改该图书的库存
				SysUser user=userService.queryUserById(userId);
				if(user.getAge()>0){
					userService.reduceAge(userId,1);
					System.out.println("根据id修改该图书的库存完成");
					flag=true;
				}

			}catch (Exception e) {
				e.printStackTrace();
			}finally {
				//释放一个资源
				semaphore.release();
			}
			if(flag){
				return "success";
			}
			return "库存不够!!!";
		}else {
			System.out.println("*********资源已被占用，稍后再试***********");
			return "*********资源已被占用，稍后再试***********";
		}
	}


	@RequestMapping("/reg")
	public IMoocJSONResult reg(SysUser user) {

		String userNoId = sid.nextShort();

		SysUser userNew = new SysUser();
		userNew.setId(userNoId);
		userService.saveUser(userNew);
		return IMoocJSONResult.ok("success");
	}


}
