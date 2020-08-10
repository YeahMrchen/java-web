package java20;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 * @author Mrchen
 * @version 1.0
 * @date 2020/8/10 14:13
 */
public class FileReaderExample {
    public static void main(String[] args) throws IOException {
        String name = "D:\\IT\\java\\java-web/a.txt";

        FileReader reader = new FileReader(name);

        char[] chars = new char[9];
        reader.read(chars);
        for (char c : chars) {
            System.out.println(c);
        }
        //System.out.println(new String(chars));
    }
}
