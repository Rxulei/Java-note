package thread;

import java.util.concurrent.TimeUnit;

import org.junit.jupiter.api.Test;

/**
 * @author xulei
 * Created on 2025-08-21 15:46
 */
public class ThreadTest {

    @Test
    public void testSleep() {
        try {
            // 睡眠2s
            Thread.sleep(2000L);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Thread.sleep(2000L) 睡眠2s结束");

        try {
            // 睡眠2s
            TimeUnit.SECONDS.sleep(2);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("TimeUnit.SECONDS.sleep(2) 睡眠2s结束");

        try {
            // 睡眠3000ms
            TimeUnit.MILLISECONDS.sleep(3000L);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("TimeUnit.MILLISECONDS.sleep(3000L) 睡眠3s结束");
    }
}
