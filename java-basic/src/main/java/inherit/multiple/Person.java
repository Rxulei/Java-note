package inherit.multiple;

/**
 * @author xulei
 * Created on 2025-08-20 16:26
 */
public interface Person {

    default void eat() {
        System.out.println("Person eat");
    }
}
