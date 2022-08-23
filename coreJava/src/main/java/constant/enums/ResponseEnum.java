package constant.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * 通用Response枚举类
 */
@Getter
@AllArgsConstructor
public enum ResponseEnum {

    /**
     * 错误码及描述定义
     */
    COMMON_SUCCESS(200, "请求成功"),
    SYSTEM_FAIL(81040001, "请求失败"),
    SYSTEM_ERROR(81040002, "系统异常"),
    DEVICE_ID_NULL_EXCEPTION(81040003, "deviceId不能为空"),
    CONTENT_SERVER_EXCEPTION(81040004, "调用<hobby-content>服务异常"),
    RESOURCE_SERVER_EXCEPTION(81040005, "调用<hobby-resource>服务异常"),
    USER_SERVER_EXCEPTION(81040006, "调用<hobby-user>服务异常"),
    RECOMMEND_CLIENT_EXCEPTION(81040007, "调用<recommend-client>远程服务异常"),
    SEARCH_CLIENT_EXCEPTION(81040008, "调用<recommend-search>远程服务异常"),
    PARAM_EXCEPTION(81040009, "参数异常"),
    ENUM_PARAM_EXCEPTION(81040010, "selectType参数有误"),
    REC_NUM_NULL_EXCEPTION(81040011, "召回数量不能为空"),
    USER_ID_NULL_EXCEPTION(81040012, "userId不能为空"),
    CATE_LAB_ID_NULL_EXCEPTION(81040013, "categoryId和labelId不能同时为空"),
    FOLLOW_REC_TYPE_EXCEPTION(81040014, "followRecType有误"),
    CATEGORY_NAME_NULL_EXCEPTION(81040015, "品类名称不能为空"),
    PAGE_NUM_SIZE_NULL_EXCEPTION(81040016, "pageNum和pageSize都不能为空"),
    REC_TYPE_ERROR(81040017, "recType参数有误"),
    RANK_TYPE_NULL_EXCEPTION(81040018, "rankType不能为空"),
    HEADER_NULL_EXCEPTION(81040019, "请求头空值异常"),
    ;

    private final Integer code;

    private final String message;

}
