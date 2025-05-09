package ex20;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ex20 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        final int tableMultipliers = 10;
        try{
            System.out.println("Write a number to see the table");
            int number = scan.nextInt();
            int table;
                System.out.printf("the table of %d: ",number);
                for (int i = 0; i <= tableMultipliers ; i++) {
                    table = number * i;
                    System.out.printf("%d || ",table );
                }
        }catch (InputMismatchException e){
            System.out.println("Input Error put a valid number");
        }
    }
}
