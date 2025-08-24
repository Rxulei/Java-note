package enum_;

import java.util.Arrays;

/**
 * 季节枚举
 *
 * @author xulei
 * Created on 2025-08-20 09:07
 */
public enum SeasonEnum {
    UNKNOWN(0, "未知"),
    SPRING(1, "春天"),
    SUMMER(2, "夏天"),
    AUTUMN(3, "秋天"),
    WINTER(4, "冬天"),
    ;

    SeasonEnum(int code, String desc) {
        this.code = code;
        this.desc = desc;
    }

    /**
     * 枚举值
     */
    private int code;

    /**
     * 枚举描述
     */
    private String desc;

    public static SeasonEnum of(int code) {
        return Arrays.stream(SeasonEnum.values())
                .filter(t -> t.code == code)
                .findFirst()
                .orElse(SeasonEnum.UNKNOWN);
    }
}
