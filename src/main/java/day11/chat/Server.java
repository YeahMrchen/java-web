package day11.chat;


import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

/**
 * @author Mrchen
 * @version 1.0
 * @date 2020/8/12 11:38
 */
public class Server {
    public static void main(String[] args) throws IOException {
        //创建serverSocket
        ServerSocket serverSocket = new ServerSocket(6666);

        while (true){
            Socket server = serverSocket.accept();
            //输入流
            BufferedReader reader = new BufferedReader(new InputStreamReader(server.getInputStream()));
            //输出流
            BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(server.getOutputStream()));
            //读数据，输出
            new Thread(new Runnable() {
                @Override
                public void run() {
                    while (true){
                        try {
                            String msg = reader.readLine();

                        } catch (IOException e) {
                            e.printStackTrace();
                        }

                    }
                }
            }).start();
        }




    }

}
