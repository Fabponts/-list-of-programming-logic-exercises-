package ex11;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ex11 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        List<Double> studentsGrade = new ArrayList<>();

        final int numberOfGrade = 4;
        final int averageToPass = 7;

        System.out.println("Tap the student name: ");
        String name = scan.nextLine();

        for (int i = 0; i < numberOfGrade; i++) {
            System.out.println("Grade #" + (i + 1));

            System.out.println("tap the student grades: ");
            double grade = scan.nextDouble();

            studentsGrade.add(grade);
        }
        double gradeAverage = studentsGrade.stream().mapToDouble(Double::doubleValue).average().orElse(0.0);
        if (gradeAverage >= averageToPass) {
            System.out.println(String.format("%s was APPROVED with average: %.2f", name, gradeAverage));
        } else {
            System.out.println(String.format("%s FAILED with average: %.2f", name, gradeAverage));
        }
    }

}
