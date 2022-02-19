package exercies.Employee.comp;

public class Manager extends Employee {
    protected String department;

    public Manager(String name, double salary, String department) {
        super(name, salary);
        setDepartment(department);
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    @Override
    public String toString() {
        return super.toString()+"departmernt= "+department;
    }
}
