package pollo_demo_tutorial;

import java.util.Arrays;

public class Employee {
    private String name;
    static double taxRate = .3;
    private int employeeId;
    private double salary;
    protected String[] complaints;  


    public Employee(String name, int employeeId, double salary) {
        this.name = name;
        this.employeeId = employeeId;
        this.salary = salary;
        this.complaints = new String[10];
        System.out.println("New object created");
    }

    public void addComplaint(String complaint) {
        for (int i= 0; i < complaints.length; i++) {
            if(complaints[i] == null) {
                complaints[i] = complaint;
                break;
            }
        }
    }

    public void addComplaint(String complaint, String complaintId) {
        for (int i= 0; i < complaints.length; i++) {
            if(complaints[i] == null) {
                complaints[i] = complaint.concat(complaintId);
                break;
            }
        }
    }

    public String[] getComplaints() {
        return this.complaints;
    }

    // Mutator method
    public void setSalary(double salary) {
        if(salary > 0) {
            this.salary = salary;
        }
    }

    // accessor method
    public double getSalary() {
        return salary;
    }

    public String getName() {
        return name;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public static double calculateNetSalary(double salary, double taxRate) {
        double taxableIncome = salary*(1-taxRate);
        double netSalary = salary - taxableIncome;
        return netSalary;
    }



}
