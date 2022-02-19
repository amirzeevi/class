package oop.animal;

public class Lion extends ANIMAL{

    public Lion(String name, int wheight, boolean isAlive) {
        super(name, wheight, isAlive);
    }

    public static void main(String[] args) {
        Lion lion = new Lion("king", 120, true);
    }
}
