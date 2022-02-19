package oop;

public class AdultProg {
    public static void main(String[] args) {
        Adult p1 = new Adult("Yankale", 175, "Farmer");
        Adult p2 = new Adult("Moti", 188);
        Adult p3 = new Adult(p1);
        p1.print();
        p2.print();
        p3.print();
        p1.setOccupation("Driver");
        p3.print();     //Occupation for p3 does not change.
    }
}
