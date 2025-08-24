package operator;

import java.util.ArrayList;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

/**
 * @author xulei
 * Created on 2025-08-20 22:02
 */
public class InstanceOfTest {

    @Test
    public void test() {
        Object obj = "Hello world!";
        if (obj instanceof String) {
            // 如果不检查obj类型，直接转换为String，可能会抛出ClassCastException
            String str = (String) obj;
            System.out.println(str); // Hello world!
            System.out.println(str.length()); // 12
        }
    }

    @Test
    @DisplayName("根据数据类型，分别处理")
    public void testProcessData() {
        Object data1 = 123;
        Object data2 = "Hello world!";
        processData(data1); // 123
        processData(data2); // Hello world!
        processData(new ArrayList<>()); // Unsupported data type
    }

    public static void processData(Object data) {
        if (data instanceof Integer) {
            Integer number = (Integer) data;
            System.out.println(number);
        } else if (data instanceof String) {
            String str = (String) data;
            System.out.println(str);
        } else {
            System.out.println("Unsupported data type");
        }
    }
}
