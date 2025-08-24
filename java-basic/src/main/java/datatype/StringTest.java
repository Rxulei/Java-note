package datatype;

import java.nio.charset.StandardCharsets;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

/**
 * @author xulei
 * Created on 2025-08-21 15:24
 */
public class StringTest {

    public int hashCode(String s) {
        // 重写String的hashCode()方法
        // 目的：不同的String对象，返回不同的int值
        char[] charArray = s.toCharArray();
        int sum = 0;
        for (int i = 0; i < charArray.length; i++) {
            sum += (int) charArray[i] * (i + 1);
        }

        return sum;
    }

    @Test
    public void testOverrideHashcode() {
        StringTest obj = new StringTest();
        String s1 = "abcdef";
        String s2 = "efdcba";
        String s3 = "Hello, world";
        String s4 = "world, Hello";
        String s5 = "abcdef";

        System.out.println(obj.hashCode(s1)); // 2107
        System.out.println(obj.hashCode(s5)); // 2107
        System.out.println(obj.hashCode(s2)); // 2073
        System.out.println(obj.hashCode(s3)); // 7552
        System.out.println(obj.hashCode(s4)); // 7188
    }

    @Test
    public void testStringBuilder() {
        StringBuilder sb = new StringBuilder("First String");
        System.out.println(sb);
        /**
         * First String
         */

        sb.append(" Hello")
                .append(" World")
                .append(" Tomorrow")
                .append(" will be better");
        System.out.println(sb);
        /**
         * First String Hello World Tomorrow will be better
         */
    }

    @Test
    @DisplayName("字符串拼接，不推荐用法")
    public void testStringJoinFalse() {
        String str = "";
        for (int i = 0; i < 100; i++) {
            // for循环100次，就会创建100个StringBuilder对象，
            // 同时调用toString()100次，创建100个String对象
            // 时间和内存空间效率低
            str += "Hello";
        }

        System.out.println(str);
    }

    @Test
    @DisplayName("字符串拼接，推荐用法")
    public void testStringJoinRight() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 100; i++) {
            // 每次都是修改同一个对象，不会创建新的对象
            sb.append("Hello");
        }

        System.out.println(sb);
    }

    @Test
    @DisplayName("测试intern()")
    public void testIntern() {
        String s1 = "abc";
        String s2 = new String("abc");
        String s3 = s2.intern();

        System.out.println(s1 == s2); // false
        // s1 和 s2 所指向的对象的内存地址不同，
        // s1保存的是字符串常量池中的”abc“的地址，s2保存的是堆中的内存地址

        System.out.println(s1 == s3); // true
        // s1 和 s3有相同的内存地址，都保存了字符串常量池中的”abc“的地址

        System.out.println(s1.equals(s2)); // true
        System.out.println(s1.equals(s3)); // true
        System.out.println(s2.equals(s3)); // true
    }

    @Test
    public void testReplace() {
        String str = "hello";
        // 这样不会修改str的内容，String中的方法，都会产生一个新的字符串对象，不会修改原来的字符串
        str.replace("l", "x");
        System.out.println(str); // hello

        // 将替换后的新的字符串，赋值给str
        str = str.replace("l", "x");
        System.out.println(str); // hexxo
    }

    @Test
    public void testReplaceFirstAndAll() {
        String str = "Hello World";
        str = str.replaceFirst("l", "S");
        System.out.println(str); // "HeSlo World"

        String str2 = "Hello World";
        str2 = str2.replaceAll("l", "X");
        System.out.println(str2); // "HeXXo WorXd"
    }

    @Test
    @DisplayName("利用replace方法，删除字符串中的字符，替换为空字符串即可")
    public void testDeleteCharacter() {
        String str = "Hello*world*";
        // 删除字符串中的 *
        String str2 = str.replace("*", "");
        System.out.println(str2); // Helloworld

        // 将字符串中的 * 替换为空格字符
        String str3 = str.replace("*", " ");
        System.out.println(str3); // Hello world
    }

    @Test
    public void testStringCode() {
        String str = "Hello";
        // 以指定的编码形式，将字符串编码为字节数组
        byte[] bytes = str.getBytes(StandardCharsets.UTF_8);
        System.out.println(bytes); // [B@3f197a46

        // 以指定的字符编码格式，将字节数组解码为字符串
        String newStr = new String(bytes, StandardCharsets.UTF_8);
        System.out.println(newStr); // Hello
    }

    @Test
    @DisplayName("其他类型转换为字符串")
    public void valueOf() {
        int num1 = 3;
        double num2 = 3.12456;
        long num3 = 123456789L;
        String s1 = String.valueOf(num1);
        String s2 = String.valueOf(num2);
        String s3 = String.valueOf(num3);
        System.out.println(s1); // 3
        System.out.println(s2); // 3.12456
        System.out.println(s3); // 123456789
    }

    @Test
    public void testParseStr() {
        String s1 = "123";
        String s2 = "45.32";

        // 如果s1为 "12.3" 会报错：NumberFormatException
        int a = Integer.parseInt(s1);
        double b = Double.parseDouble(s2);

        System.out.println(a); // 123
        System.out.println(b); // 45.32
    }

    @Test
    public void testToWrapper() {
        String s = "123";
        Long num = Long.valueOf(s);
        System.out.println(num); // 123
    }
}
