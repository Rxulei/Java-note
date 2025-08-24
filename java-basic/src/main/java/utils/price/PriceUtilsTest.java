package utils.price;

import org.junit.jupiter.api.Test;

/**
 * @author xulei
 * Created on 2025-08-24 11:51
 */
public class PriceUtilsTest {

    @Test
    public void test() {
        long longCent = 123450;
        long longYuan = 789;
        String strYuan = "234.567";
        String strCent = "456789";

        System.out.println(PriceUtils.longCent2StringYuan(longCent)); // 1234.5
        System.out.println(PriceUtils.longYuan2StringFen(longYuan));  // 78900
        System.out.println(PriceUtils.stringYuan2LongFen(strYuan)); // 23457
        System.out.println(PriceUtils.stringCent2StringYuan(strCent)); // 45678900
    }
}
