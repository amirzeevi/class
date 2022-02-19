package oop;

import java.util.Scanner;

public class MALBEN {
    private int width;
    private int length;

    public MALBEN() {
        this(10, 10);
    }

    public MALBEN(int width, int length) {
        this.width = width;
        this.length = length;
    }

    public int getWidth() {
        return width;
    }

    public boolean setWidth(int width) {
        this.width = width;
        return width > 0;
    }    // loop condition for width in main

    public int getLength() {
        return length;
    }

    public boolean setLength(int length) {
        this.length = length;
        return length > 0;
    }   // loop condition for length in main

    public void printPerimeter() {
        System.out.println("The Perimeter is " + 2 * (width + length));
    }

    public void printArea() {
        System.out.println("Tha Area is " + width * length);
    }

    public void printStar() {
        for (int row = 0; row < this.width; row++) {
            for (int col = 0; col < this.length; col++) {
                System.out.print("*  ");
            }
            System.out.println();
        }
    }

    public void printSymbol(char symbol) {
        for (int row = 0; row < this.width; row++) {
            for (int col = 0; col < this.length; col++) {
                System.out.print(symbol + "  ");
            }
            System.out.println();
        }
    }

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
