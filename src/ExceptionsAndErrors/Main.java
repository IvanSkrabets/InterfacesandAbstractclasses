package ExceptionsAndErrors;

public class Main {
    public static void main(String[] args) {
        Car car = new Car("Lada", 700, 100);
        try {
            car.turnOnCar();
        } catch (MyOwnException e) {
            System.out.println("Бросилась ошибка");
        }
        try {
            car.turnOnCar();
        } catch (MyOwnException e) {
            System.out.println("Бросилась ошибка");
        }
        try {
            car.turnOnCar();
        } catch (MyOwnException e) {
            System.out.println("Бросилась ошибка");
        }
        try {
            car.turnOnCar();
        } catch (MyOwnException e) {
            System.out.println("Бросилась ошибка");
        }try {
            car.turnOnCar();
        } catch (MyOwnException e) {
            System.out.println("Бросилась ошибка");
        }try {
            car.turnOnCar();
        } catch (MyOwnException e) {
            System.out.println("Бросилась ошибка");
        }
        try {
            car.turnOnCar();
        } catch (MyOwnException e) {
            System.out.println("Бросилась ошибка");
        }
    }
}
