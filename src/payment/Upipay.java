package payment;

public class Upipay extends Pay {
    
    @Override
    public void pay(double amount) {
        System.out.println("UPI Payment of Rs." + amount + " successful.");
    }
}