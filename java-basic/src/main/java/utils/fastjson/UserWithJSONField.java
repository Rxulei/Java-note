package utils.fastjson;

import java.util.Date;

import com.alibaba.fastjson.annotation.JSONField;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author xulei
 * Created on 2025-08-20 17:29
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserWithJSONField {

    /**
     * 序列化和反序列化时，字段名name对应JSON中的userName
     */
    @JSONField(name = "userName")
    private String name;

    /**
     * 序列化时忽略此字段（不会输出到JSON）
     */
    @JSONField(serialize = false)
    private String password;

    /**
     * 指定日期格式
     */
    @JSONField(format = "yyyy/MM/dd")
    private Date birthday;
}
