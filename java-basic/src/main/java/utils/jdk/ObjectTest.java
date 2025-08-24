package utils.jdk;

import org.junit.jupiter.api.Test;

import bo.Student;

/**
 * @author xulei
 * Created on 2025-08-22 08:46
 */
public class ObjectTest {

    @Test
    public void testHashCode() {
        Student student1 = new Student(29, "a");
        Student student2 = new Student(80, "b");
        Student student3 = new Student(29, "a");

        System.out.println(student1.hashCode()); // 5289
        System.out.println(student2.hashCode()); // 8299
        System.out.println(student3.hashCode()); // 5289
        // Student使用了@Data注解，包含@EqualsAndHashCode，重写了hashCode方法
    }

    @Test
    public void testToString() {
        Student student = new Student(29, "a");

        // 因为Student使用了@Data,包含了@ToString，重写了toString()
        System.out.println(student.toString()); // Student(age=29, name=a)
        System.out.println(student); // Student(age=29, name=a)
        // 直接输出对象，默认也会调用对象的toString()
    }

    @Test
    public void testGetClass() {
        Student student = new Student(29, "xl");
        Class<? extends Student> stuClass = student.getClass();
        System.out.println(stuClass); // class bo.Student
    }
}
