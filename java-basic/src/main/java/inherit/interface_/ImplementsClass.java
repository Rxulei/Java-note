package inherit.interface_;

/**
 * @author xulei
 * Created on 2025-08-20 16:45
 */
public class ImplementsClass implements InterfaceWithDefaultMethods {

    @Override
    public void show() {
        System.out.println("This is ImplementsClass show");
    }

    @Override
    public int add(int num1, int num2) {
        return num1 + num2 + 1000;
    }

    // @Override
    // public int subtract(int num1, int num2) {}
}
