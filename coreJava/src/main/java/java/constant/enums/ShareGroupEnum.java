package java.constant.enums;

import lombok.AllArgsConstructor;

/**
 * @author tanyuanyuan
 * @version 1.0
 * @description: 内容分组枚举
 * @date 2022/1/4 20:17
 */
@AllArgsConstructor
public enum ShareGroupEnum {
    /**
     * 星球
     */
    STAR("星球"),

    /**
     * 兑换商城
     */
    MALL("兑换商城"),
    ;

    private String desc;

    public String getDesc() {
        return desc;
    }
}
