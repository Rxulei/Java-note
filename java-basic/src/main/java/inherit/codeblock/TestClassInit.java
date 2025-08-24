package inherit.codeblock;

import org.checkerframework.checker.units.qual.A;

/**
 * @author xulei
 * Created on 2025-08-20 16:33
 */
public class TestClassInit {

    public static void main(String[] args) {
        SonCodeBlock obj1 = new SonCodeBlock();
        System.out.println("================");
        SonCodeBlock obj2 = new SonCodeBlock();
        /*
            父类的静态代码块被调用
            子类的静态代码块被调用
            子类的普通代码块被调用
            ================
            子类的普通代码块被调用
         */
    }
}
