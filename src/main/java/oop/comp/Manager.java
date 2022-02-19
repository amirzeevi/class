package oop.comp;

public class Manager extends Employee implements Mangarable{
    protected String department;

    public Manager(String name, double salary, String department) {
        super(name, salary);
        this.department = department;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    @Override
    public String toString() {
        return super.toString()+"Manager{" +
                "department='" + department + '\'' +
                '}';
    }
}
