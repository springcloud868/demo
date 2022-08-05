package com.zyh.java;

import lombok.Data;

import java.lang.reflect.Type;

/**
 * @author zhaoyinghao
 * @decription
 * @date 2022/1/6
 */
@Data
public class Dish {
    private String name;
    private boolean vegetarian;
    private int calories;
    private Type type;

    // getter and setter
}
