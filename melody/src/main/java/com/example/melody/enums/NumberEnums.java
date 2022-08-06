package com.example.melody.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

/**
 * 数值枚举
 *
 * @author 86176
 */
@Getter
@NoArgsConstructor
@AllArgsConstructor
public enum NumberEnums {

    ONE(1),

    TWO(2),

    THREE(3),

    FOUR(4),

    FIVE(5),

    SIX(6),

    SEVEN(7),

    EIGHT(8),

    NINE(9),

    TEN(10),

    ELEVEN(11),

    TWELVE(12),

    THOUSAND(1000);

    private Integer source;

}
