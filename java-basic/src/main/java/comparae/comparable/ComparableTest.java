package comparae.comparable;

import java.util.Collections;
import java.util.List;

import org.junit.jupiter.api.Test;

import com.google.common.collect.Lists;

/**
 * @author xulei
 * Created on 2025-08-21 15:05
 */
public class ComparableTest {

    @Test
    public void testSort() {
        Student stu1 = new Student("h", 33);
        Student stu2 = new Student("d", 44);
        Student stu3 = new Student("e", 12);
        Student stu4 = new Student("d", 15);
        Student stu5 = new Student("a", 5);
        Student stu6 = new Student("e", 3);
        List<Student> studentsList = Lists.newArrayList(stu1, stu2, stu3, stu4, stu5, stu6);
        System.out.println("排序前：");
        for (Student student : studentsList) {
            System.out.println(student);
        }
        /**
         * 排序前：
         * Student(name=h, age=33)
         * Student(name=d, age=44)
         * Student(name=e, age=12)
         * Student(name=d, age=15)
         * Student(name=a, age=5)
         * Student(name=e, age=3)
         */

        System.out.println("排序后：");
        // 通过集合工具类排序
        Collections.sort(studentsList);
        for (Student student : studentsList) {
            System.out.println(student);
        }
        /**
         * 排序后：
         * Student(name=a, age=5)
         * Student(name=d, age=44)
         * Student(name=d, age=15)
         * Student(name=e, age=12)
         * Student(name=e, age=3)
         * Student(name=h, age=33)
         */
    }
}
