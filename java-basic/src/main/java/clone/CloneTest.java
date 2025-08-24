package clone;

import org.junit.jupiter.api.Test;

import com.alibaba.fastjson2.JSON;

import bo.Student;

/**
 * @author xulei
 * Created on 2025-08-20 21:56
 */
public class CloneTest {

    @Test
    public void test() {
        Student stu1 = new Student(28, "XL");
        System.out.println(stu1); // Student(age=28, name=XL)
        Student stu2 = stu1;
        System.out.println(stu1 == stu2); // true
        // 说明是浅拷贝，因为两者内存地址相同

        String json = JSON.toJSONString(stu1);
        Student student1 = JSON.parseObject(json, Student.class);
        System.out.println(student1); // Student(age=28, name=XL)
        System.out.println(stu1 == student1); // false
        // 说明是深拷贝，两者的内存地址不同
    }

}
