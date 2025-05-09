package ex19;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ex19 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        final int tableMultipliers = 10;
        try{
        System.out.println("Write a number to see the table 0 until 10");
        int number = scan.nextInt();
        int table;
        if (number <= 10){
            System.out.printf("the table of %d: ",number);
            for (int i = 0; i <= tableMultipliers ; i++) {
                table = number * i;
                System.out.printf("%d || ",table );
            }
        }else {
            System.out.println("The algorithm cannot calculate number above 10");
        }
        }catch (InputMismatchException e){
            System.out.println("Input Error put a valid number");
        }
    }
}
