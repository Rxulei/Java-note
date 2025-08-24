package comparae.comparator;

import java.util.Collections;
import java.util.List;

import org.junit.jupiter.api.Test;

import com.google.common.collect.Lists;


/**
 * @author xulei
 * Created on 2025-08-21 15:10
 */
public class ComparatorTest {
    @Test
    public void testComparator() {
        Student stu1 = new Student(33, "h");
        Student stu2 = new Student(44, "d");
        Student stu3 = new Student(12, "e");
        Student stu4 = new Student(15, "d");
        Student stu5 = new Student(5, "a");
        Student stu6 = new Student(3, "e");
        List<Student> studentsList = Lists.newArrayList(stu1, stu2, stu3, stu4, stu5, stu6);
        System.out.println("排序前：");
        for (Student student : studentsList) {
            System.out.println(student);
        }
        /**
         * 排序前：
         * Student(age=33, name=h)
         * Student(age=44, name=d)
         * Student(age=12, name=e)
         * Student(age=15, name=d)
         * Student(age=5, name=a)
         * Student(age=3, name=e)
         */

        System.out.println("排序后：");
        Collections.sort(studentsList, (s1, s2) -> {
            // 先根据name升序排序
            int flag = s1.getName().compareTo(s2.getName());
            if (flag == 0) {
                // 如果name相同，根据age升序排序
                return s1.getAge() - s2.getAge();
            }
            return flag;
        });
        for (Student student : studentsList) {
            System.out.println(student);
        }
        /**
         * 排序后：
         * Student(age=5, name=a)
         * Student(age=15, name=d)
         * Student(age=44, name=d)
         * Student(age=3, name=e)
         * Student(age=12, name=e)
         * Student(age=33, name=h)
         */
    }
}
