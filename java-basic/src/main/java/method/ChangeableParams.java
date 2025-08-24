package method;

/**
 * @author xulei
 * Created on 2025-08-20 16:22
 */
public class ChangeableParams {

    public static void main(String[] args) {
        ChangeableParams obj = new ChangeableParams();

        System.out.println(obj.add(1, 2, 3)); // 6
        System.out.println(obj.add(9, 8)); // 17
    }

    /**
     * 可变长参数，本质上是一个数组：接受任意个数的参数
     */
    public int add(int... args) {
        int sum = 0;
        for (int i = 0; i < args.length; i++) {
            sum += args[i];
        }

        return sum;
    }
}
