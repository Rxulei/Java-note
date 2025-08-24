package other;

/**
 * 三种注释
 *
 * 类注释，使用文档注释
 * @author xulei
 * Created on 2025-08-20 08:40
 */
public class CommentTest {

    /**
     * 类中的属性，用文档注释
     */
    private int age;

    /**
     * 类中的方法，用文档注释
     */
    public void testMethod() {
        // 方法内部的单行注释，在代码上方注释
        System.out.println("Hello World");

        /*
          方法内部的多行注释，解释一段代码
        */

        return;
    }
}
