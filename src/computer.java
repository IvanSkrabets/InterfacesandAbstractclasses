import java.util.Random;
import java.util.Scanner;

public class computer {
    String cpu;
    int ram;
    int hdd;
    int fullLifeCycle = 3;

    public computer(String cpu, int ram, int hdd, int fullLifeCycle) {
        this.cpu = cpu;
        this.ram = ram;
        this.hdd = hdd;
        this.fullLifeCycle = fullLifeCycle;
    }

    @Override
    public String toString() {
        return "computer{" +
                "cpu='" + cpu + '\'' +
                ", ram=" + ram +
                ", hdd=" + hdd +
                ", fullLifeCycle=" + fullLifeCycle +
                '}';
    }

    public void turnOn(){
//         Random random = new Random();
//         int randomValye = random.nextInt(2);
//         Scanner scanner = new Scanner(System.in);
//         int userEnteredValye = scanner.nextInt();
//         if (randomValye == userEnteredValye && fullLifeCycle > 0) {
        if (isEquelNumbers() && fullLifeCycle > 0) {
            System.out.println("Компьютер включен");
        } else {
            System.out.println("Компьютер сгорел");
        }
    }

    public void turnOff() {
//        Random random = new Random();
//        int randomValye = random.nextInt(2);
//        Scanner scanner = new Scanner(System.in);
//        int userEnteredValye = scanner.nextInt();
//        if (randomValye == userEnteredValye && fullLifeCycle > 0) {
        if (isEquelNumbers() && fullLifeCycle > 0) {
            System.out.println("Компьютер включен");
            fullLifeCycle--;
        } else {
            System.out.println("Компьютер сгорел");
        }
      }
    public boolean isEquelNumbers(){
        Random random = new Random();
        int randomValye = random.nextInt(2);
        Scanner scanner = new Scanner(System.in);
        int userEnteredValye = scanner.nextInt();
        return randomValye == userEnteredValye;
    }
    }

