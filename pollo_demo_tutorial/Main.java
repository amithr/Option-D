package pollo_demo_tutorial;

public class Main {
    public static void main(String[] args) {
        Employee employeeOne = new Employee("Walter", 356, 1000000);
        employeeOne.addComplaint("Scarily smart.");

        Salesman salesmanOne = new Salesman("Tuco", 666, 500000, .75);
        Sale sale =  new Sale("988790", 1000, "Emilio");
        salesmanOne.addSale(sale);
        salesmanOne.addComplaint("Insane", "988790");

        double saulsSalary = Employee.calculateNetSalary(40000, .25);
        System.out.println(Employee.taxRate);
        System.out.println(saulsSalary);
    }
}
