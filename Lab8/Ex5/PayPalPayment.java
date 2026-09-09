public class PayPalPayment extends PaymentMethod {
    private String email;
    
    public PayPalPayment(double balance, String email) {
        super(balance);
        this.email = email;
    }
    @Override
    public boolean processPayment(double amount) {
        if (getBalance() >= amount) {
            setBalance(getBalance() - amount);
            return true;
        }
        return false;
    }
    @Override
    public String getPaymentDetails() {
        return "PayPal Payment - Email: " + email;
    }

}
