package utils.price;

import java.math.BigDecimal;
import java.math.RoundingMode;

/**
 * @author xulei
 * Created on 2025-08-24 11:49
 */
public class PriceUtils {

    /**
     * 整型的分 -> 字符串类型的元
     * 四舍五入的方式保留两位小数，如果小数末尾是0，则省去0
     */
    public static String longCent2StringYuan(long cent) {
        return new BigDecimal(cent)
                .divide(new BigDecimal(100L), 2, RoundingMode.HALF_UP)
                .stripTrailingZeros() // 去除小数部分末尾的0
                .toPlainString(); // 显示完整的字符串，不显示科学计数法形式的字符串
    }

    /**
     * 整型的元 -> 字符串类型的分
     * 四舍五入的方式保留两位小数，如果小数末尾是0，则省去0
     */
    public static String longYuan2StringFen(long yuan) {
        return new BigDecimal(yuan)
                .multiply(new BigDecimal(100))
                .toPlainString();
    }

    /**
     * 字符串类型的元 -> 整型分
     * 四舍五入的方式保留两位小数
     */
    public static long stringYuan2LongFen(String amount) {
        return new BigDecimal(amount)
                .setScale(2, RoundingMode.HALF_UP)
                .multiply(new BigDecimal(100))
                .longValue(); // 显示完整的字符串
    }

    /**
     * 字符串类型的分 -> 转字符串类型的元
     */
    public static String stringCent2StringYuan(String price) {
        return new BigDecimal(price)
                .multiply(new BigDecimal(100))
                .toPlainString();
    }


}
