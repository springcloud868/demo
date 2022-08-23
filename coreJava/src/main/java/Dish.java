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
    private Integer age;

    public Dish(String a, boolean b, int i, Type type, int i1) {
        this.name = a;
        this.vegetarian = b;
        this.calories = i;
        this.type = type;
        this.age = i1;

    }

    // getter and setter
}
