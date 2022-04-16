package PolymorphismAndStaticMethods;

import java.security.SecureRandom;

public class Human {

//    public static final int age = 25;
//    private static final int b = 15;
//    private int d;
//
//    public static void printHelloWorld() {
//        System.out.println("Hello World");
//    }

//    public  class Human1{
//        private int c;
//
//        public Human1(int c) {
//            this.c = c;
//        }
//
//        public int getC() {
//            return c;
//        }
//
//        public void setC(int c) {
//            this.c = c;
//            d = 5;
//        }
    private static final String HELLO_WORLD = "Hello World";
    private String name;
    private WeeksDays workinDay;

    public Human(String name, WeeksDays workinDay) {
        this.name = name;
        this.workinDay = workinDay;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public WeeksDays getWorkinDay() {
        return workinDay;
    }

    public void setWorkinDay(WeeksDays workinDay) {
        this.workinDay = workinDay;
    }

    public void printHelloWorld() {
        System.out.println(HELLO_WORLD);
    }
}
