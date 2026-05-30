package payment;

public class Netbanking extends Pay {
    
    @Override
    public void pay(double amount) {
        System.out.println("Net Banking Payment of Rs." + amount + " successful.");
    }
}