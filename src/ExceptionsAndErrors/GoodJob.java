package ExceptionsAndErrors;

public class GoodJob {
    public static void main(String[] args)  {
        try {
            print();
        } catch (Exception e) {
            e.printStackTrace();
        }
//        try {
//            int[] array = new int[1];
//            System.out.println(array[5]);
//        } catch (ArrayIndexOutOfBoundsException e) {
//            System.out.println("Обработка ошибки");
//        }
//        System.out.println("Ошибка пройдена");
//    }
//        try {
//            int[] array = new int[1];
//            System.out.println(array[5]);
//        } catch (Exception e) {
//            e.printStackTrace();
//            System.out.println(e.getCause());
//            System.out.println(e.getMessage());
//            System.out.println("Обработка ошибки");
//        } finally {
//            System.out.println("Блок finally");
//        }
//        System.out.println("Ошибка пройдена");
//    }
//        try {
//            int a = 5;
//            int b = 5;
//            if (true) {
//                throw new ArithmeticException();   // ВЫЗОВ ОШИБКИ
//            }
//        } catch (ArithmeticException e) {
//            e.printStackTrace();
//        }

    }
    public static void  print1() throws Exception{
        System.out.println("HelloWorld");
        throw new Exception();
    }

    public static void print () throws Exception {
        System.out.println("print");
        print1();
    }
}
