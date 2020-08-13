package day6;

/**
 * @author Mrchen
 * @version 1.0
 * @date 2020/8/12 8:46
 */
public class MyThread  extends Thread{
    public MyThread(String name){
        super(name);
    }

    public void run(){
        for (int i = 0; i < 20; i++) {
            System.out.println(getName()+i);
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
