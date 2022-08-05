package com.zyh.java.constant.enums;

import lombok.Getter;

/**
 * 公共正常逻辑删除值
 * @author LSW
 * @create 2021/11/18 15:01
 */
@Getter
public enum DeletedStatusEnum {

    DELETE_0("0","正常"),
    DELETE_1("1","逻辑删除");

    private String type;
    private String desc;

    DeletedStatusEnum(String type, String desc){
        this.type=type;
        this.desc=desc;
    }

}
