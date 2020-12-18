package com.imooc.controller;

import com.alibaba.fastjson.JSONObject;
import com.imooc.mapper.PlatUserMapper;
import com.imooc.pojo.JsonMsgBean;
import com.imooc.pojo.PlatUser;
import com.imooc.service.PlatUserService;
import com.imooc.utils.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;
import java.util.HashMap;

@CrossOrigin
@RestController
@RequestMapping("/platUser")
public class PlatUserContoller {

	@Autowired
	private StringRedisTemplate strRedis;

	@Autowired
	private RedisOperator redis;

	@Autowired
	private PlatUserService platUserService;

	@Autowired
	private PlatUserMapper platUserMapper;


	@RequestMapping("/login")
	public JsonMsgBean login(@RequestBody HashMap<String,String> loginParams) {
		String phone = loginParams.get("name");
		String pwd = loginParams.get("pwd");
		PlatUser platUser = platUserMapper.queryUserByPhone(phone);
		JsonMsgBean jsonMsgBean = new JsonMsgBean();
		JSONObject json =new JSONObject();
		if(platUser!=null&&platUser.getPhone().equals(pwd)){
			String token = StringHelper.randUUID();
			redis.set(ConstantUtil.VERSION_GLOBAL_SERVER_LOGIN_USER + phone , token, 100);
			// 将用户数据放置到redis中,方便gate服务器直接从redis中获取用户数据
			json.put("token", token);
			jsonMsgBean.setCode("200");
			jsonMsgBean.setSuccess(true);
			jsonMsgBean.setMsg("登陆成功");
			jsonMsgBean.setData(json);
		}else {
			json.put("token", "");
			jsonMsgBean.setCode("201");
			jsonMsgBean.setSuccess(false);
			jsonMsgBean.setMsg("登陆失败");
			jsonMsgBean.setData(json);
		}
		return  jsonMsgBean;
	}

	@RequestMapping("/register")
	public JsonMsgBean register(@RequestBody HashMap<String,String> regParams) {
		String phone = regParams.get("phone");
		String smsCode = regParams.get("smsCode");
		String pwd = regParams.get("pwdTwo");
		JsonMsgBean jsonMsgBean = new JsonMsgBean();
		JSONObject json =new JSONObject();
			// 验证手机号码
			// 验证验证码
//			String check = (String) JedisUtils.getObject("check_" + phone);
//			if (!checkcode.equals(check)) {
//				result.put("code", 201);
//				result.put("msg", "验证码不正确");
//			}
			// 验证手机号是否存在
		PlatUser platUser = platUserMapper.queryUserByPhone(phone);
			if (platUser!=null && platUser.getPhone().length()==11) {
				jsonMsgBean.setCode("201");
				jsonMsgBean.setSuccess(false);
				jsonMsgBean.setMsg("该手机号码已经注册过了");
				jsonMsgBean.setData(json);
				return jsonMsgBean;
			}
			try {
				// 生成用户密码串
				String fencrpty = IdGen.randomBase62(6);
				// 生成用户密码
//				String fpass = MD5Utils.getPassword(pwd, fencrpty);
				// 添加用户
				PlatUser player = new PlatUser();
				player.setFcode(pwd);
				player.setWxpass("0");
				player.setWxuid("0");
				player.setIsonline(0);
				player.setFencrpty(fencrpty);
				player.setVip(0);
				player.setLgtime(new Date());
				player.setHead(-1);
				player.setHeadurl("www.baidu.com");
				player.setNick("");
				player.setGener(1);
				player.setName(phone);
				player.setPhone(phone);
				player.setEmail("");
				player.setFusertype(1);
				player.setRegistertime(new Date());
				player.setIpaddress("");
				player.setAddress("");
				player.setLv(0);
				player.setExp(0);
				player.setIdentityNo("0");
				platUserService.saveUser(player);
			} catch (Exception e) {
				e.printStackTrace();
				jsonMsgBean.setCode("501");
				jsonMsgBean.setSuccess(false);
				jsonMsgBean.setMsg("服务器系统异常");
				jsonMsgBean.setData(json);
				return jsonMsgBean;
			}
		    jsonMsgBean.setCode("200");
		    jsonMsgBean.setSuccess(true);
		    jsonMsgBean.setMsg("注册成功");
		    jsonMsgBean.setData(json);

		return  jsonMsgBean;






	}








}
