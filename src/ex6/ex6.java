package ex6;

import java.util.Scanner;

public class ex6 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Tap a value to adjust in 5%");
        double valueNumber = scan.nextDouble();
        double adjustment = valueNumber + (valueNumber * 0.05);

        System.out.println(String.format("The value %.2f adjusted is %.2f",valueNumber,adjustment));
    }
}
