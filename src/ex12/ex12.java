package ex12;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ex12 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        try {
        System.out.println("Tap the product's price: ");
        double productPrice = scan.nextDouble();

        String paymentMenu = String.format("Tap 1: to pay with cash or pix || " +
                "Tap 2: to pay with Credit Card || " +
                "Tap 3: to Pay with the credit card sharing in 2 || " +
                "Tap 4: to pay with the credit card sharing in 3 or more");
        System.out.println(paymentMenu);

        double pixOrCash = productPrice - (productPrice * 0.15);
        double allCreditCard = productPrice - (productPrice * 0.10);
        double shareTwoTimesCreditCard = productPrice;
        double shareThreeTimesMoreCreditCard = productPrice + (productPrice * 0.10);

        int methodsToPay = scan.nextInt();

        switch (methodsToPay) {
            case 1:
                System.out.println("O valor é: " + pixOrCash);
                break;
            case 2:
                System.out.println("O valor é: " + allCreditCard);
                break;
            case 3:
                System.out.println("O valor é: " + shareTwoTimesCreditCard);
                break;
            case 4:
                System.out.println("O valor é: " + shareThreeTimesMoreCreditCard);
                break;
            default:
                System.out.println("Put a valid option");
        }

    }catch (InputMismatchException e){
            System.out.println("Error " + e.getMessage());
        }
        scan.close();
    }
}
