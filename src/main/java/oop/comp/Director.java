package oop.comp;

public class Director extends Manager implements Mangarable{
    private String group;

    public Director(String name, double salary, String department, String group) {
        super(name, salary, department);
        this.group = group;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    @Override
    public String toString() {
        return super.toString()+"Director{" +
                "group='" + group + '\'' +
                '}';
    }
}
