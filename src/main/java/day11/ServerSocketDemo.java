package day11;


import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

/**
 * @author Mrchen
 * @version 1.0
 * @date 2020/8/12 11:38
 */
public class ServerSocketDemo {
    public static void main(String[] args) throws IOException {
        //创建serverSocket
        ServerSocket serverSocket = new ServerSocket(6666);
        Socket server = serverSocket.accept();

        //输入流
        InputStream is = server.getInputStream();
        InputStreamReader reader = new InputStreamReader(is);
        //输出流
        OutputStream outputStream = server.getOutputStream();
        char[] chars = new char[100];
        while (true) {
            int read = reader.read(chars);
//            System.out.println(String.valueOf(chars, 0, read));
            if (read != 0) {
                System.out.println(String.valueOf(chars, 0, read));
            }

            Scanner scanner = new Scanner(System.in);
            String s = scanner.nextLine();
            outputStream.write(s.getBytes());
            outputStream.flush();
        }


//        byte[] bytes = new byte[20];
//        BufferedInputStream bufferedInputStream = new BufferedInputStream(is);

//        int read = bufferedInputStream.read(bytes);
//        String msg = new String(bytes);
//        System.out.println(msg);
////        System.out.println(read);
////        System.out.println(bytes.length);
//
//        for (byte b : bytes) {
//            if ((int)b != 0)
//            System.out.println(b);
//        }
//        is.close();
//        server.close();

    }

}
