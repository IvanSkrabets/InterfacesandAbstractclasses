package IndependentWork;

import java.util.Scanner;

public class SavingData extends Calculator {
    Scanner scanner = new Scanner(System.in);
    Menu pusk = new Menu();
    double[] array = new double[3];
    int i = 0;

    public void vivod() {
        while (i < 3) {
            pusk.readingData();
            array[i] = action(pusk.firstNumber, pusk.secondNumber, pusk.mathOperation);
            System.out.println("Меню: ");
            System.out.println("1) подсчет математической операции");
            System.out.println("2) Вывод значений");
            System.out.println("3) выход");
            String a;
            while (true) {
               a = scanner.next();
                if (a.equals("1") || a.equals("2") || a.equals("3")) {
                    break;
                } else {
                    System.out.println("Нет такого действия");
                    scanner.nextLine();
                }
            }
            switch (a) {
                case "1":
                    if (i < 2) {
                        i++;
                    } else {
                        i = 0 ;
                    }
                    break;
                case "2":
                    for (i = 0; i < 3; i++) {
                        System.out.print("  " + array[i]);
                    }
                    System.out.println();
                    break;
                case "3":
                    System.out.println("Вы вышли из калькулятора");
                    System.exit(0);
            }
        }
    }
}
//            if (a == 1) {
//                if (i < 2) {
//                    i++;
//                } else {
//                    i = 0 ;
//                }
//            }
//            if (a == 2) {
//                for (i = 0; i < 3; i++) {
//                    System.out.print("  " + array[i]);
//                }
//                System.out.println();
//            }
//            if (a == 3) {
//                System.out.println("Вы вышли из калькулятора");
//                System.exit(0);
//            } else {
//                System.out.println("Нет такого действия");
//            }


