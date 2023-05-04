public class Main {

    public static void main(String[] args) {
        System.out.println("Hello World!");

        Employee employeeOne = new Employee("Walter", 356, 1000000);
        employeeOne.addComplaint("Scarily smart.");
        double walterNetSalary = Employee.calculateNetSalary(employeeOne.getSalary(), .25);
        System.out.println(walterNetSalary);

        Salesman salesmanOne = new Salesman("Tuco", 666, 500000, .75);
        Sale sale = new Sale(988709, 1000, "Emilio");
        salesmanOne.addSale(sale);
        System.out.println(salesmanOne.getTotalSalesValue());
    }
}

