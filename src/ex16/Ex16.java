package ex16;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class Ex16 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        final int quantityOfSide = 3;
        List<Integer> sidesOfTriangle = new ArrayList<>();
        try {

            for (int i = 0; i < quantityOfSide; i++) {
                System.out.println("Write the value for the " + (i + 1) + "° side");
                int measureSide = scan.nextInt();
                scan.nextLine();
                sidesOfTriangle.add(measureSide);
            }
            int sideA = sidesOfTriangle.get(0);
            int sideB = sidesOfTriangle.get(1);
            int sideC = sidesOfTriangle.get(2);

            if (sideA + sideB > sideC && sideA + sideC > sideB && sideB + sideC > sideA) {
                System.out.println("the condition to make the triangle exists is correct");
            } else {
                System.out.println("The condition to make the triangle exists is wrong");
            }
            if (sideA == sideB && sideB == sideC) {
                System.out.println("This is a triangle Equilateral");
            } else if (sideA == sideB || sideB == sideC) {
                System.out.println("This triangle is isosceles");
            } else {
                System.out.println("This triangle is Scalene");
            }
        } catch (InputMismatchException e) {
            System.out.println("Input error please put a valid type");
        }
    }
}
