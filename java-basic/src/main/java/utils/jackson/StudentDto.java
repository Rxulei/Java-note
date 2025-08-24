package utils.jackson;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author xulei
 * Created on 2025-08-21 15:54
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class StudentDto {

    /**
     * 姓名
     */
    @JsonProperty("stu_name")
    private String stuName;

    /**
     * 数学分数
     */
    @JsonProperty("math_score")
    private double mathScore;
}
