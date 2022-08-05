package com.zyh.java.constant.enums;

/**
 * @author chenjiancai
 * @date 2021/11/10 上午11:21
 * 描述  HeaderOS类型枚举类
 */
public enum HeaderOsEnum {

    /**
     * OS类型
     */
    IOS("iOS","iOS"),
    ANDROID ("Android","Android"),
    Window ("Window","Window"),
    Mac ("Mac","Mac");


    /**
     * 构造方法
     * @param desc
     * @param code
     */
    HeaderOsEnum(String desc, String code) {
        this.desc=desc;
        this.code=code;
    }

    private String desc;

    private String code;


    /**
     * @return
     */
    public String desc(){
        return desc;
    }

    /**
     * @return
     */
    public String code(){
        return code;
    }

    /**
     * 根据code获取desc
     * @param code  code
     * @return desc
     */
    public static String getDesc(String code) {
        HeaderOsEnum[] carTypeEnums = values();
        for (HeaderOsEnum headerOsEnum : carTypeEnums) {
            if (headerOsEnum.code().equals(code)) {
                return headerOsEnum.desc();
            }
        }
        return null;
    }

    /**
     * 根据desc获取code
     * @param desc  desc
     * @return code
     */
    public static String getCode(String desc) {
        HeaderOsEnum[] carTypeEnums = values();
        for (HeaderOsEnum headerOsEnum : carTypeEnums) {
            if (headerOsEnum.desc().equals(desc)) {
                return headerOsEnum.code();
            }
        }
        return null;
    }


}
