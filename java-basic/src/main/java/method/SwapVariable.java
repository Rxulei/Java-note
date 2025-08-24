package method;

import org.junit.jupiter.api.Test;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author xulei
 * Created on 2025-08-20 16:17
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class SwapVariable {
    private int age;
    private String name;

    public static void main(String[] args) {
        SwapVariable obj = new SwapVariable(26, "XuLei");
        System.out.println(obj); // SwapVariable(age=26, name=XuLei)
        obj.changeInfo(obj);
        System.out.println(obj); // SwapVariable(age=26, name=XuLei)
        // 原来的实参obj没有改变，验证了Java值传递的特性：复制引用的地址
    }

    public void changeInfo(SwapVariable obj) {
        SwapVariable newObj = new SwapVariable(123, "徐磊");

        // 形参指向新的对象
        obj = newObj;
        System.out.println(obj);
        // SwapVariable(age=123, name=徐磊)
    }
}
