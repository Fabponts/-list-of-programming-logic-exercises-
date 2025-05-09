package ex14;

import java.util.Scanner;

public class Ex14 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Write a first Value: ");
        int firstValue = scan.nextInt();
        System.out.println("Write a second Value: ");
        int secondValue = scan.nextInt();

        int changeValue = firstValue;
        firstValue = secondValue;
        secondValue = changeValue;

        System.out.printf("O primeiro valor transformado no segundo é %d e o segundo transformado no primeiro %d"
                ,firstValue,changeValue);
    }
}
