package PolymorphismAndStaticMethods;

public  class Main {
    public static void main(String[] args) {
//        final int a = 5;
//    }
//
//    public final void printSomething() {
//
//    }
//        System.out.println(Human.age);
//        Human.printHelloWorld();
//
        Human human =new Human("dsads", WeeksDays.FRIDAY);
        System.out.println(human.getWorkinDay());
        System.out.println(human.getWorkinDay().getCode());
    }
}
