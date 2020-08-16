package day11.chat;

import java.io.BufferedWriter;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

/**
 * @author Mrchen
 * @version 1.0
 * @date 2020/8/13 16:17
 */
public class Write extends Thread {
    private BufferedWriter writer;
    private String name;
    private Socket sock;

    public Write(BufferedWriter writer, String name,Socket o) {
        this.writer = writer;
        this.name = name;
        this.sock = o;
    }

    @Override
    public void run() {
        boolean flag = true;
        while (flag) {
            try {
                Scanner scanner = new Scanner(System.in);
                String str = scanner.nextLine();
                System.out.println(name + "：" + str);
                writer.write(str + "\n");
                writer.flush();
                if (str.equals("exit")) {
                    //sock.shutdownInput();
                   // sock.shutdownOutput();
                    sock.close();
                    flag = false;
                  //  flag = false;
                }
            } catch (IOException e) {
                flag = false;;
            }
        }

    }
}
