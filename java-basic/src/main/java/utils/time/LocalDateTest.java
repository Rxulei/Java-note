package utils.time;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Month;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

/**
 * @author xulei
 * Created on 2025-08-22 09:36
 */
public class LocalDateTest {

    @Test
    @DisplayName("初始化LocalDate")
    public void testInitLocalDate() {
        LocalDate nowDate = LocalDate.now();
        System.out.println(nowDate); // 2025-08-24

        LocalDate localDate = LocalDate.of(2025, 3, 20);
        System.out.println(localDate); // 2025-03-20

        LocalDate localDate2 = LocalDate.of(2025, Month.DECEMBER, 20);
        System.out.println(localDate2); // 2025-12-20
    }

    @Test
    @DisplayName("获取LocalDate的年月日")
    public void testGetYearMonthDay() {
        LocalDate nowDate = LocalDate.now();
        int year = nowDate.getYear();
        System.out.println(year); // 2025

        int month = nowDate.getMonthValue();
        System.out.println(month); // 8

        Month month2 = nowDate.getMonth();
        System.out.println(month2); // AUGUST

        int day = nowDate.getDayOfMonth();
        System.out.println(day); // 24

        int dayOfYear = nowDate.getDayOfYear();
        System.out.println(dayOfYear); // 236

        DayOfWeek dayOfWeek = nowDate.getDayOfWeek();
        System.out.println(dayOfWeek); // SUNDAY

        System.out.println(nowDate.isLeapYear()); // false
        System.out.println(nowDate.lengthOfMonth()); // 31
        System.out.println(nowDate.lengthOfYear()); // 365
    }

    @Test
    @DisplayName("LocalDate的加减")
    public void testLocalDateAdd() {
        LocalDate nowDate = LocalDate.now();
        System.out.println(nowDate); // 2025-08-24

        LocalDate localDate = nowDate.plusDays(10);
        System.out.println(localDate); // 2025-09-03

        LocalDate localDate1 = localDate.minusDays(3);
        System.out.println(localDate1); // 2025-08-31

        LocalDate localDate2 = localDate1.plusMonths(3);
        System.out.println(localDate2); // 2025-11-30

        LocalDate localDate3 = localDate2.minusMonths(1);
        System.out.println(localDate3); // 2025-10-30

        LocalDate localDate4 = localDate3.plusYears(2);
        System.out.println(localDate4); // 2027-10-30

        LocalDate localDate5 = localDate4.minusYears(1);
        System.out.println(localDate5); // 2026-10-30
    }
}
