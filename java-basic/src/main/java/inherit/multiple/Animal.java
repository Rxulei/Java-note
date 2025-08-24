package inherit.multiple;

/**
 * @author xulei
 * Created on 2025-08-20 16:25
 */
public interface Animal {

    // 必须加上 default，因为抽象方法不能有方法体，默认方法才可以有方法体
    default void eat() {
        System.out.println("Annimal eat");
    }
}
