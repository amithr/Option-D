public class Employee {
    private String name;
    private int employee_id;
    private double salary;
    private String[] complaints;

    public Employee(String name, int employee_id, double salary) {
        this.name = name;
        this.employee_id = employee_id;
        this.salary = salary;
        this.complaints = new String[10];
    }

    public void addComplaint(String complaint) {
        for (int i = 0; i < complaints.length; i++) {
            if (complaints[i] == null) {
                complaints[i] = complaint;
                break;
            }
        }
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }

    public String getName() {
        return name;
    }

    public int getEmployeeId() {
        return employee_id;
    }

    public static double calculateNetSalary(double salary, double taxRate) {
        double taxableIncome = salary * (1 - taxRate);
        double netSalary = salary - taxableIncome;
        return netSalary;
    }
}
