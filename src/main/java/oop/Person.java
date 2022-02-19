package oop;

public class Person {
    private String name;
    private int height;
    private int weight;

    public String getName() {
        return name;
    }

    public int getHeight() {
        return height;
    }

    public int getWeight() {
        return weight;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public void show() {
        System.out.println("Name: "+name);
        System.out.println("Height: "+height);
        System.out.println("Weight: "+weight);
        System.out.println("==========");
    }
}

