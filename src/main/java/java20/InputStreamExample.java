package java20;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * @author Mrchen
 * @version 1.0
 * @date 2020/8/10 14:02
 */
public class InputStreamExample {
    public static void main(String[] args) throws IOException {
        String name = "D:\\IT\\java\\java-web/a.txt";
        FileInputStream inputStream = new FileInputStream(name);

//        int read;
//        while ((read = inputStream.read()) != -1) {
//            System.out.println(read);
//        }
        byte[] bytes = new byte[100];
        inputStream.read(bytes);
        System.out.println(new String(bytes));


        inputStream.close();
    }
}

