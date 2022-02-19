package oop;

import java.util.Scanner;

public class CarProg {
    public static void main(String[] args) {
        Car car1 = new Car();
        Scanner input = new Scanner(System.in);

        System.out.println("Please enter license number");
        car1.setLicenseNumber(input.nextInt());

        car1.show();

        System.out.println("How much do you want to accelerate?");
        car1.accelerate(input.nextInt());
        car1.show();
        car1.decelerate(2);
        car1.show();
        car1.stop();
        car1.show();
    }
}
