package oop;

import java.util.Scanner;

public class PersonProg {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Person[] persons = new Person[4];

        for (int index = 0; index < persons.length; index++) {
            persons[index] = new Person();
            int i = index + 1;
            System.out.println("Enter name for p" + i);
            persons[index].setName(input.next());
            System.out.println("Enter height for p" + i);
            persons[index].setHeight(input.nextInt());
            System.out.println("Enter weight for p" + i);
            persons[index].setWeight(input.nextInt());
            System.out.println("==========");
        }

        for (Person p : persons) {
            p.show();
        }

        int last = persons.length - 1;
        for (int index = 0; index < persons.length; index++) {
            for (int valid = 0; valid < last; valid++) {
                if (persons[valid].getHeight() > persons[valid + 1].getHeight()) {
                    Person temp = persons[valid];
                    persons[valid] = persons[valid + 1];
                    persons[valid + 1] = temp;
                }
            }
            last--;
        } // Organize Height

        for (Person n : persons) {
            n.show();
        }

        last = persons.length - 1;
        for (int index = 0; index < persons.length; index++) {
            for (int valid = 0; valid < last; valid++) {
                if (persons[valid].getWeight() > persons[valid + 1].getWeight()) {
                    Person temp = persons[valid];
                    persons[valid] = persons[valid + 1];
                    persons[valid + 1] = temp;
                }
            }
            last--;
        } // Organize Weight

        for (Person n : persons) {
            n.show();
        }
    }
}
