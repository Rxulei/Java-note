package utils.fastjson;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.junit.jupiter.api.Test;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.TypeReference;

/**
 * @author xulei
 * Created on 2025-08-20 17:10
 */
public class FastJsonTest {

    @Test
    public void testToJson() {
        User user = new User("张三", 25, "zhangsan@example.com");

        // 将Java对象转换为JSON字符串：
        String jsonString = JSON.toJSONString(user);
        System.out.println(jsonString);
        // {"age":25,"email":"zhangsan@example.com","name":"张三"}
    }

    @Test
    public void testToObject() {
        // 将JSON字符串转换为Java对象
        String jsonInput = "{\"age\":25,\"email\":\"zhangsan@example.com\",\"name\":\"张三\"}";

        // 第一个参数是JSON字符串，第二个参数是要转换的目标类型
        User userObj = JSON.parseObject(jsonInput, User.class);
        System.out.println(userObj);
        // User(name=张三, age=25, email=zhangsan@example.com)
    }

    @Test
    public void testListToJson() {
        List<User> userList = new ArrayList<>();
        userList.add(new User("张三", 25, "zhangsan@example.com"));
        userList.add(new User("李四", 30, "lisi@example.com"));

        String listJson = JSON.toJSONString(userList);
        System.out.println(listJson);
        // [{"age":25,"email":"zhangsan@example.com","name":"张三"},{"age":30,"email":"lisi@example.com","name":"李四"}]
    }

    @Test
    public void testJsonToList() {
        String listJsonInput = "[{\"age\":25,\"email\":\"zhangsan@example.com\",\"name\":\"张三\"},{\"age\":30,\"email\":\"lisi@example.com\",\"name\":\"李四\"}]";
        List<User> parsedList = JSON.parseObject(listJsonInput, new TypeReference<>(){});
        parsedList.forEach(System.out::println);
        /**
         * User(name=张三, age=25, email=zhangsan@example.com)
         * User(name=李四, age=30, email=lisi@example.com)
         */
    }

    @Test
    public void testJsonField() {
        UserWithJSONField user = new UserWithJSONField("张三", "secret", new Date());
        String json = JSON.toJSONString(user);
        System.out.println(json);
        /**
         * {"birthday":"2025/08/20","userName":"张三"}
         */
    }
}
