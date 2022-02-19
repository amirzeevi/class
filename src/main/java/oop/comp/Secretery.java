package oop.comp;

public class Secretery extends Employee{
    private String office;

    public Secretery(String name, double salary, String office) {
        super(name, salary);
        this.office = office;
    }

    public String getOffice() {
        return office;
    }

    public void setOffice(String office) {
        this.office = office;
    }

    @Override
    public String toString() {
        return super.toString()+"Secretery{" +
                "office='" + office + '\'' +
                '}';
    }
}
