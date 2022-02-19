package oop.phoneBook;

import java.io.FileNotFoundException;

public class Tester {
    public static void main(String[] args) {
        PhoneBook ph1 = new PhoneBook("Amir", 10);
        ph1.add("039656379");
        ph1.add("0504678878");
        ph1.add("911");
        ph1.add("100");
        try {
            ph1.save("phoneBook.txt");
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        }
    }
}
