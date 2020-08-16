package day11.chat;

import java.io.BufferedReader;
import java.io.IOException;

/**
 * @author Mrchen
 * @version 1.0
 * @date 2020/8/13 16:17
 */
public class Read extends Thread{
    private BufferedReader reader;
    private String name;
    public Read(BufferedReader reader,String name){
        this.reader = reader;
        this.name = name;
    }
    @Override
    public void run() {
        try {
            String msg;
            while ((msg = reader.readLine()) != null){
                System.out.println(name+":"+msg);
            }
        } catch (IOException e) {
            try {
                reader.close();
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }
    }
}
