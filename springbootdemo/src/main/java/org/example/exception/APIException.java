package org.example.exception;

/**
 * @author zhaoyinghao
 * @decription 异常类
 * @date 2022/1/27
 */
public class APIException extends RuntimeException {
    private static final long serialVersionUID = 1L;
    private String msg;

    public APIException(String msg) {
        super(msg);
        this.msg = msg;
    }

}
