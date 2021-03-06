package com.imooc.controller;

import com.alibaba.fastjson.JSONObject;
import com.imooc.mapper.ProxyAccountInfoMapper;
import com.imooc.pojo.JsonMsgBean;
import com.imooc.pojo.ProxyAccountInfo;
import com.imooc.service.ProxyInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.HashMap;
import java.util.List;

@CrossOrigin
@RestController
@RequestMapping("/info")
public class ProxyInfoContoller {


	@Autowired
	private ProxyInfoService proxyInfoService;

	@Autowired
	private ProxyAccountInfoMapper proxyAccountInfoMapper;


//	@RequestMapping("/queryPage")
//	public JsonMsgBean queryPage(@RequestBody HashMap<String,String> params) {
//		ProxyAccountInfo proxyAccountInfo = new ProxyAccountInfo();
//		List<ProxyAccountInfo> pageList = proxyInfoService.queryProxyAccountInfoList(proxyAccountInfo);
//		JsonMsgBean jsonMsgBean = new JsonMsgBean();
//		jsonMsgBean.setData(pageList);
//		return  jsonMsgBean;
//	}

	@RequestMapping("/queryPage")
	public JsonMsgBean queryPage() {
		ProxyAccountInfo proxyAccountInfo = new ProxyAccountInfo();
		List<ProxyAccountInfo> pageList = proxyInfoService.queryProxyAccountInfoList(proxyAccountInfo);
		JsonMsgBean jsonMsgBean = new JsonMsgBean();
		jsonMsgBean.setData(pageList);
		jsonMsgBean.setCode("200");
		return  jsonMsgBean;
	}

	@RequestMapping("/page")
	public JsonMsgBean queryPage(@RequestBody HashMap<String,String> params) {
		int page = Integer.valueOf(String.valueOf(params.get("page")));
		page = (page-1) * 20;
		int count = (proxyInfoService.queryProxyAccountInfoCount()/20) + 1;
		List<ProxyAccountInfo> pageList = proxyInfoService.queryProxyAccountInfoListByPage(page);
		JsonMsgBean jsonMsgBean = new JsonMsgBean();
		JSONObject jsonObject = new JSONObject();
		jsonObject.put("data",pageList);
		jsonObject.put("totalPage",count);
		jsonMsgBean.setSuccess(true);
		jsonMsgBean.setData(jsonObject);
		jsonMsgBean.setCode("200");
		jsonMsgBean.setMsg("交易成功");
		return  jsonMsgBean;
	}








}
