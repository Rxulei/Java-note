package inherit.interface_;

import org.junit.jupiter.api.Test;

/**
 * @author xulei
 * Created on 2025-08-20 16:39
 */
public class InterfaceTest {

    @Test
    public void testInterfaceUsage() {
        // 错误写法: 不能直接new接口对象
        // Calculate obj = new Calculate();

        // 接口的引用，指向接口实现类的对象
        Calculate calculator = new Calculator();

        // 调用接口中定义的方法
        int sum = calculator.add(3, 4);
        System.out.println(sum); // 7

        int res = calculator.divide(10, 5);
        System.out.println(res); // 2
    }

    @Test
    public void testInterfaceDefaultMethods() {
        ImplementsClass obj = new ImplementsClass();

        obj.show(); // This is ImplementsClass show

        // 重写了接口的默认方法，使用重写后的逻辑
        System.out.println(obj.add(10, 20)); // 1030

        // 没有重写接口中的默认方法，使用接口中默认实现
        System.out.println(obj.subtract(100, 40)); // 60
    }
}
