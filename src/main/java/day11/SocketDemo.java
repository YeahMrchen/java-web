package day11;

import java.io.*;
import java.net.Socket;
import java.util.Scanner;

/**
 * @author Mrchen
 * @version 1.0
 * @date 2020/8/12 10:55
 */
public class SocketDemo {
    public static void main(String[] args) throws IOException {
        Socket socket = new Socket("localhost", 6666);

        //输出流
        OutputStream os = socket.getOutputStream();
        BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(os);

//        //输入流
        InputStream inputStream = socket.getInputStream();
        InputStreamReader inputStreamReader = new InputStreamReader(inputStream);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);

        System.out.println("聊天已连接，请输入：");
        while (true) {
            Scanner scanner = new Scanner(System.in);
            String s = scanner.nextLine();
            bufferedOutputStream.write(s.getBytes());
            bufferedOutputStream.flush();


            String msg = bufferedReader.readLine();
            System.out.println(msg);


        }
    }
}
