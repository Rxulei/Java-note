package other;

import java.util.Objects;

import org.junit.jupiter.api.Test;

import enum_.SeasonEnum;

/**
 * @author xulei
 * Created on 2025-08-20 09:35
 */
public class EnumTest {

    @Test
    public void testSwitchWithEnum() {
        SeasonEnum seasonWithNull = null;
        printSeasonDesc(seasonWithNull); // 输入错误

        SeasonEnum summer = SeasonEnum.SUMMER;
        printSeasonDesc(summer); // 夏天
    }

    public static void printSeasonDesc(SeasonEnum season) {
        // 使用前需要对枚举项判空，防止NPE
        if (Objects.isNull(season)) {
            season = SeasonEnum.UNKNOWN;
        }
        switch (season) {
            // 不可以使用：SeasonEnum.SPRING，直接使用 SPRING
            case SPRING:
                System.out.println("春天");
                break;
            case SUMMER:
                System.out.println("夏天");
                break;
            case AUTUMN:
                System.out.println("秋天");
                break;
            case WINTER:
                System.out.println("冬天");
                break;
            default:
                System.out.println("输入错误");
        }
    }
}
