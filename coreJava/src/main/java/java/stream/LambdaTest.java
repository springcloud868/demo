package java.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * @author zhaoyinghao
 * @decription lambda
 * @date 2022/2/28
 */
public class LambdaTest {

    public static void main(String[] args) {
        List<Student> list = new ArrayList<>();
        Student student1 = new Student("zhangsan", 12);
        list.add(student1);
        Student student2 = new Student("lisi", 11);
        list.add(student2);
        Student student3 = new Student("wangwu", 13);
        list.add(student3);
        Student student4 = new Student("zhaoliu", 14);
        list.add(student4);
        Student student5 = new Student("songqi", 12);
        list.add(student5);

        LambdaTest lambdaTest = new LambdaTest();
        lambdaTest.doMap(list);
        lambdaTest.toList(list);
    }

    public Map doMap(List<Student> list) {
        Map<Integer, Student> map = list.stream().collect(Collectors.toMap(Student::getAge, v -> v));
        return map;
    }

    public List<Integer> toList(List<Student> list) {
        List<Integer> integers = list.stream().map(Student::getAge).collect(Collectors.toList());
        return integers;
    }

}

class Student {
    private String name;
    private Integer age;

    public Student(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
}
