package day6.ticketdemo;

/**
 * @author Mrchen
 * @version 1.0
 * @date 2020/8/12 9:20
 */
public class Ticket implements Runnable {
    private int ticket = 100;
    Object lock = new Object();

    @Override
    public void run() {

        while (ticket > 0) {
            synchronized (lock) {
                if (ticket > 0) {
                    try {
                        Thread.sleep(50);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println(Thread.currentThread().getName() + ticket--);
                }
            }
        }
    }
}
