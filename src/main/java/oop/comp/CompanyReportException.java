package oop.comp;

public class CompanyReportException extends Exception{
    String companyName;
    String reportName;

    public CompanyReportException(String companyName, String reportName, String msg) {
        super(msg);
        this.companyName = companyName;
        this.reportName = reportName;
    }

    public String getCompanyName() {
        return companyName;
    }

    public String getReportName() {
        return reportName;
    }
}
