package com.zyh.java;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import static java.util.Comparator.comparing;

/**
 * @author zhaoyinghao
 * @decription stream
 * @date 2022/1/6
 */
public class StreamTest {

    private List<String> afterJava8(List<Dish> dishList) {
        return dishList.stream()
                .filter(d -> d.getCalories() < 400)     //筛选出卡路里小于400的菜肴
                .sorted(comparing(Dish::getCalories))   //根据卡路里进行排序
                .map(Dish::getName)                     //提取菜肴名称
                .collect(Collectors.toList());          //转换为List
    }

    private Map<String, Dish> afterJava(List<Dish> dishList) {
        return dishList.stream()
                .filter(d -> d.getCalories() < 400).collect(Collectors.toMap(Dish::getName, v -> v));
    }
}
