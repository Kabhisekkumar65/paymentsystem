package payment;

import java.util.Scanner;
import payment.Pay;

import payment.Cardpayment;
import payment.Netbanking;
import payment.Upipay;
public class Paymentapp {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Amount:");
        double amount = sc.nextDouble();

        System.out.println("1. Card Payment");
        System.out.println("2. UPI Payment");
        System.out.println("3. Net Banking");
        System.out.print("Choose Payment Method: ");

        int choice = sc.nextInt();

        Pay p = null;

        switch (choice) {
            case 1:
                p = new Cardpayment();
                break;

            case 2:
                p = new Upipay();
                break;

            case 3:
                p = new Netbanking();
                break;

            default:
                System.out.println("Invalid Choice");
                sc.close();
                return;
        }

        p.pay(amount); // Runtime Polymorphism

        sc.close();
    }
}