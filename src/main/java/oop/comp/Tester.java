package oop.comp;

public class Tester {
    public static void main(String[] args) {
        Company company = new Company("Sherlock");

        company.addEmployee(new Manager("mot", 1500, "outside"));
        company.addEmployee(new Secretery("gur", 2000, "inside"));
        company.addEmployee(new Engineer("jake", 3000,"forces"));
        company.addEmployee(new Director("amnon", 3000,"legal", "shesh"));
        try {
        company.getEmployees();
        } catch (CompanyReportException e) {
            System.out.println(e.getMessage()+" "+e.reportName+" "+e.companyName);
        }
        System.out.println(company.getAverageSalary());
        company.getYearlyPayment();
        company.getTotalNumOfEmployees();
        System.out.println(company.getTotalNumOfManagers());
        System.out.println(company.getManagAverageSalary());
        System.out.println(company.toString());
    }
}
