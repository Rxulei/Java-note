package utils.time;

import java.time.Duration;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

/**
 * @author xulei
 * Created on 2025-08-22 09:35
 */
public class DurationTest {

    @Test
    public void testOfDays() {
        // 通过静态方法: ofXxx(long l) 创建Duration对象
        Duration oneDay = Duration.ofDays(1L);
        Duration oneHour = Duration.ofHours(1L);
        Duration oneMinute = Duration.ofMinutes(1L);
        Duration oneSecond = Duration.ofSeconds(1L);
        Duration oneMillisecond = Duration.ofMillis(1L);

        //  toDays() : 返回Duration对象对应的天数
        long oneDayToDay = oneDay.toDays();
        System.out.println(oneDay.getSeconds()); // 86400
        System.out.println(oneDayToDay); // 1

        long oneHourToday = oneHour.toDays();
        System.out.println(oneHourToday); // 0

        long oneMinuteToDay = oneMinute.toDays();
        System.out.println(oneMinuteToDay); // 0

        // toHours() : 返回Duration对象对应的小时数
        long oneDayToHours = oneDay.toHours();
        System.out.println(oneDayToHours); // 24

        long oneHourToHours = oneHour.toHours();
        System.out.println(oneHourToHours); // 1

        long oneMinuteToHours = oneMinute.toHours();
        System.out.println(oneMinuteToHours); // 0

        // toMinutes()
        long oneDayToMinutes = oneDay.toMinutes();
        System.out.println(oneDayToMinutes); // 24 * 60 = 1440

        long oneHourToMinutes = oneHour.toMinutes();
        System.out.println(oneHourToMinutes); // 60

        long oneMinuteToMinutes = oneMinute.toMinutes();
        System.out.println(oneMinuteToMinutes); // 1

        // toSeconds()
        long oneDayToSeconds = oneDay.toSeconds();
        System.out.println(oneDayToSeconds); // 24 * 60 * 60 = 86400

        long oneHourToSeconds = oneHour.toSeconds();
        System.out.println(oneHourToSeconds); // 60 * 60 = 3600

        long oneMinuteToSeconds = oneMinute.toSeconds();
        System.out.println(oneMinuteToSeconds); // 60

        // toMillis()
        long oneMinuteToMillis = oneMinute.toMillis();
        System.out.println(oneMinuteToMillis); // 60 * 1000 = 60000

        long oneSecondToMillis = oneSecond.toMillis();
        System.out.println(oneSecondToMillis); // 1000

        long oneMilliSecondToMillis = oneMillisecond.toMillis();
        System.out.println(oneMilliSecondToMillis); // 1
    }

    @Test
    @DisplayName("常用使用场景")
    public void testUseExamples() {
        // 已知DB中，好运来活动的时长为180000，单位：毫秒
        long lotteryDuration = 180000L;

        // 将以毫秒为单位的活动时长，转换为分钟，用于详情页展示
        long lotteryMinutes = Duration.ofMillis(lotteryDuration).toMinutes();
        System.out.println(lotteryMinutes + "分钟"); // 3分钟

        // 将前端创建传过来的活动时长（单位：分钟），转化为毫秒，存储到DB中
        long millis = Duration.ofMinutes(5).toMillis();
        System.out.println(millis + "ms"); // 300000ms
    }
}
