package inherit.multiple;

/**
 * @author xulei
 * Created on 2025-08-20 16:27
 */
public class ImplMultipleInterface implements Animal, Person {
    // 实现的两个接口中，都有eat()的默认实现，强制实现类必须重写eat()
    @Override
    public void eat() {
        System.out.println("override eat...");
    }

    public static void main(String[] args) {
        ImplMultipleInterface obj = new ImplMultipleInterface();
        obj.eat(); // override eat...
    }
}
