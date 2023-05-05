package pollo_demo_tutorial;

public class Salesman extends Employee {
    private double commissionRate;
    private double totalSalesValue;
    private Sale[] sales;

    public Salesman(String name, int employeeId, 
        double salary, double commissionRate) {
            super(name, employeeId, salary);
            this.commissionRate = commissionRate;
            this.totalSalesValue = 0;
            this.sales = new Sale[10];
        }
    
    public void addSale(Sale sale) {
        for(int i=0; i < sales.length; i++) {
            if(sales[i] == null) {
                sales[i] = sale;
                totalSalesValue = totalSalesValue + sale.getSaleVale();
                break;
            }
        }
    }

    public void addComplaint(String complaint, String transactionId) {
        for (int i= 0; i < complaints.length; i++) {
            if(complaints[i] == null) {
                complaints[i] = complaint.concat(transactionId);
                break;
            }
        }
    }

    public Sale[] getSales() {
        return this.sales;
    }

    public double getTotalSalesValue() {
        return totalSalesValue;
    }

    public double getCommissionRate() {
        return commissionRate;
    }

    public double getNetSalary() {
        return totalSalesValue*commissionRate;
    }


}
