package Homework;

import java.util.Scanner;

public class CalculatorInterfaceIMPL implements CalculatorInterface {

    public  void  calculate() {
        Scanner scanner = new Scanner(System.in);
        double firstNumber = scanner.nextDouble();
        double secondNumber = scanner.nextDouble();
        String mathOperation = scanner.next();
        action(firstNumber, secondNumber, mathOperation);
    }

    @Override
    public void action(double firstNumber, double secondNumber, String mathOperation) {
        switch (mathOperation){
            case "+":
                System.out.println(firstNumber + secondNumber);
                break;
            case "-":
                System.out.println(firstNumber - secondNumber);
                break;
            case "*":
                System.out.println(firstNumber * secondNumber);
                break;
            case "/":
                System.out.println(firstNumber / secondNumber);
                break;
            default:
                System.out.println("Нет такой математической операции");

        }
    }
}
