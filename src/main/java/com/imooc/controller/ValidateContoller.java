package com.imooc.controller;


import com.imooc.pojo.JsonMsgBean;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ValidateContoller {
	@RequestMapping("/validate")
	public JsonMsgBean validate(){
		JsonMsgBean jsonMsgBean = new JsonMsgBean();
		jsonMsgBean.setSuccess(true);
		jsonMsgBean.setCode("200");
		jsonMsgBean.setMsg("交易成功");
		return jsonMsgBean;
	}
}
