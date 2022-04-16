package IndependentWork;

import java.util.Scanner;

public class Menu {
    Scanner scanner = new Scanner(System.in);
    double firstNumber;
    double secondNumber;
    String mathOperation;

    void menu() {
        System.out.println("Меню: ");
        System.out.println("1) подсчет математической операции");
        System.out.println("2) выход");
        String a = scanner.next();
        SavingData sav = new SavingData();
        switch (a) {
            case "1":
                sav.vivod();
                menu();
                break;
            case "2":
                System.out.println("Вы вышли из калькулятора");
                break;
            default:
                System.out.println("Нет такого действия");
                menu();
        }
    }

    public void readingData() {
        System.out.println("Введите первое число");
        while (true) {
            if (scanner.hasNextDouble()) {
                firstNumber = scanner.nextDouble();
                break;
            } else {
                System.out.println("Вы ввели не число!Введите число");
            }
            scanner.next();
        }
        System.out.println("Введите второе число");
        while (true) {
            if (scanner.hasNextDouble()) {
                secondNumber = scanner.nextDouble();
                break;
            } else {
                System.out.println("Вы ввели не число!Введите число");
            }
            scanner.next();
        }
        System.out.println("Введите математическую операцию");
        while (true) {
            mathOperation = scanner.next();
            if (mathOperation.equals("-") || mathOperation.equals("+") || mathOperation.equals("/") || mathOperation.equals("*")) {
                break;
            } else {
                System.out.println("Вы ввели не математическую операцию!Введите мат.операцию");
                scanner.nextLine();
            }
        }
    }
}


