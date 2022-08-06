package java.constant.enums;

/**
 * 服务降级返回
 *
 * @author zed
 */
public enum HystrixCodeEnum {
    /**
     *
     */
    SYSTEM_FALLBACK(500, "服务出错，降级处理");

    public int code;

    public String message;


    HystrixCodeEnum(int i, String message) {
    }
}