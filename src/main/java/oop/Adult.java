package oop;

public class Adult {
    private final String name;
    private final int height;
    private String occupation;

    public Adult(String name, int height, String occupation) {
        this.name = name;
        this.height = height;
        this.occupation = occupation;
    }

    public Adult(String name, int height) {
        this(name, height, "");
    }

    public Adult(Adult other) {
        this(other.name, other.height, other.occupation);
    }

    public String getName() {
        return name;
    }

    public int getHeight() {
        return height;
    }

    public String getOccupation() {
        return occupation;
    }

    public void setOccupation(String occupation) {
        this.occupation = occupation;
    }

    public void print() {
        if (this.occupation.equals("")) {
            System.out.printf("Name: %s\nHeight: %s\n=======\n", name, height);
        } else
            System.out.printf("Name: %s\nHeight: %d\nOccupation: %s\n=======\n", name, height, occupation);
    }

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

