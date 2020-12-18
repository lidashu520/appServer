package com.imooc.controller;

import java.util.Date;
import java.util.HashMap;

import com.alibaba.fastjson.JSONObject;
import com.imooc.pojo.JsonMsgBean;
import com.imooc.utils.ConstantUtil;
import com.imooc.utils.RedisOperator;
import com.imooc.utils.StringHelper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.imooc.pojo.IMoocJSONResult;
import com.imooc.pojo.User;

@RestController
@RequestMapping("/user")
public class UserContoller {


	@Autowired
	private StringRedisTemplate strRedis;

	@Autowired
	private RedisOperator redis;

	@RequestMapping("/getUser")
	public User getUser() {
		
		User u = new User();
		u.setName("imooc2");
		u.setAge(18);
		u.setBirthday(new Date());
		u.setPassword("imooc2");
		u.setDesc("hello imooc2~~");
		
		return u;
	}
	
	@RequestMapping("/getUserJson")
	public IMoocJSONResult getUserJson() {
		
		User u = new User();
		u.setName("imooc");
		u.setAge(18);
		u.setBirthday(new Date());
		u.setPassword("imooc");
		u.setDesc("hello imooc~~hello imooc~~");
		
		return IMoocJSONResult.ok(u);
	}

	@RequestMapping("/login")
	public JsonMsgBean login(@RequestBody HashMap<String,String> loginParams) {
		String phone = loginParams.get("name");
		String pwd = loginParams.get("pwd");
		String token = StringHelper.randUUID();
		redis.set(ConstantUtil.VERSION_GLOBAL_SERVER_LOGIN_USER + phone , token, 100);
		// 将用户数据放置到redis中,方便gate服务器直接从redis中获取用户数据
		JSONObject json =new JSONObject();
		json.put("token", token);
		JsonMsgBean jsonMsgBean = new JsonMsgBean();
		jsonMsgBean.setCode("200");
		jsonMsgBean.setSuccess(true);
		jsonMsgBean.setMsg("登陆成功");
		jsonMsgBean.setData(json);
		return  jsonMsgBean;
	}








}
