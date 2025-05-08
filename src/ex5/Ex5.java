package ex5;

import java.util.Scanner;

public class Ex5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double minimumSalary = 1292.20;
        System.out.println("How much is your salary?");
        double personSalary = scan.nextDouble();
        double howManyMinimumSalary = personSalary/minimumSalary;

        String salaryPlural = (howManyMinimumSalary == 1 ? "salary" : "salaries");
        System.out.println(String.format("The user receive: %.2f minimum %s", howManyMinimumSalary , salaryPlural));

    }
}
