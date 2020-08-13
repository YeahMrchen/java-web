package day11.chat;

import java.io.BufferedWriter;
import java.io.IOException;
import java.util.Scanner;

/**
 * @author Mrchen
 * @version 1.0
 * @date 2020/8/13 16:17
 */
public class Write extends Thread{
    private  BufferedWriter writer;
    private  String name;

    public Write(BufferedWriter writer, String name) {
        this.writer = writer;
        this.name = name;
    }

    @Override
    public  void run() {
        while (true) {
            try {
                Scanner scanner = new Scanner(System.in);
                String str = scanner.nextLine();
                System.out.println(name + "：" + str);
                writer.write(str + "\n");
                writer.flush();
                if (str.equals("exit")) {
                    break;
                }
            } catch (IOException e) {
                e.printStackTrace();
            }

        }
    }
}
