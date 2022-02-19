package oop.comp;

import oop.comp.Employee;
import oop.comp.Manager;
import oop.comp.Mangarable;

import java.util.ArrayList;
import java.util.List;

public class Company {
    private String name;
    private final List<Employee> employees = new ArrayList<>();

    public Company(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(name + "\n");
        for (Employee employee : employees) {
            sb.append(employee + "\n");
        }
        return sb.toString();
    }

    public void addEmployee(Employee employee) {
        this.employees.add(employee);
    }

    public void removeEmployee(Employee employee) {
        this.employees.remove(employee);
    }

    public void getEmployees() throws CompanyReportException {
        if (employees.size() == 0) {
            throw new CompanyReportException(name, "EmployeeError", "Data Unavailable");
        }
        for (Employee employee : employees) {
            if (employee == null) {
            throw new CompanyReportException(name, "EmployeeError", "Data Unavailable");
            }
            System.out.println(employee);
        }
    }

    public double getAverageSalary() {
        double sum = 0;
        for (Employee employee : employees) {
            sum += employee.getSalary();
        }
        return sum / employees.size();
    }

    public void getYearlyPayment() {
        System.out.println(getAverageSalary() * employees.size() * 12);
    }

    public void getTotalNumOfEmployees() {
        System.out.println(employees.size());
    }

    public int getTotalNumOfManagers() {
        int counter = 0;
        for (Employee employee : employees) {
            if (employee instanceof Mangarable) {
                counter++;
            }
        }
        return counter;
    }

    public double getManagAverageSalary() {
        double sum = 0;
        for (Employee employee : employees) {
            if (employee instanceof Mangarable) {
                sum += employee.getSalary();
            }
        }
        return getTotalNumOfManagers() == 0 ? 0 : sum / getTotalNumOfManagers();
    }
}

