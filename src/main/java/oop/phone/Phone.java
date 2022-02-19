package oop.phone;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;


public class Phone {
    protected String owner;
    protected String phoneNumber;
    protected double lastPay;

    public Phone(File file) throws FileNotFoundException {
        Scanner s = new Scanner(file);
        this.owner = s.next();
        this.phoneNumber = s.next();
        this.lastPay = s.nextDouble();
        s.close();
    }

    public Phone(Scanner s) throws FileNotFoundException {
        this.owner = s.next();
        this.phoneNumber = s.next();
        this.lastPay = s.nextDouble();

    }

    public Phone(String filename) throws FileNotFoundException {
        Scanner s = new Scanner(filename);
        this.owner = s.next();
        this.phoneNumber = s.next();
        this.lastPay = s.nextDouble();
        s.close();
    }

    public Phone(String name, String phoneNumber) {
        this.owner = name;
        this.phoneNumber = phoneNumber;
        this.lastPay = -1;
    }

    public void setLastPay(double lastPay) {
        this.lastPay = lastPay;
    }

    @Override
    public String toString() {
        return
                owner + " " + phoneNumber + " " + lastPay;
    }

    public File save(String fileName) throws FileNotFoundException {
        File file = new File(fileName);
        PrintWriter pw = new PrintWriter(file);
        pw.print(toString());
        pw.close();
        return file;
    }

    public void save(File file) throws FileNotFoundException {
        PrintWriter pw = new PrintWriter(file);
        pw.print(toString());
        pw.close();
    }

    public void save(PrintWriter pw) {
        pw.println(toString());
    }
}
