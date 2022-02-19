package oop.comp;

public class Engineer extends Employee {
    private String specialty;

    public Engineer(String name, double salary, String specialty) {
        super(name, salary);
        this.specialty = specialty;
    }

    public String getSpecialty() {
        return specialty;
    }

    public void setSpecialty(String specialty) {
        this.specialty = specialty;
    }

    @Override
    public String toString() {
        return super.toString()+"Engineer{" +
                "specialty='" + specialty + '\'' +
                '}';
    }
}
