public class Salesman extends Employee {
    private double commission_rate;
    private double total_sales_value;
    private Sale[] sales;

    public Salesman(String name, int employee_id, double salary, double commission_rate) {
        super(name, employee_id, salary);
        this.commission_rate = commission_rate;
        this.total_sales_value = 0;
        this.sales = new Sale[10];
    }

    public double getTotalSalesValue() {
        return total_sales_value;
    }

    public double getNetSalary() {
        return total_sales_value*commission_rate;
    }

    public void addSale(Sale sale) {
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] == null) {
                sales[i] = sale;
                total_sales_value += sale.getSaleValue();
                break;
            }
        }
    }

    public void addComplaint(String complaint, int transaction_id) {
        String complaintWithTransactionId = String.format("Transaction ID %d: %s", transaction_id, complaint);
        super.addComplaint(complaintWithTransactionId);
    }
}
