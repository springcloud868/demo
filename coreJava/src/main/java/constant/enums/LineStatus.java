package constant.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * @author 郭东风
 * @description 上下架状态枚举
 * @date 2021/12/29
 */

@Getter
@AllArgsConstructor
public enum LineStatus {

    /**
     * @Description
     */
    ONLINE(1, "上架"),
    OFFLINE(0, "下架");

    private final Integer status;
    private final String description;
}
