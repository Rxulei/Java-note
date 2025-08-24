package datatype;

import java.math.BigInteger;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

/**
 * @author xulei
 * Created on 2025-08-20 09:42
 */
public class IntegerNumberTest {

    @Test
    public void testByteRange() {
        // [-128, 127]
        byte age = 127;
        age++;

        System.out.println(age); // -128
    }

    @Test
    public void showBigNumber() {
        long num = 123_456_789;
        int num2 = 2_347_123;

        System.out.println(num); // 123456789
        System.out.println(num2); // 2347123
    }

    @Test
    public void testIntegerCalculate() {
        char c = 'A';           // 本质上是：65
        System.out.println(c);  // A
        System.out.println((int) c); // 65
        System.out.println(c + 1);  // 66

        short i = 1;
        // i = i + 1; 报错, short类型的i和int类型的1相加，首先将short类型的i装换为int类型，再加1，结果为int类型，
        // 将int类型的值直接赋值给short类型的变量，会报错。

        // i+1为int类型，强制转换为short类型。
        i = (short) (i + 1);
        System.out.println(i); // 2

        short j = 1;
        j += 1;
        System.out.println(j); // 2
        // 不会报错，因为其中有隐含的强制类型转换：j = (short)(j + 1)
    }

    @Test
    @DisplayName("二进制转化为十进制")
    public void binaryToDecimal() {
        String binarySource = "11001";

        // 使用二进制形式的字符串初始化BigInteger，指定基数（进制）为2
        BigInteger binary = new BigInteger(binarySource, 2);

        // 将binary转化为字符串，使用Integer的parseInt()解析为整数
        int decimal = Integer.parseInt(binary.toString());
        System.out.println(decimal); // 25
    }

    @Test
    @DisplayName("十进制转换为二进制")
    public void decimalToBinary() {
        int decimal = 53;

        // 将十进制的整型转化为字符串形式，初始化BigInteger
        BigInteger decimalInteger = new BigInteger(String.valueOf(decimal));

        // 调用BigInteger的toString方法，指定基数为2（进制为2）
        String binaryString = decimalInteger.toString(2);

        System.out.println(binaryString); // 110101
    }

    @Test
    @DisplayName("整数越界")
    public void testIntegerRange() {
        int minValue = Integer.MIN_VALUE;

        // 发生了整数越界，int的取值范围[-2^31, 2^31-1]
        // 取绝对值后结果为2^31，超过int的取值范围，所以为负数
        System.out.println(Math.abs(minValue)); // -2147483648

        // 先将int转为long，再取绝对值，就不会有int整数越界的问题
        long abs = Math.abs((long) minValue);
        System.out.println(abs); // 2147483648
    }
}
