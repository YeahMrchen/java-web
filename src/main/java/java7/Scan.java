package java7;
import java.util.*;

public class Scan {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        sc.nextInt();
        //String line = sc.nextLine();
        String line;
        while ((line=sc.nextLine()) != null){
            System.out.println(line);
        }

    }
}
