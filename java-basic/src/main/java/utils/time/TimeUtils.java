package utils.time;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.ZoneId;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

/**
 * @author xulei
 * Created on 2025-08-24 11:38
 */
public class TimeUtils {

    /**
     * 根据实际要求，设置想要的字符串中的文案，
     */
    private static final String SDF_1 = "M月d日 HH:mm直播";

    public static String getLiveStartTime(long timeStamp) {
        SimpleDateFormat sdf = new SimpleDateFormat(SDF_1);
        return sdf.format(timeStamp);
    }

    /**
     * 最常用的时间格式字符串：2023-11-09 15:15:03
     */
    private static final String SDF_2 = "yyyy-MM-dd HH:mm:ss";

    public static String getStringTime(long timeStamp) {
        SimpleDateFormat sdf = new SimpleDateFormat(SDF_2);
        return sdf.format(timeStamp);
    }

    /**
     * 根据字符串格式的时间，转换为时间戳
     */
    public static long getLongDateTime(String date) {
        // 解析字符串的时间样式，需要保持一致：SDF_2
        SimpleDateFormat sdf = new SimpleDateFormat(SDF_2);
        try {
            return sdf.parse(date).getTime();
        } catch (ParseException e) {
            return 0L;
        }
    }

    /**
     * 获取两个时间戳间隔的天数
     */
    public static long getDaysBetweenTimestamps(long startTime, long endTime) {
        // 两个时间戳对应的Instant对象
        Instant start = Instant.ofEpochMilli(startTime);
        Instant end = Instant.ofEpochMilli(endTime);
        // 将时间戳转换成LocalDate
        LocalDate startDate = start.atZone(ZoneId.systemDefault()).toLocalDate();
        LocalDate endDate = end.atZone(ZoneId.systemDefault()).toLocalDate();
        // 计算两个日期的天数差
        return Duration.between(startDate.atStartOfDay(), endDate.atStartOfDay()).toDays();
    }

    /**
     * 获取当天0点的时间戳
     */
    public static long getNowDayStartTimestamp() {
        return LocalDate.now().atStartOfDay(ZoneId.systemDefault())
                .toInstant()
                .toEpochMilli();
    }

}
