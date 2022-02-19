package oop.clock;

public class Tester {
    public static void main(String[] args) {
        Clock c1 = new Clock(12,45, 24);
        Clock c2 = new Clock(12,45, 12);
        System.out.println(c1);
        System.out.println(c2);
    }
}
