package String;

import java.nio.charset.StandardCharsets;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
//        String a = new String("Hello Wolrd");
        String a = "    Hello World    ";
        String b = "Hello World";
        System.out.println("equls   "+  a.equals(b));
        System.out.println("getBytes   "+ Arrays.toString(a.getBytes(StandardCharsets.UTF_8)));
        System.out.println("toLowerCase   "+ a.toLowerCase());
        System.out.println("toUpperCase   " + a.toUpperCase());
        System.out.println("char   " + a.charAt(0));
        System.out.println("chars   " + a.chars());
        System.out.println("compareTo    " + a.compareTo(b));
        System.out.println("compareTooignoreCase   " + a.compareToIgnoreCase(b));
        System.out.println("concat   " + a.concat(b));
        System.out.println("endsWith    " + a.endsWith("ld"));
        System.out.println("length    " + a.length());
        System.out.println("replsce    " + a.replace("l","P"));
        System.out.println("Spit      " + Arrays.toString(a.split("  ")));
        System.out.println("substring       " + a.substring(2));
        String c = "                      Hello World                  ";
        System.out.println("a.trim     " + a.trim());
        System.out.println(a.isEmpty());
        System.out.println(a.isBlank());
        System.out.println("++++++++++++++++++++++++++++++++");
        StringBuilder h = new StringBuilder("hello world");
        System.out.println(h.append("fdfdfd").append("dsdsds"));
    }
}
