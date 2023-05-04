public class Sale {
    private int transaction_id;
    private double sale_value;
    private String buyer_name;

    public Sale(int transaction_id, double sale_value, String buyer_name) {
        this.transaction_id = transaction_id;
        this.sale_value = sale_value;
        this.buyer_name = buyer_name;
    }

    public int getTransactionId() {
        return transaction_id;
    }

    public double getSaleValue() {
        return sale_value;
    }

    public String getBuyerName() {
        return buyer_name;
    }
}
