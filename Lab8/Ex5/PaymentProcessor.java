public class PaymentProcessor {
    public static void main(String[] args) {
        
        PaymentMethod p1 = new PayPalPayment(100.0, "user@example.com");
        PaymentMethod p2 = new CreditCarePayment(200.0, "1234-5678-9012-3456", "John Doe");
        
        Transaction t1 = new Transaction(p2, 50.0);


        System.out.println("Payment Details: " + t1.getPaymentDetails());
        if (t1.execute()) {
            System.out.println("Payment successful. Remaining balance: " + t1.getBalance());
        } else {
            System.out.println("Payment failed. Insufficient funds.");
        }
        if (t1.issueRefund()) {
            System.out.println("Refund successful. Current balance: " + t1.getBalance());
        } else {
            System.out.println("Refund failed.");
        }
        
    }
}
