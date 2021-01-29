package com.imooc.config;

import com.imooc.controller.interceptor.MiniInterceptor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

import com.imooc.controller.interceptor.OneInterceptor;
import com.imooc.controller.interceptor.TwoInterceptor;

import java.util.Arrays;
import java.util.List;

@Configuration
public class WebMvcConfigurer extends WebMvcConfigurerAdapter {

	@Bean
	public MiniInterceptor miniInterceptor(){
		return new MiniInterceptor();

	}
	@Override
	public void addInterceptors(InterceptorRegistry registry) {
		List listOfVerify = Arrays.asList("/**");

		List listOfExc = Arrays.asList("/platUser/login","/platUser/register");

		/**
		 * 拦截器按照顺序执行
		 */
		registry.addInterceptor(new TwoInterceptor()).addPathPatterns("/two/**")
													 .addPathPatterns("/one/**");
		registry.addInterceptor(new OneInterceptor()).addPathPatterns("/one/**");

		registry.addInterceptor(miniInterceptor()).addPathPatterns(listOfVerify)
				.excludePathPatterns(listOfExc);

		super.addInterceptors(registry);
	}

}
