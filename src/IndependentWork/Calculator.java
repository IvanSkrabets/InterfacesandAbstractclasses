package IndependentWork ;

public class Calculator implements CalculatorInterface {
    double result;
    public double action( double firstNumber, double secondNumber, String mathOperation) {
        switch (mathOperation) {
            case "+":
                System.out.println(result = firstNumber + secondNumber);
                break;
            case "-":
                System.out.println(result = firstNumber - secondNumber);
                break;
            case "*":
                System.out.println(result = firstNumber * secondNumber);
                break;
            case "/":
                System.out.println(result = firstNumber / secondNumber);
                break;
        }
//        double[] array = new double[5];
//        int i;
//        for (i=0; i < 4; i++) {
//            array[i] = result;
//            Menu pusk = new Menu();
//            pusk.menu();
//            System.out.print("  " + array[i]);
//        }
        return result;
    }
}
