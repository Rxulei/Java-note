package utils.jackson;

import org.junit.jupiter.api.Test;

import com.alibaba.fastjson.JSON;

/**
 * @author xulei
 * Created on 2025-08-21 16:05
 */
public class JacksonTest {

    @Test
    public void testJsonProperty() {
        StudentDto stu = StudentDto.builder()
                .stuName("xulei")
                .mathScore(112.5)
                .build();
        System.out.println(stu); // StudentDto(stuName=xulei, mathScore=112.5)

        // 使用@JsonProperty("stu_name")修饰属性后，得到的JSON对象中的属性：注解中描述的形式
        String json = JSON.toJSONString(stu);
        System.out.println(json); // {"math_score":112.5,"stu_name":"xulei"}

        StudentDto newStu = JSON.parseObject(json, StudentDto.class);
        System.out.println(newStu); // StudentDto(stuName=xulei, mathScore=112.5)
    }
}
