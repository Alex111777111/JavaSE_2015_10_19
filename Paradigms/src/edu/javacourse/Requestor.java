package edu.javacourse;

public abstract class Requestor
{
    private static String name;
    
    private String requestorName;
    protected int salary;
    private String companyName;

    public String getRequestorName() {
        return requestorName;
    }

    public void setRequestorName(String requestorName) {
        this.requestorName = requestorName;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }
    
    public abstract GoodsList getGoodsList();

    @Override
    public String toString() {
        return "Requestor{" + "requestorName=" + requestorName + ", salary=" + salary + ", companyName=" + companyName + '}';
    }
    
    
}
