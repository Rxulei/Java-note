package method;

/**
 * @author xulei
 * Created on 2025-08-20 15:45
 */
public class SwapMethodTest {

    public static void main(String[] args) {
        int a = 1;
        int b = 2;
        System.out.println("before swap: a = " + a + ", b = " + b);
        // before swap: a = 1, b = 2

        swap(a, b);

        System.out.println("after swap: a = " + a + ", b = " + b);
        // after swap: a = 1, b = 2
    }

    public static void swap(int i, int j) {
        int temp = i;
        i = j;
        j = temp;
        System.out.println("swap: i = " + i + ", j = " + j);
        // swap: i = 2, j = 1
    }
}
