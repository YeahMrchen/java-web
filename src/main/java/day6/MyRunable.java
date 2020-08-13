package day6;

/**
 * @author Mrchen
 * @version 1.0
 * @date 2020/8/12 9:03
 */
public class MyRunable implements Runnable{
    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println(Thread.currentThread().getName()+i);
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
