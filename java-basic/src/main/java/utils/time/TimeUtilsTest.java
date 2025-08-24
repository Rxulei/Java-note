package utils.time;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

/**
 * @author xulei
 * Created on 2025-08-24 11:44
 */
public class TimeUtilsTest {

    @Test
    public void testGetLiveStartTime() {
        long now = System.currentTimeMillis();

        String stringTime = TimeUtils.getStringTime(now);
        System.out.println(stringTime); // 2025-08-24 11:39:34

        String liveStartTime = TimeUtils.getLiveStartTime(now);
        System.out.println(liveStartTime); // 8月24日 11:39直播
    }

    @Test
    public void testGetLongDateTime() {
        long now = System.currentTimeMillis();
        String stringTime = TimeUtils.getStringTime(now);
        System.out.println(stringTime); // 2025-08-24 11:42:21
        System.out.println(TimeUtils.getLongDateTime(stringTime)); // 1756006941000
    }

    @Test
    @DisplayName("测试相差7天的时间戳间隔天数")
    public void testGetDaysBetweenTimestamps() {
        long startTimeMills = 1719763200000l; // 2024-07-01 00:00:00
        long endTimeMils = 1720368000000l; // 2024-07-08 00:00:00
        long daysBetweenTimestamps = TimeUtils.getDaysBetweenTimestamps(startTimeMills, endTimeMils);
        System.out.println(daysBetweenTimestamps); // 7
    }

    @Test
    @DisplayName("测试同一年的时间戳间隔天数")
    public void testGetDaysBetweenTimestamps1() {
        long startTimeMills = 1720302931000L; // 2024-07-07 05:55:31
        long endTimeMils = 1720511731000L; // 2024-07-09 15:55:31
        long daysBetweenTimestamps = TimeUtils.getDaysBetweenTimestamps(startTimeMills, endTimeMils);
        System.out.println(daysBetweenTimestamps); // 2
    }

    @Test
    @DisplayName("测试相差1ms的两天的时间戳间隔天数")
    public void testGetDaysBetweenTimestamps2() {
        long startTimeMills = 1720540799999l; // 2024-07-09 23:59:59
        long endTimeMils = 1720540800000l; // 2024-07-10 00:00:00
        long daysBetweenTimestamps = TimeUtils.getDaysBetweenTimestamps(startTimeMills, endTimeMils);
        System.out.println(daysBetweenTimestamps); // 1
    }

    @Test
    @DisplayName("测试相差1ms的同一天的时间戳间隔天数")
    public void testGetDaysBetweenTimestamps3() {
        long startTimeMills = 1720540800000l; // 2024-07-10 00:00:00
        long endTimeMils = 1720540801001l; // 2024-07-10 00:00:00
        long daysBetweenTimestamps = TimeUtils.getDaysBetweenTimestamps(startTimeMills, endTimeMils);
        System.out.println(daysBetweenTimestamps); // 0
    }

    @Test
    @DisplayName("测试同一天的时间戳间隔天数")
    public void testGetDaysBetweenTimestamps4() {
        long startTimeMills = 1720622261524l; // 2024-07-10 22:37:41
        long endTimeMils = 1720622627000l; // 2024-07-10 22:43:47
        long daysBetweenTimestamps = TimeUtils.getDaysBetweenTimestamps(startTimeMills, endTimeMils);
        System.out.println(daysBetweenTimestamps); // 0
    }

    @Test
    @DisplayName("测试不同一年的时间戳间隔天数")
    public void testGetDaysBetweenTimestamps5() {
        long startTimeMills = 1735509331000L; // 2024-12-30 05:55:31
        long endTimeMils = 1735804531000L; // 2025-01-02 15:0:19
        long daysBetweenTimestamps = TimeUtils.getDaysBetweenTimestamps(startTimeMills, endTimeMils);
        System.out.println(daysBetweenTimestamps); // 3
    }

    @Test
    public void testGetNowDayStartTimestamp() {
        long nowDayStartTimestamp = TimeUtils.getNowDayStartTimestamp();
        System.out.println(nowDayStartTimestamp); // 1741276800000

        String stringTime = TimeUtils.getStringTime(nowDayStartTimestamp);
        System.out.println(stringTime); // 2025-08-24 00:00:00
    }
}
