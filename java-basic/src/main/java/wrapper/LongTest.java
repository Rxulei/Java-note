package wrapper;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

/**
 * @author xulei
 * Created on 2025-08-21 15:50
 */
public class LongTest {

    /**
     * 光速，单位为米/秒
     */
    private static final int LIGHT_SPEED = 30 * 10000 * 100;

    @Test
    @DisplayName("整型溢出问题")
    public void testIntegerOverflow() {
        // 光速8分钟经过的距离
        long distance = LIGHT_SPEED * 60 * 8;
        System.out.println(distance); // 1515098112

        // 通过60L告诉编译器，结果为long类型的
        long distance2 = LIGHT_SPEED * 60L * 8;
        System.out.println(distance2); // 14400000000
    }

    @Test
    public void parseLong() {
        String s1 = "123";
        String s2 = "asd";
        String s3 = "299.90";
        System.out.println(Long.parseLong(s1)); // 123
        System.out.println(Long.parseLong(s2));
        // java.lang.NumberFormatException: For input string: "asd"
        System.out.println(Long.parseLong(s3));
        // java.lang.NumberFormatException: For input string: "299.90"
    }

    @Test
    public void valueOf() {
        String s1 = "123";
        String s2 = "asd";
        String s3 = "299.90";
        System.out.println(Long.valueOf(s1)); // 123
        System.out.println(Long.valueOf(s2)); // java.lang.NumberFormatException
        System.out.println(Long.valueOf(s3)); // java.lang.NumberFormatException
    }
}
