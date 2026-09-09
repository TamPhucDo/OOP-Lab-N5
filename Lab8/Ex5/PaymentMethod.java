
public abstract class PaymentMethod {
    private double balance;
    
    public PaymentMethod(double balance) {
        this.balance = balance;
    }   
    public double getBalance() {
        return balance;
    }
    public void setBalance(double balance) {
        this.balance = balance;
    }
    public abstract boolean processPayment(double amount);
    public abstract String getPaymentDetails();
}