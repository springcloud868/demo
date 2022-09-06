package com.example.melody.config;

import com.example.melody.interceptor.TestInterceptor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Slf4j
@Configuration
public class TestInterceptorConfig implements WebMvcConfigurer {

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        log.info("拦截器初始化.......");
        //addInterceptor方法向拦截器注册器添加拦截器，addPathPatterns方法添加拦截路径匹配规则("/**"是拦截所有)，excludePathPatterns方法是设置白名单，放行哪些路径
        registry.addInterceptor(new TestInterceptor()).addPathPatterns("/**").excludePathPatterns("/user/*").order(1);
    }
}
