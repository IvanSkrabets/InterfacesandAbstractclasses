package ExceptionsAndErrors;

import java.util.Random;

public class Car {
    String stamp;
    double speed;
    double price;

    public Car(String stamp, double speed, double price) {
        this.stamp = stamp;
        this.speed = speed;
        this.price = price;
    }

    public String getStamp() {
        return stamp;
    }

    public void setStamp(String stamp) {
        this.stamp = stamp;
    }

    public double getSpeed() {
        return speed;
    }

    public void setSpeed(double speed) {
        this.speed = speed;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void turnOnCar() throws MyOwnException{
        generateRandomValue();
    }
    private void generateRandomValue() throws MyOwnException{
        Random random = new Random();
        int randomValue = random.nextInt(21);
        isHonest(randomValue);
    }
    private void isHonest(int value) throws MyOwnException {
        if (value % 2 == 0) {
            throw new MyOwnException();
        } else {
            System.out.println("Машина завелась");
        }
    }
}
