package oop.employee;

public class Tester {

    public static void main(String[] args) {
        int num = 999;
        Programmer Andy = new Programmer("Andy", num+=1, 1500);
        Secratry susan = new Secratry("Susan", num+=1, 1000, 120);
        Secratry kusan = new Secratry("kusan", num+=1, 1000, 120);
        System.out.println(Andy);
        System.out.println(susan);
        Andy.setSalary(Andy.calcBonus());
        susan.setSalary(susan.calcBonus());
        System.out.println(Andy);
        System.out.println(susan);
        System.out.println(kusan);
    }
}
