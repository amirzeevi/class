package exercies.Employee.comp;

public class Enginerr extends Employee  {
private String specialty;
    public Enginerr(String name, double salary, String specialty) {
        super(name, salary);
        setSpecialty(specialty);
    }

    @Override
    public String toString() {
        return super.toString()+"Specialty= "+this.specialty;
    }

    public String getSpecialty() {
        return specialty;
    }

    public void setSpecialty(String specialty) {
        this.specialty = specialty;
    }
}
