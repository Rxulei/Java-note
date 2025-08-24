package wrapper;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import com.google.common.collect.Lists;

/**
 * @author xulei
 * Created on 2025-08-20 09:59
 */
public class IntegerTest {

    @Test
    public void testAutoBoxingAndUnboxing() {
        List<Integer> integers = new ArrayList<>();
        for (int i = 1; i < 5; i ++){
            // 自动装箱：将int类型的变量i转换为Integer类型的对象
            // 反编译后，integers.add(Integer.valueOf(i));
            integers.add(i);
        }

        System.out.println(integers); // [1, 2, 3, 4]
    }

    @Test
    public void testBoxingCompare() {
        Integer a = 10;
        int b = 11;
        // a.intValue() == b
        System.out.println(a == b);  // false
        System.out.println(a > b);   // false
        System.out.println(a < b);   // true
    }

    @Test
    @DisplayName("验证Integer的缓存对象")
    public void testIntegerCache() {
        Integer a = 10; // 自动装箱，等价于：Integer a = Integer.valueof(10);
        Integer b = 10; // 自动装箱
        System.out.println(a == b); // true
        // a和b两个对象的值都是10，介于-128~127之间 并且两者是通过自动装箱创建的对象
        // 都使用Integer中的缓存，因此两个对象的内存地址相同

        Integer c = 130; // 自动装箱
        Integer d = 130; // 自动装箱
        System.out.println(c == d);      // false
        System.out.println(c.equals(d)); // true
        // c和d两个对象的值不是-128~127之间，不能使用缓存，因此是两个不同的对象，内存地址不同
        // 但是调用equals方法可以根据值进行比较是否相等。

        // new Integer(10); 这种方法创建对象，已经@Deprecated
        // 只要是new，两个对象的内存地址不一样
        Integer e = new Integer(10);
        Integer f = new Integer(10);
        System.out.println(e == f);      // false
        System.out.println(e.equals(f)); // true
    }

    @Test
    public void testUnboxing() {
        List<Integer> nums = Lists.newArrayList(1, 3, null);
        int sum = 0;
        // 自动拆箱：Integer -> int，会调用包装类对象的：intValue()
        for (int i : nums) {
            sum += i;
        }
        System.out.println(sum);
        /**
         * java.lang.NullPointerException
         */
        // 解决方法，使用i之前，加上判空逻辑
    }

    @Test
    public void longTest() {
        Long a = new Long(5); // 通过构造方法创建Long对象的方式，自从Java9标记为：@Deprecated(since="9")
        Long b = new Long(5);	// 通过构造方法创建的包装类对象，不适用于：缓存

        /**
         * 因为通过new，在堆内存创建了两个对象，堆内存地址不同
         */
        System.out.println(a == b); // false

        // 这两种方式，使用了自动装箱 && 数值在缓存对象的值范围内
        Long num1 = 100L;
        Long num2 = 100L;
        // 使用了包装类的缓存，所以内存地址相等
        System.out.println(num1 == num2); // true

        // 使用了自动装箱，但是数值不在缓存对象的值范围内
        Long num3 = 200L;
        Long num4 = 200L;
        System.out.println(num3 == num4); // false

        // 使用equals()比较两个包装类是否相等，更安全
        System.out.println(num1.equals(num2)); // true
        System.out.println(num3.equals(num4)); // true
    }

    @Test
    public void testParseInt() {
        String s1 = "123";
        String s2 = "456";
        System.out.println(Integer.parseInt(s1)); // 123
        System.out.println(Integer.parseInt(s2)); // 456

        String s3 = "12a";
        String s4 = "123.34";  // 无法把字符串类型的double变量，转化为int类型
        System.out.println(Integer.parseInt(s3));
        // java.lang.NumberFormatException: For input string: "12a"
        System.out.println(Integer.parseInt(s4));
        // java.lang.NumberFormatException: For input string: "123.34"
    }

    @Test
    public void valueOf() {
        String s1 = "123";
        String s2 = "asd";
        String s3 = "299.97";

        System.out.println(Integer.valueOf(s1)); // 123
        System.out.println(Integer.valueOf(s2));
        // java.lang.NumberFormatException: For input string: "asd"
        System.out.println(Integer.valueOf(s3));
        // java.lang.NumberFormatException: For input string: "299.97"
    }
}
