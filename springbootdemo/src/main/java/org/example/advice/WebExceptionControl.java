package org.example.advice;

import org.example.exception.APIException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

/**
 * @author zhaoyinghao
 * @decription 全局异常处理类
 * @date 2022/1/27
 */
@RestControllerAdvice
public class WebExceptionControl {

    @ExceptionHandler(APIException.class)
    public String APIExceptionHandler(APIException e) {
        return e.getMessage();
    }
}