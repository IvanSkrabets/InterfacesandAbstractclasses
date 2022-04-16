package GoodJob;

public abstract class Human {
    private int a = 5;
    private String b = "sadasdsada";

    public Human(int a, String b) {
        this.a = a;
        this.b = b;
    }

    public void printHelloWorld() {
        System.out.println("HelloWorld");
    }

    abstract  void printSomething();
}
