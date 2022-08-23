package constant.enums;

import lombok.AllArgsConstructor;

/**
 * @author tanyuanyuan
 * @version 1.0
 * @description: 一级业务标示枚举
 * @date 2021/11/17 20:26
 */
@AllArgsConstructor
public enum BusinessEnum {
    /**
     * 用户服务
     */
    USER(1, "用户服务"),
    /**
     * 内容服务
     */
    CONTENT(2, "内容服务"),
    /**
     * 搜索服务
     */
    SEARCH(3, "搜索服务"),
    /**
     * 打赏服务
     */
    REWARD(4, "打赏服务"),
    /**
     * 资源服务
     */
    RESOURCE(5, "资源服务"),
    /**
     * 消息服务
     */
    MESSAGE(6, "消息服务"),
    /**
     * 文件服务
     */
    STORAGE(7, "文件服务"),
    /**
     * 账户服务
     */
    ACCOUNT(8, "账户服务"),
    /**
     * 签章服务
     */
    ESIGN(9, "签章服务"),
    /**
     * 任务成就服务
     */
    TASK_ACHIEVEMENT(10, "任务成就服务"),
    /**
     * 活动服务
     */
    ACTIVITY(11, "活动服务"),
    /**
     * 海报服务
     */
    POSTER(12, "海报服务"),

    /**
     * 运营平台
     */
    OM(13, "运营平台"),

    /**
     * 星球
     */
    STAR(14, "星球"),

    /**
     * 星卡
     */
    STAR_CARD(15, "星卡"),

    /**
     * 星社
     */
    STAR_CLUB(16, "星社"),

    /**
     * 广场
     */
    SQUARE(17, "广场"),

    /**
     * 潮流地图
     */
    TREND(18, "潮流地图"),

    /**
     * 星卡
     */
    CARD(19, "星卡"),

    /**
     * 投稿活动
     */
    CAST_ACTIVITIES(12, "投稿活动"),

    /**
     * 星幕
     */
    STAR_SCREEN(13, "星幕"),

    /**
     * 星集
     */
    STAR_COLLECT(14, "星集");

    private int bizId;

    private String desc;

    public int getBizId() {
        return this.bizId;
    }

    public String getDesc() {
        return desc;
    }

    public static BusinessEnum getByValue(Integer value) {
        for (BusinessEnum businessEnum : BusinessEnum.values()) {
            if (businessEnum.getBizId() == value) {
                return businessEnum;
            }
        }
        return null;
    }
}
