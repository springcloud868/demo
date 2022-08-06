package java.constant.enums;

import lombok.AllArgsConstructor;

/**
 * @author tanyuanyuan
 * @version 1.0
 * @description: 内容分组枚举
 * @date 2022/1/4 20:17
 */
@AllArgsConstructor
public enum HobbyContentGroupEnum {
    /**
     * 内容
     */
    CONTENT("内容"),

    /**
     * 评论回复
     */
    COMMENT("评论"),

    /**
     * 动态
     */
    DYNAMIC("动态"),

    /**
     * 观点
     */
    VIEW("观点"),

    /**
     * 话题
     */
    TAVERN_TOPIC("话题"),

    /**
     * 专题
     */
    TOPIC("专题"),

    /**
     * 任务
     */
    TASK("任务"),

    /**
     * 成就
     */
    ACHIEVEMENT("成就"),

    /**
     * 榜单
     */
    TOP("榜单"),

    /**
     * 用户
     */
    USER("用户"),

    /**
     * 装扮
     */
    DECORATE("装扮"),

    /**
     * 活动
     */
    ACTIVITY("活动"),

    /**
     * 活动邀约
     */
    ACTIVITY_INVITATION("活动邀约"),

    /**
     * 分享
     */
    SHARE("分享"),

    /**
     * 星卡
     */
    CARD("星卡"),

    /**
     * 星球
     */
    STAR("星球"),

    /**
     * 广场
     */
    SQUARE("广场"),

    /**
     * 星社
     */
    STAR_CLUB("星社"),

    /**
     * 潮流地图
     */
    TREND_MAP("潮流地图"),

    /**
     * 门店
     */
    STORE("门店"),

    /**
     * 关注
     */
    FOCUS("关注"),

    /**
     * 兑换
     */
    EXCHANGE("兑换"),

    /**
     * 星幕
     */
    STAR_SCREEN("星幕"),

    /**
     * 星集
     */
    STAR_COLLECT("星集");

    private String desc;

    public String getDesc() {
        return desc;
    }
}
