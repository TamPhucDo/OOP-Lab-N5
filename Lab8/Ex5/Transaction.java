public class Transaction {
    
    private PaymentMethod paymentMethod; 
    private double amount;  


    public Transaction(PaymentMethod paymentMethod, double amount) {
        this.paymentMethod = paymentMethod;
        this.amount = amount;
    }

    public boolean execute() {
        return paymentMethod.processPayment(amount);
    }


    public boolean issueRefund  () {
        if (this.paymentMethod instanceof Refundable) {            
            Refundable r = (Refundable) this.paymentMethod;            
            return r.refund(amount);
        }        
        System.out.println("Lỗi: Phương thức thanh toán này không hỗ trợ hoàn tiền!");
        return false;
    }   

    public String getPaymentDetails() {
        return paymentMethod.getPaymentDetails();
    }

    public double getBalance() {
        return paymentMethod.getBalance();
    }
}