package FileIinputOutputStreams;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

public class Main {
    public static void main(String[] args) {
//        FileInputStream fileInputStream = null;
//        try {
//            fileInputStream = new FileInputStream("file.txt");
//            int a;
//            while ((a = fileInputStream.read()) != -1){
//                System.out.println((char) a);
//            }
//        } catch (IOException e) {
//            e.printStackTrace();
//        } finally {
//            if (fileInputStream != null) {
//                try {
//                    fileInputStream.close();
//                } catch (IOException e) {
//                    e.printStackTrace();
//                }
//            }
//        }
//    }
//        ++++++++++++++++++++++++++++++
//    try (FileInputStream fileInputStream = new FileInputStream("file.txt") ) {
//        int a;
//        while ((a = fileInputStream.read()) != -1) {
//            System.out.println((char) a);
//        }
//    } catch (IOException e) {
//        e.printStackTrace();
//    }
//        try (FileInputStream fileInputStream = new FileInputStream("file.txt") ) {
//        byte[] bytesArray = fileInputStream.readAllBytes();
//        String value = new String(bytesArray);
//        System.out.println(value);
//    } catch (IOException e) {
//        e.printStackTrace();
//    }
        try(FileOutputStream fileOutputStream = new FileOutputStream("file1.txt")) {
            String someValue = "Hello World";
            fileOutputStream.write(someValue.getBytes(StandardCharsets.UTF_8));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
