package pollo_demo_tutorial;

public class Sale {
    private String transactionId;
    private double saleValue;
    private String buyerName;

    public Sale(String transactionId, double saleValue, String buyerName) {
        this.transactionId = transactionId;
        this.saleValue = saleValue;
        this.buyerName = buyerName;
    }

    public String getTransactionId() {
        return this.transactionId;
    }

    public double getSaleVale() {
        return this.saleValue;
    }

    public String returnBuyerName() {
        return this.buyerName;
    }
}
