package inherit.interface_;

/**
 * @author xulei
 * Created on 2025-08-20 16:44
 */
public interface InterfaceWithDefaultMethods {

    void show();

    /**
     * 使用default关键字修饰抽象方法，表示该方法为接口中的默认方法
     */
    default int add(int num1, int num2) {
        return num1 + num2;
    }

    default int subtract(int num1, int num2) {
        return num1 - num2;
    }
}
