package java.constant.enums;

import lombok.Getter;

/**
 * 分享场景枚举
 */
@Getter
public enum ShareScenesTypeEnum {

    QKDT(101, "求卡动态", Boolean.TRUE, ShareGroupEnum.STAR),
    TWDT(102, "图文动态", Boolean.FALSE, ShareGroupEnum.STAR),
    SPTGFXDT(103, "视频投稿分享动态", Boolean.FALSE, ShareGroupEnum.STAR),
    TWTGFXDT(104, "图文投稿分享动态", Boolean.FALSE, ShareGroupEnum.STAR),
    SCDHFXDT(105, "商城兑换分享动态", Boolean.TRUE, ShareGroupEnum.STAR),
    CLDTHDFXDT(106, "潮流地图活动分享动态", Boolean.FALSE, ShareGroupEnum.STAR),
    CLDTMDFXDT(107, "潮流地图门店分享动态", Boolean.FALSE, ShareGroupEnum.STAR),
    CLDTHDYY_AL(108, "潮流地图活动邀约（安利）", Boolean.FALSE, ShareGroupEnum.STAR),
    CFHDFXDT(109, "宠粉活动分享动态", Boolean.FALSE, ShareGroupEnum.STAR),
    PPHDFXDT(110, "品牌活动分享动态", Boolean.FALSE, ShareGroupEnum.STAR),
    SXFXTD(111, "星社分享动态", Boolean.FALSE, ShareGroupEnum.STAR),
    JKDTLBFX(112, "集卡动态列表分享", Boolean.TRUE, ShareGroupEnum.STAR),
    QKDTSHB(113, "求卡动态晒红包", Boolean.TRUE, ShareGroupEnum.STAR),
    TYSHB(114, "通用晒红包", Boolean.TRUE, ShareGroupEnum.STAR),
    XQTWDTFX(115, "星球图文动态分享", Boolean.FALSE, ShareGroupEnum.STAR),

    XKDHLB(301, "星卡兑换列表", Boolean.TRUE, ShareGroupEnum.MALL),
    XKDHXQ(302, "星卡兑换详情", Boolean.TRUE, ShareGroupEnum.MALL),
    XKDHCG(303, "星卡兑换成功", Boolean.TRUE, ShareGroupEnum.MALL),
    XKYQHY(304, "星卡邀请好友", Boolean.TRUE, ShareGroupEnum.MALL),
    ;

    /**
     * 分享场景类型（具体见产品文档定义）
     */
    private Integer type;

    private String desc;

    /**
     * 是否有海报
     */
    private Boolean havePoster;

    /**
     * 分享内容分组
     */
    private ShareGroupEnum shareGroupEnum;


    ShareScenesTypeEnum(Integer type, String desc, Boolean havePoster, ShareGroupEnum shareGroupEnum) {
        this.type = type;
        this.desc = desc;
        this.havePoster = havePoster;
        this.shareGroupEnum = shareGroupEnum;
    }

    public static ShareScenesTypeEnum getByType(int type) {
        for(ShareScenesTypeEnum codeEnum : ShareScenesTypeEnum.values()) {
            if(codeEnum.getType() == type) {
                return codeEnum;
            }
        }
        return null;
    }

}
