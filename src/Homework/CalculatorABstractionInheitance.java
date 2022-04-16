package Homework;

import java.util.Scanner;

public class CalculatorABstractionInheitance extends CalculatorAbstarct {

    public  void  calculate() {
        Scanner scanner = new Scanner(System.in);
        double firstNumber = scanner.nextDouble();
        double secondNumber = scanner.nextDouble();
        String mathOperation = scanner.next();
       calculate(firstNumber, secondNumber, mathOperation);
    }
    @Override
    void calculate(double firstNumber, double secondNumber, String mathOperation) {
        if (mathOperation.equals("+")) {
            System.out.println(firstNumber + secondNumber);
        } else if (mathOperation.equals("-")){
            System.out.println(firstNumber - secondNumber);
        } else if (mathOperation.equals("*")) {
            System.out.println(firstNumber * secondNumber);
        } else if (mathOperation.equals("/")) {
            System.out.println(firstNumber / secondNumber);
        } else {
            System.out.println("Такой математической операции не существует");
        }
    }
}
