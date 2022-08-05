package org.example.interceptor;

import org.example.enums.Constant;
import org.example.exception.APIException;
import org.jetbrains.annotations.NotNull;
import org.springframework.web.servlet.HandlerInterceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @author zhaoyinghao
 * @decription 拦截器   权限管理URL拦截器
 * @date 2022/1/27
 */
public class UrlInterceptor implements HandlerInterceptor {

    // 预处理回调方法，在接口调用之前使用  true代表放行  false代表不放行
    @Override
    public boolean preHandle(HttpServletRequest request, @NotNull HttpServletResponse response, @NotNull Object handler) {
        String token = request.getHeader("token");
        String requestURL = request.getRequestURI();
        //1.根据token判断用户是否登录
        //  正常情况下这里还需判断与redis中的token是否匹配
        if (token==null){
            // 如果没有token或者token不匹配, 直接抛出异常  提示未登录
            throw  new APIException("当前用户未登录");
        }
        //2.登录成功后 根据用户token中的信息获取到用户对应的URL权限集合
        String[] strings = Constant.permission.get(Integer.valueOf(token));
        boolean hasPermission = false;
        //3.再根据用户对应的URL集合去与当前请求的URL对比  有匹配的则放行  反之则抛出异常
        for (String string : strings) {
            if (string.equals(requestURL)) {
                hasPermission = true;
                break;
            }
        }
        if (hasPermission){
            return true;
        }else {
            throw  new APIException("当前用户没有访问路径" + requestURL + "的权限");
        }
    }
}
