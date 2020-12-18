package com.imooc.pojo;

import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.serializer.SerializerFeature;
import java.io.Serializable;

public class JsonMsgBean implements Serializable {
    private static final long serialVersionUID = -8972819161141262263L;

    private Boolean success;// 是否成功

    private String code; // 错误码

    private String msg; // 消息

    private Object data; // 数据

    public JsonMsgBean(Boolean success) {
        super();
        this.success = success;
    }

    @Override
    public String toString() {
        return "JsonMsgBean [success=" + success + ", code=" + code + ", msg="
                + msg + ", data=" + data + "]";
    }

    public JsonMsgBean(Boolean success, String msg) {
        super();
        this.success = success;
        this.msg = msg;
    }

    public JsonMsgBean(Boolean success, String code, String msg) {
        super();
        this.success = success;
        this.code = code;
        this.msg = msg;
    }

    public JsonMsgBean(Boolean success, String msg, Object data) {
        super();
        this.success = success;
        this.msg = msg;
        this.data = data;
    }

    public JsonMsgBean(Boolean success, String code, String msg, Object data) {
        super();
        this.success = success;
        this.code = code;
        this.msg = msg;
        this.data = data;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public JsonMsgBean() {
        super();
    }

    public String toJson() {
        String json = JSONObject.toJSONString(this,
                SerializerFeature.DisableCircularReferenceDetect);
        return json;
    }

    public Boolean getSuccess() {
        return success;
    }

    public void setSuccess(Boolean success) {
        this.success = success;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public void setMsg(Boolean success, String msg) {
        this.success = success;
        this.msg = msg;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public String getMsg() {
        return msg;
    }
}
