package wrapper;

import org.junit.jupiter.api.Test;

/**
 * @author xulei
 * Created on 2025-08-20 22:06
 */
public class DoubleTest {

    @Test
    public void parseDouble() {
        String s1 = "123.345";
        String s2 = "444";
        String s3 = "asd";

        System.out.println(Double.parseDouble(s1)); // 123.345
        System.out.println(Double.parseDouble(s2)); // 444.0
        System.out.println(Double.parseDouble(s3));
        // java.lang.NumberFormatException: For input string: "asd"
    }

    @Test
    public void valueOf() {
        String s1 = "123.345";
        String s2 = "444";
        String s3 = "asd";

        System.out.println(Double.valueOf(s1)); // 123.345
        System.out.println(Double.valueOf(s2)); // 444.0
        System.out.println(Double.valueOf(s3));
        // java.lang.NumberFormatException: For input string: "asd"
    }


}
