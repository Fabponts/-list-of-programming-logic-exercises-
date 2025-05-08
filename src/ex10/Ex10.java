package ex10;

import java.util.ArrayList;
import java.util.List;
import java.util.OptionalDouble;
import java.util.Scanner;

public class Ex10 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        List<Double> studentGrade = new ArrayList<>();
        System.out.println("how many student's grade will you insert?");
        int howManyStudentGrade = scan.nextInt();

        for (int i = 0; i < howManyStudentGrade ; i++) {
            System.out.println("Grade #" + (1 + i));
            double grade = scan.nextInt();
            studentGrade.add(grade);
        }
        OptionalDouble stats = studentGrade.stream().mapToInt(Double::intValue).average();
        System.out.println("Média: " + stats.orElse(0.0));
    }
}
