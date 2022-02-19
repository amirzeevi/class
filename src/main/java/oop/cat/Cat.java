package oop.cat;

public class Cat {
    private String name;
    private int mustageLength;
    private String mustageColor;

    public Cat(String name, int mustageLength, String mustageColor) {
        this.name = name;
        this.mustageLength = mustageLength;
        this.mustageColor = mustageColor;
    }

    @Override
    public String toString() {
        return
                "name = " + name +
                "   mustageLength = " + mustageLength +
                "   mustageColor = " + mustageColor;
    }
}

