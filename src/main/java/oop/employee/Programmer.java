package oop.employee;

public class Programmer extends Employee {

    public Programmer(String name, int serialNum, int salary) {
        super(name, serialNum, salary);
    }

    @Override
    public String toString() {
        return "Programmer{" +
                "name='" + name + '\'' +
                ", serialNum=" + serialNum +
                ", salary=" + salary +
                '}';
    }

    @Override
    public int calcBonus() {
        return (int)(salary*1.5);
    }
}

