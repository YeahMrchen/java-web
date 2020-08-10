package java21;

import java.io.*;

/**
 * @author Mrchen
 * @version 1.0
 * @date 2020/8/10 15:00
 */
public class BufferInputOutput {
    public static void main(String[] args) {
        try (
                BufferedInputStream bufferedInputStream = new BufferedInputStream(new FileInputStream("a.txt"));
                BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(new FileOutputStream("copy.txt"));
        ) {
            int b;
            while ((b = bufferedInputStream.read()) != -1) {
                bufferedOutputStream.write(b);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
