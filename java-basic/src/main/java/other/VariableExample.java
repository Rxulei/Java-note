package other;

/**
 * @author xulei
 * Created on 2025-08-20 15:43
 */
public class VariableExample {

    /**
     * 成员变量
     */
    private String name;
    private int age;

    // 方法中的局部变量
    public void method() {
        // 栈中分配的局部变量
        int num1 = 10;
        // 栈中分配的局部变量
        String str = "Hello, world!";
    }

    // 带参数的方法中的局部变量
    public void method2(int num2) {
        // 栈中分配的局部变量
        int sum = num2 + 10;
    }

    // 构造方法中的局部变量
    public VariableExample(String name, int age) {
        // 对成员变量进行赋值
        this.name = name;
        // 对成员变量进行赋值
        this.age = age;

        // 栈中分配的局部变量
        int num3 = 20;

        // 栈中分配的局部变量
        String str2 = "Hello, " + this.name + "!";
    }
}
