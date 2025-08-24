package inherit.codeblock;

/**
 * @author xulei
 * Created on 2025-08-20 16:32
 */
public class SonCodeBlock extends ParentCodeBlock {

    static {
        System.out.println("子类的静态代码块被调用");
    }

    {
        System.out.println("子类的普通代码块被调用");
    }

    public SonCodeBlock(){

    }
}
