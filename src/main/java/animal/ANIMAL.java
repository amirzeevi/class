package animal;

public class ANIMAL {
    private String name;
    private int wheight;
    private boolean isAlive;

    public ANIMAL(String name, int wheight, boolean isAlive) {
        this.name = name;
        this.wheight = wheight;
        this.isAlive = isAlive;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getWheight() {
        return wheight;
    }

    public void setWheight(int wheight) {
        this.wheight = wheight;
    }

    public boolean isAlive() {
        return isAlive;
    }

    public void setAlive(boolean alive) {
        isAlive = alive;
    }

    @Override
    public String toString() {
        return "ANIMAL{" +
                "name='" + name + '\'' +
                ", wheight=" + wheight +
                ", isAlive=" + isAlive +
                '}';
    }

    public void makeSound(String sound) {
    }

    public void eat(ANIMAL other) {
        other.isAlive = false;
    }

    public boolean drinkMilk(ANIMAL other) {
        return other.isAlive;
    }

}
