package day6.ticketdemo;

/**
 * @author Mrchen
 * @version 1.0
 * @date 2020/8/12 9:26
 */
public class MyTest {
    public static void main(String[] args) {
        Ticket ticket = new Ticket();
        Thread thread1 = new Thread(ticket,"thread1");
        Thread thread2 = new Thread(ticket, "thread2");
        Thread thread3 = new Thread(ticket, "thread3");
        thread1.start();
        thread2.start();
        thread3.start();
    }
}
