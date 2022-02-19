package oop.employee;

public class Secratry extends Employee{
    protected int numOfWordsInMinute;

    public Secratry(String name, int serialNum, int salary, int numOfWordsInMinute) {
        super(name, serialNum, salary);
        this.numOfWordsInMinute = numOfWordsInMinute;
    }

    @Override
    public int calcBonus() {
        return 500;
    }

    @Override
    public String toString() {
        return "Secratry{" +
                "name='" + name + '\'' +
                ", serialNum=" + serialNum +
                ", salary=" + salary +
                ", numOfWordsInMinutes=" + numOfWordsInMinute +
                '}';
    }
}

