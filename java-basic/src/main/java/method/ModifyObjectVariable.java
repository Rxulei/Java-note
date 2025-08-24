package method;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author xulei
 * Created on 2025-08-20 15:49
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ModifyObjectVariable {
    private int age;
    private String name;

    public static void main(String[] args) {
        ModifyObjectVariable obj = new ModifyObjectVariable(29, "xl");
        System.out.println(obj); // SwapObjectVariable(age=29, name=xl)
        obj.changeInfo(obj);
        System.out.println(obj); // SwapObjectVariable(age=100, name=XL)
    }

    public void changeInfo(ModifyObjectVariable obj) {
        // 在方法中，修改对象的属性值
        obj.setAge(100);
        obj.setName("XL");
    }
}
