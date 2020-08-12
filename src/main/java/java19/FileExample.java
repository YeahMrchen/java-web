package java19;

import java.io.File;
import java.io.FileFilter;

/**
 * @author Mrchen
 * @version 1.0
 * @date 2020/8/10 10:38
 */
public class FileExample {
    public static void main(String[] args) {
        String pathname = "D:\\IT\\java\\java-web";
        File file = new File(pathname);
//        String path = file.getAbsolutePath();
//        System.out.println(file.getPath());
//        System.out.println(path);
//        System.out.println(file.getName());
//        System.out.println(file.getParent());
//        System.out.println(file.length());
//        System.out.println(file.length());
//        System.out.println(file.isDirectory());
//        String[] list = file.list();
//        for (String s : list) {
//            System.out.println(s);
//        }
//
//
//        System.out.println(file.exists());


        printDir(file);


    }

    private static void printDir(File file) {
//        File[] files = file.listFiles(new FileFilter() {
//            public boolean accept(File pathname) {
//                return pathname.getName().endsWith(".java")||pathname.isDirectory();
//            }
//        });

        File[] files = file.listFiles(f -> {
            return f.getName().endsWith(".java") || f.isDirectory();
        });
        for (File f : files) {
            if (f.isFile()){
                System.out.println(f.getName());
            }else{
                printDir(f);
            }
        }
    }
}
