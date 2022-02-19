package oop;

import java.util.Scanner;

public class MALBEN_Prog {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        MALBEN m1 = new MALBEN();

        System.out.println("Please Enter Width");
        while (!m1.setWidth(input.nextInt())) {
            System.out.println("Width value should be > 0 ");
        }
        System.out.println("Please Enter Length");
        while (!m1.setLength(input.nextInt())) {
            System.out.println("Length value should be > 0 ");
        }

        m1.printPerimeter();
        m1.printArea();
        m1.printStar();
        System.out.println();
        m1.printSymbol('$');
    }
}
