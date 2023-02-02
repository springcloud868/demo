package streams;

import com.alibaba.fastjson.JSONObject;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Collectors;

/**
 * @author zhaoyinghao
 * @decription lambda
 * @date 2022/2/28
 */
public class LambdaTest {

    public static void main(String[] args) {
        List<Student> list = new ArrayList<>();
        Student student1 = new Student("zhangsan", 12, 1);
        list.add(student1);
        Student student2 = new Student("lisi", 11, 1);
        list.add(student2);
        Student student3 = new Student("wangwu", 9, 2);
        list.add(student3);
        Student student4 = new Student("zhaoliu", 14, 3);
        list.add(student4);
        Student student5 = new Student("songqi", 12, 3);
        list.add(student5);

        AtomicInteger index = new AtomicInteger();
        list.stream().peek(vo-> vo.setGrade(index.getAndIncrement()+1))
                .sorted(Comparator.comparing(Student::getAge).thenComparing(Student::getGrade))
                .forEach(VO-> System.out.println(JSONObject.toJSON(VO)));
    }

    public Map doMap(List<Student> list) {
        return list.stream().collect(Collectors.toMap(Student::getAge, v -> v));
    }

    public List<Integer> toList(List<Student> list) {
        return list.stream().map(Student::getAge).collect(Collectors.toList());
    }

}

class Student {
    private String name;
    private Integer age;
    private Integer grade;

    public Student(String name, Integer age, Integer grade) {
        this.name = name;
        this.age = age;
        this.grade = grade;
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

    public Integer getGrade() {
        return grade;
    }

    public void setGrade(Integer grade) {
        this.grade = grade;
    }
}
