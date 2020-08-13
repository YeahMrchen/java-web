package day11.chat;

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
        //输入流
        BufferedReader reader = new BufferedReader(new InputStreamReader(socket.getInputStream()));

        new Read(reader, "服务端").start();
        new Write(writer, "客户端").start();

        //socket.shutdownOutput();
        //System.out.println("客户端关闭");
    }
}

