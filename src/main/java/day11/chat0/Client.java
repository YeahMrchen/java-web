package day11.chat0;

import java.io.*;
import java.net.Socket;
import java.util.Scanner;

/**
 * @author Mrchen
 * @version 1.0
 * @date 2020/8/12 10:55
 */
public class Client {
    public static void main(String[] args) throws IOException {
        Socket socket = new Socket("localhost", 6666);
        System.out.println("客户端创建远程连接"+socket.getRemoteSocketAddress());
        //输出流
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
        //写
        while (true) {
            try {
                Scanner scanner = new Scanner(System.in);
                String str = scanner.nextLine();
                System.out.println("客户端" + "：" + str);
                writer.write(str + "\n");
                writer.flush();
                if (str.equals("exit")) {
                    break;
                }
            } catch (IOException e) {
                e.printStackTrace();
            }

        }

        socket.shutdownOutput();
        System.out.println("客户端关闭");
    }
}

