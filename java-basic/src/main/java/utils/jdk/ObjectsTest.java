package utils.jdk;

import java.util.Objects;

import org.junit.jupiter.api.Test;

import bo.Student;

/**
 * @author xulei
 * Created on 2025-08-22 08:52
 */
public class ObjectsTest {

    @Test
    public void testEquals() {
        Student stuNull = null;
        Student stu1 = new Student(29, "xl");
        Student stu2 = new Student(89, "ww");
        Student stu3 = new Student(29, "xl");

        System.out.println(Objects.equals(stuNull, stu1)); // false
        System.out.println(Objects.equals(stu1, stu2)); // false
        System.out.println(Objects.equals(stu1, stu3)); // true
        System.out.println(Objects.equals(stu2, stu3)); // false
    }

    @Test
    public void testHashCode() {
        Student stuNull = null;
        Student stu = new Student(29, "xl");
        System.out.println(Objects.hashCode(stuNull)); // 0
        System.out.println(Objects.hashCode(stu));    // 9020
        System.out.println(stu.hashCode()); // 9020
    }

    @Test
    public void testIsNull() {
        Long num = null;
        System.out.println(Objects.isNull(num)); // true

        Student stu = new Student(29, "xl");
        System.out.println(Objects.isNull(stu)); // false
    }

    @Test
    public void testNonNull() {
        System.out.println(Objects.nonNull("123")); // true

        Student stu = null;
        System.out.println(Objects.nonNull(stu)); // false
    }


}
