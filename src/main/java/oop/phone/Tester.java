package oop.phone;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Tester {
    public static void main(String[] args) throws FileNotFoundException {
        Phone p1 = new Phone("Amir", "0504678878");
        p1.setLastPay(4088);
        Phone p2 = new Phone("Dudi", "039656379");
        p2.setLastPay(65.26);
        Phone p3 = new Phone("Efraim", "911");
        p3.setLastPay(2000000);
        File file = new File("phone.txt");
        PrintWriter pw = new PrintWriter(file);
        p1.save(pw);
        p2.save(pw);
        p3.save(pw);
        pw.close();

        Scanner s = new Scanner(file);
        Phone p4 = new Phone(s);
        Phone p5 = new Phone(s);
        Phone p6 = new Phone(s);
        System.out.println(p4);
        System.out.println(p5);
        System.out.println(p6);
    }
}
