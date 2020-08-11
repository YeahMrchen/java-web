package day8;

public class Str {
    public static void main(String[] args) {
        String str = "aasfdafdaf";
        str.length();
        str.equals("a");
        str.equalsIgnoreCase("as");

        System.out.println(str.concat("_a"));
        System.out.println(str.charAt(0));
        System.out.println(str.indexOf("sf"));
        System.out.println(str.substring(3));

        System.out.println(str.replace("a","z"));
        String[] fs = str.split("f");
        for (String f : fs) {
            System.out.println(f);
        }
    }
}
