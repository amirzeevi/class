package oop;

import java.util.Scanner;

public class ClockProg {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean res;

        Clock c1 = new Clock();

        System.out.println("Please enter Hours:");
        do {
            res = c1.setHours(input.nextInt());
        } while (!res);

        System.out.println("Please enter Minutes:");
        do {
            res = c1.setMinutes(input.nextInt());
        } while (!res);

        System.out.println("Please enter Seconds:");
        do {
            res = c1.setSeconds(input.nextInt());
        } while (!res);


        c1.show();
        c1.tick(6000);
        c1.show();
        c1.setReset();
        c1.show();
    }
}
