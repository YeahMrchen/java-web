package day6;

/**
 * @author Mrchen
 * @version 1.0
 * @date 2020/8/12 8:43
 */
public class ThreadExample {

    public static void main(String[] args) throws InterruptedException {
        //MyThread myThread = new MyThread("myThread");
        //myThread.start();
        MyRunable myRunable = new MyRunable();
        Thread thread = new Thread(myRunable);
        thread.start();
        for (int i = 0; i < 20; i++) {
            System.out.println(Thread.currentThread().getName()+i);
            Thread.sleep(100);
        }
    }

}
