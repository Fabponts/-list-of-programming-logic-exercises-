package ex15;

import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.LocalDate;
import java.util.Scanner;

public class Ex15 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        DateTimeFormatter dt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        System.out.println("Write the current year:(dd/MM/yyyy)");
        LocalDate currentDate = LocalDate.parse(scan.nextLine(),dt1);

        System.out.println("Write your birth year:(dd/MM/yyyy)");
        LocalDate birthDate = LocalDate.parse(scan.nextLine(),dt1);

       Period period = Period.between(currentDate,birthDate);
        System.out.println(period);
    }
}
