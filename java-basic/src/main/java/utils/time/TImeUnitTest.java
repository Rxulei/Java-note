package utils.time;

import java.util.concurrent.TimeUnit;

import org.junit.jupiter.api.Test;

/**
 * @author xulei
 * Created on 2025-08-22 09:35
 */
public class TImeUnitTest {

    @Test
    public void testTimeUnit() {
        // 3秒对应的毫秒
        long millis = TimeUnit.SECONDS.toMillis(3);
        System.out.println(millis); // 3000

        // 3小时对应的秒数
        long seconds = TimeUnit.HOURS.toSeconds(3);
        System.out.println(seconds); // 10800

        // 24小时对应的毫秒
        long millis2 = TimeUnit.HOURS.toMillis(24);
        System.out.println(millis2); // 86400000

        // 3天对应的分钟
        long minutes = TimeUnit.DAYS.toMinutes(3);
        System.out.println(minutes); // 4320
    }

    @Test
    public void testSleep() {
        try {
            System.out.println("开始睡眠");
            // 睡眠5秒
            TimeUnit.SECONDS.sleep(5);
            System.out.println("结束睡眠");
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
