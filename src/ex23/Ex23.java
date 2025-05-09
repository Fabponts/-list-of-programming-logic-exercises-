package ex23;

import java.util.Scanner;

public class Ex23 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        final double percentualInss = 0.14;

        System.out.println("Insert the value per hour");
        double valuePerHour = scan.nextDouble();

        System.out.println("Number of classes in a month");
        int classesInAMonth = scan.nextInt();

        double brutSalary = (valuePerHour * classesInAMonth);
        double discountInss= brutSalary * percentualInss;
        double liquidSalary = brutSalary - discountInss;

        System.out.printf("The liquid salary is: %.2f ",liquidSalary);


    }
}
