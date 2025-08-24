package utils.jdk;

import org.junit.jupiter.api.Test;

/**
 * @author xulei
 * Created on 2025-08-22 09:33
 */
public class SystemTest {

    @Test
    public void testCurrentTimeMillis() {
        // 起始时间
        long start = System.currentTimeMillis();
        System.out.println("start = " + start);
        // start = 1755826413964

        int res = 0;
        for (int i = 0; i < 10000000; i++) {
            res += i;
        }

        // 终止时间
        long end = System.currentTimeMillis();
        System.out.println("end = " + end);
        // end = 1755826413979

        // 代码运行时间
        long interval = end - start;
        System.out.println("interval = " + interval);
        // interval = 15
    }

    @Test
    public void testExit() {
        for (int i = 0; i < 10; i++) {
            if (i == 5) {
                System.exit(2);
            }
            System.out.print(i + " "); // 0 1 2 3 4
        }

        System.out.println("正常结束！"); // 没有执行
    }
}
