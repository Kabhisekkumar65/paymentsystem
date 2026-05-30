package payment;

public class Cardpayment extends Pay {
    
    @Override
    public void pay(double amount) {
        System.out.println("Card Payment of Rs." + amount + " successful.");
    }
}