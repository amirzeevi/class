package exercies.Employee.comp;

public class Director extends Employee {
    private String group;
    public Director(String name, double salary, String group) {
        super(name, salary);
        setGroup(group);
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    @Override
    public String toString() {
        StringBuilder StringBuilder =  new StringBuilder();
        return super.toString()+"group = "+this.group;
    }
}
