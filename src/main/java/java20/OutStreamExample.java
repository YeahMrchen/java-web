package java20;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * @author Mrchen
 * @version 1.0
 * @date 2020/8/10 11:43
 */
public class OutStreamExample {
    public static void main(String[] args) {
        String name = "D:\\IT\\java\\java-web/a.txt";
        try {
            FileOutputStream fos = new FileOutputStream(name,true);

//            byte[] bytes1 = "abcd".getBytes();
//            for (byte b : bytes1) {
//                System.out.println(b);
//            }

            byte[] words = {97,98,99,100,101};
            for (int i = 0;i<words.length;i++){
                fos.write(words[i]);
                fos.write("\r\n".getBytes());
            }
            //fos.write(bytes1);
            fos.close();
        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}
