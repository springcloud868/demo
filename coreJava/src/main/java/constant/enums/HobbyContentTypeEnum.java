package constant.enums;

import lombok.AllArgsConstructor;

/**
 * @author tanyuanyuan
 * @version 1.0
 * @description: 社区整站内容类型枚举（包含主站，星球，星社）<br/>
 * 主站 1000 - 1999 <br/>
 * 星球 2000 - 2999 <br/>
 * 星社 3000 - 3999 <br/>
 * @date 2022/01/04 21:40
 */
@AllArgsConstructor
public enum HobbyContentTypeEnum {

    /**
     * 主站 1000-1999
     */

    /** ---------------------------- 主站-内容服务 ---------------------------- */
    /**
     * 图文
     */
    TEXT_IMAGE(1001, 1, "图文", HobbyContentGroupEnum.CONTENT, BusinessEnum.CONTENT),

    /**
     * 视频
     */
    VIDEO(1002, 2, "视频", HobbyContentGroupEnum.CONTENT, BusinessEnum.CONTENT),

    /**
     * 观点
     */
    VIEW(1003, 3, "观点", HobbyContentGroupEnum.CONTENT, BusinessEnum.CONTENT),

    /*
     * 话题
     */
    TAVERN_TOPIC(1004, 4, "话题", HobbyContentGroupEnum.TOPIC, BusinessEnum.CONTENT),

    /**
     * 评论
     */
    COMMENT(1005, 5, "评论", HobbyContentGroupEnum.COMMENT, BusinessEnum.CONTENT),

    /**
     * 回复
     */
    REPLY(1006, 5, "回复", HobbyContentGroupEnum.COMMENT, BusinessEnum.CONTENT),

    /**
     * 回复-评论
     */
    REPLY_COMMENT(1007, 5, "回复", HobbyContentGroupEnum.COMMENT, BusinessEnum.CONTENT),

    /**
     * 安利评论
     */
    ANLI(1008, 5, "安利评论", HobbyContentGroupEnum.COMMENT, BusinessEnum.CONTENT),

    /**
     * 二次分享
     */
    REPEAT_SHARE(1010, 1, "二次分享", HobbyContentGroupEnum.SHARE, BusinessEnum.CONTENT),

    /**
     * 主站分享动态
     */
    DYNAMIC_SHARE(1020, 2, "动态", HobbyContentGroupEnum.DYNAMIC, BusinessEnum.CONTENT),

    /**
     * 专题
     */
    TOPIC(1031, 1, "专题", HobbyContentGroupEnum.TOPIC, BusinessEnum.CONTENT),

    /**
     * 、
     * 稿件
     */
    DRAFT(1101, 9, "稿件", HobbyContentGroupEnum.CONTENT, BusinessEnum.CONTENT),

    /** ---------------------------- 主站-活动服务 ---------------------------- */

    /**
     * 活动
     */
    ACTIVITY(1200, 6, "活动", HobbyContentGroupEnum.ACTIVITY, BusinessEnum.CONTENT),


    /**
     * 主站创作者活动
     */
    ACTIVITY_CREATOR(1201, 1, "创作者活动", HobbyContentGroupEnum.ACTIVITY, BusinessEnum.ACTIVITY),

    /** ---------------------------- 主站-任务及成就服务 ---------------------------- */

    /**
     * 新手任务
     */
    TASK_NEW(1300, 1, "新手任务", HobbyContentGroupEnum.TASK, BusinessEnum.TASK_ACHIEVEMENT),

    /**
     * 创作者任务
     */
    TASK_CREATOR(1301, 2, "创作者任务", HobbyContentGroupEnum.TASK, BusinessEnum.TASK_ACHIEVEMENT),

    /**
     * 活跃任务
     */
    TASK_ACTIVE(1302, 4, "活跃任务", HobbyContentGroupEnum.TASK, BusinessEnum.TASK_ACHIEVEMENT),

    /**
     * 用户等级
     */
    TASK_USER_LEVEL(1303, 5, "用户等级", HobbyContentGroupEnum.TASK, BusinessEnum.TASK_ACHIEVEMENT),

    /**
     * 安利成就
     */
    ACHIEVEMENT_ANLI(1400, 1, "安利成就", HobbyContentGroupEnum.ACHIEVEMENT, BusinessEnum.TASK_ACHIEVEMENT),

    /**
     * 创作者成就
     */
    ACHIEVEMENT_CREATOR(1401, 2, "创作者成就", HobbyContentGroupEnum.ACHIEVEMENT, BusinessEnum.TASK_ACHIEVEMENT),


    /** ---------------------------- 主站-搜索服务 ---------------------------- */
    /**
     * 安利榜单
     */
    TOP_ANLI(1500, 1, "安利榜单", HobbyContentGroupEnum.TOP, BusinessEnum.SEARCH),

    /**
     * 创作者榜单
     */
    TOP_CREATOR(1501, 2, "创作者榜单", HobbyContentGroupEnum.TOP, BusinessEnum.SEARCH),

    /**
     * 内容榜单
     */
    TOP_CONTENT(1502, 2, "内容榜单", HobbyContentGroupEnum.TOP, BusinessEnum.SEARCH),

    /** ---------------------------- 主站-用户服务 ---------------------------- */

    /**
     * 达人
     */
    USER_GEEK(1601, 1, "达人", HobbyContentGroupEnum.USER, BusinessEnum.USER),

    /**
     * 主理人
     */
    USER_ADMIN(1602, 2, "主理人", HobbyContentGroupEnum.USER, BusinessEnum.USER),

    /**
     * 机构
     */
    USER_ORGANIZATION(1603, 2, "机构", HobbyContentGroupEnum.USER, BusinessEnum.USER),

    /**
     * 关注
     */
    USER_FOCUS(1620, 3, "关注", HobbyContentGroupEnum.TOP, BusinessEnum.USER),

    /**
     * 用户装扮（头像，铭牌，评论框挂饰）
     */
    USER_DECORATE(1630, 4, "用户装扮", HobbyContentGroupEnum.DECORATE, BusinessEnum.USER),


    /** 小象（星球，星卡）2000 - 2999 */

    /** ---------------------------- 星卡 ---------------------------- */

    /**
     * 星卡
     */
    CARD(2000, 1, "星卡", HobbyContentGroupEnum.CARD, BusinessEnum.STAR_CARD),


    /** ---------------------------- 星球 ---------------------------- */

    /**
     * 星球
     */
    STAR(2201, 1, "星球", HobbyContentGroupEnum.STAR, BusinessEnum.STAR),

    /**
     * 星球动态及分享到星球到动态
     */
    STAR_DYNAMIC(2202, 2, "星球动态", HobbyContentGroupEnum.DYNAMIC, BusinessEnum.STAR),

    /**
     * 兑换
     */
    STAR_DYNAMIC_EXCHANGE(2205, 5, "兑换", HobbyContentGroupEnum.EXCHANGE, BusinessEnum.STAR),

    /** 星社 3000 - 3999 */

    /** ---------------------------- 潮流地图 ---------------------------- */

    /**
     * 潮流地图活动
     */
    TREND_ACTIVITY(3100, 501, "潮流地图活动", HobbyContentGroupEnum.ACTIVITY, BusinessEnum.TREND),
    /**
     * 安利邀约
     */
    TREND_ACTIVITY_INVITATION(3101, 503, "安利邀约", HobbyContentGroupEnum.ACTIVITY_INVITATION, BusinessEnum.TREND),

    /**
     * 普通活动（宠粉活动，品牌活动）
     */
    TREND_ACTIVITY_FANS(3102, 504, "活动", HobbyContentGroupEnum.ACTIVITY, BusinessEnum.TREND),

    /**
     * 品牌活动
     */
    TREND_ACTIVITY_BRAND(3103, 505, "品牌活动(废弃，合并到普通活动)", HobbyContentGroupEnum.ACTIVITY, BusinessEnum.TREND),

    /**
     * 潮流地图门店
     */
    TREND_STORE(3200, 502, "潮流地图门店", HobbyContentGroupEnum.STORE, BusinessEnum.TREND),


    /** ---------------------------- 星社 ---------------------------- */
    /**
     * 星社
     */
    STAR_CLUB(3300, 1, "星社", HobbyContentGroupEnum.STAR_CLUB, BusinessEnum.STAR_CLUB),

    /**
     * 星社动态及被分享到星社到动态
     */
    STAR_CLUB_DYNAMIC(3301, 1, "星社动态", HobbyContentGroupEnum.DYNAMIC, BusinessEnum.STAR_CLUB),

    /** ---------------------------- 星幕/星集 ---------------------------- */
    /**
     * 星幕
     */
    STAR_SCREEN(4000, 1, "星幕", HobbyContentGroupEnum.STAR_SCREEN, BusinessEnum.STAR_SCREEN),

    /**
     * 星集
     */
    STAR_COLLECT(4500, 1, "星集", HobbyContentGroupEnum.STAR_COLLECT, BusinessEnum.STAR_COLLECT),

    ;

    /**
     * 全站唯一内容类型
     */
    private Integer value;

    /**
     * 服务内部内容类型
     * 举例：内容服务：图文-1，视频-2，观点-3
     */
    private Integer innerType;

    /**
     * 全站唯一内容类型描述
     */
    private String desc;

    /**
     * 内容类型分组（用于聚合内容类型）
     * 举例：宠粉活动，创作者活动，品牌活动，都属于活动。
     */
    private HobbyContentGroupEnum group;

    /**
     * 一级业务标示
     */
    private BusinessEnum businessEnum;

    public Integer getValue() {
        return this.value;
    }

    public Integer getInnerType() {
        return innerType;
    }

    public String getDesc() {
        return desc;
    }

    public HobbyContentGroupEnum getGroup() {
        return group;
    }

    public BusinessEnum getBusinessEnum() {
        return businessEnum;
    }

    public static HobbyContentTypeEnum getByDesc(String desc) {
        for (HobbyContentTypeEnum msgContentTypeEnum : HobbyContentTypeEnum.values()) {
            if (msgContentTypeEnum.getDesc().equals(desc)) {
                return msgContentTypeEnum;
            }
        }
        return null;
    }

    public static HobbyContentTypeEnum getByValue(Integer value) {
        for (HobbyContentTypeEnum msgContentTypeEnum : HobbyContentTypeEnum.values()) {
            if (msgContentTypeEnum.getValue().equals(value)) {
                return msgContentTypeEnum;
            }
        }
        return null;
    }
}
