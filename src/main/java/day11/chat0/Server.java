package day11.chat0;


import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * @author Mrchen
 * @version 1.0
 * @date 2020/8/12 11:38
 */
public class Server {
    public static void main(String[] args) throws IOException {
        //创建serverSocket
        ServerSocket serverSocket = new ServerSocket(6666);
        System.out.println("服务端创建,端口为" + serverSocket.getLocalPort());
        while (true) {
            Socket server = serverSocket.accept();
            System.out.println(server.getInetAddress() + " 客户端已连接");
            //输入流
            BufferedReader reader = new BufferedReader(new InputStreamReader(server.getInputStream()));

            //读数据
            String msg;
            while ((msg = reader.readLine()) != null) {
                System.out.println("客户端" + ":" + msg);
            }
        }
    }
}
