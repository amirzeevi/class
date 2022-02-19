package oop.employee;

public class Employee {
    protected String name;
    protected int serialNum;
    protected int salary;

    public Employee(String name, int serialNum, int salary) {
        this.name = name;
        this.serialNum = serialNum;
        this.salary = salary;
    }

    public int calcBonus() {
        return 0;
    }

    public void setSalary(int salary) {
        this.salary += salary;
    }

    public void updateSalary(int salary) {
        this.salary += salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", serialNum=" + serialNum +
                ", salary=" + salary +
                '}';
    }
}
