package inherit.interface_;

/**
 * @author xulei
 * Created on 2025-08-20 16:39
 */
public class Calculator implements Calculate {

    @Override
    public int add(int a, int b) {
        return a + b;
    }

    @Override
    public int divide(int a, int b) {
        return a / b;
    }
}
