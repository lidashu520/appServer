package com.imooc.controller.interceptor;


import com.imooc.utils.ConstantUtil;
import com.imooc.utils.RedisOperator;
import org.apache.commons.lang3.StringUtils;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.servlet.HandlerInterceptor;

import javax.servlet.http.HttpServletRequest;

import javax.servlet.http.HttpServletResponse;

/**

 * 自定义拦截器类

 */

public class MiniInterceptor implements HandlerInterceptor {
    @Autowired
    private RedisOperator redis;

// token规则为 user-reids-token:phone : UUID

    /**
     * 判断用户是否登录
     * <p>
     * 若用户phone不存在，则为未登录
     * <p>
     * 若用户phone存在，则判断token是否存在
     * <p>
     * 若存在，则用户状态为已登录
     * <p>
     * 若不存在，则用户状态为登录超时
     *
     * @param request
     * @param response
     * @param handler
     * @return
     * @throws Exception
     */

    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
// 如果是 嗅探请求，则直接放行

        if ("OPTIONS".equals(request.getMethod())) {
            return true;

        }

        String phone = request.getHeader("phone");

        String userOldToken = request.getHeader("token");

        if (StringUtils.isNotBlank(phone) && StringUtils.isNotBlank(userOldToken)) {
            String userTokenKey = ConstantUtil.USER_TOKEN_KEY + phone;
            String userToken = redis.get(userTokenKey);

// 用户有token，但最新token为空，说明登录状态过期

            if (StringUtils.isBlank(userToken)) {
//                returnErrorResponse(response,QiqvJSONResult.noAuth("登录过期，请重新登录"));
                System.out.println("登录过期，请重新登录");
                return false;

            }

// 两个token不一致，可能是恶意用户乱填token

            if (!userOldToken.equals(userToken)) {
//                returnErrorResponse(response,QiqvJSONResult.noAuth("无效token，请重新登录"));
                System.out.println("无效token，请重新登录");
                return false;

            }

        } else {
            System.out.println("该用户没有登录");

//            returnErrorResponse(response,QiqvJSONResult.noAuth("请登录后再操作"));

            return false;

        }

        redis.set(ConstantUtil.USER_TOKEN_KEY + phone ,userOldToken, 7*3600*24);
        return true;
    }
}