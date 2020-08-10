package java20;

import java.io.FileWriter;
import java.io.IOException;

/**
 * @author Mrchen
 * @version 1.0
 * @date 2020/8/10 14:39
 */
public class FileWriterExample {
    public static void main(String[] args) throws IOException {
        String name = "D:\\IT\\java\\java-web/a.txt";
        FileWriter fileWriter = new FileWriter(name,true);

//        char[] c = "陈文星".toCharArray();
//
//        fileWriter.write(c);
//        fileWriter.flush();
//        fileWriter.write(c);
//        fileWriter.close();

        String msg = "陈文星";
        fileWriter.write(msg);
        fileWriter.write(msg,1,2);
        fileWriter.close();
    }
}
