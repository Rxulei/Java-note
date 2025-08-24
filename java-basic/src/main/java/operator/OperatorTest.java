package operator;

import java.util.List;
import java.util.Objects;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import com.google.common.collect.Lists;

/**
 * 运算符
 *
 * @author xulei
 * Created on 2025-08-20 08:46
 */
public class OperatorTest {

    @Test
    public void testIncreaseAndDecreaseOperator() {
        int num = 3;

        // 后置自增
        System.out.println(num++); // 3
        System.out.println(num); // 4

        /*
            后置自增，先使用变量值，再进行自增运算
         */

        // 前置自增
        System.out.println(++num); // 5
        System.out.println(num); // 5

        /*
            前置自增，先进行自增运算，再使用变量
         */

        int age = 27;

        // 后置自减（规则同上：后置自增）
        System.out.println(age--); // 27
        System.out.println(age); // 26

        // 前置自减（规则同上：前置自增）
        System.out.println(--age); // 25
        System.out.println(age); // 25
    }

    @Test
    public void testSwitchForString() {
        String str = "world";
        if (Objects.isNull(str)) {
            str = "";
        }
        switch (str) {
            case "hello":
                System.out.println("HELLO");
                break;
            case "world":
                System.out.println("WORLD");
                break;
            default:
                break;
        }
        // WORLD
    }

    @Test
    @DisplayName("使用return跳过foreach的当前循环，执行下一次")
    public void testForEach() {
        List<Integer> list = Lists.newArrayList(5, 3, 12, 1, 3);
        list.forEach(item -> {
            if (item > 4) {
            /*
                不可以用continue和break，因为forEach()的形参为方法：void accept(T t);
                终止一个返回值为void的方法，使用return
            */
                return;
            }
            System.out.println(item);
        });
        /**
         * 3
         * 1
         * 3
         */
    }
}
