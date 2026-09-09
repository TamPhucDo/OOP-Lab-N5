public class CreditCarePayment extends PaymentMethod implements Refundable {
    private String cardNumber;
    private String cardHolderName;
    private static final double OVERDRAFT_LIMIT = 500.0;
    
    public CreditCarePayment(double balance, String cardNumber, String cardHolderName) {
        super(balance);
        this.cardNumber = cardNumber;
        this.cardHolderName = cardHolderName;   
    }
    @Override
    public boolean processPayment(double amount) {
        if (getBalance() + OVERDRAFT_LIMIT >= amount) {
            setBalance(getBalance() - amount);
            return true;
        }
        return false;
    }
    @Override
    public String getPaymentDetails() {
        return "Credit Card Payment - Card Number: " + cardNumber + ", Card Holder: " + cardHolderName;
    }
    @Override
    public boolean refund(double amount) {
        setBalance(getBalance() + amount);
        return true;
    }
    
}
