package ex9;

import java.util.Scanner;

public class Ex9 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Insert your weight");
        double weight = scan.nextDouble();
        System.out.println("Insert your height in meters");
        double height = scan.nextDouble();

        double calculateImc = weight / Math.pow(height,2);

        if (calculateImc < 18.5) {
            System.out.println("Abaixo de 18,5 | Abaixo do peso");
        } else if (calculateImc >= 18.6 && calculateImc <= 24.9) {
            System.out.println("Entre 18.6 e 24,9 | Peso ideal (parabéns)");
        } else if (calculateImc >= 25.0 && calculateImc <= 29.9) {
            System.out.println("Entre 25.0 e 29,9 | Levemente acima do peso");
        } else if (calculateImc >= 30.0 && calculateImc <= 34.9) {
            System.out.println("Entre 30.0 e 34,9 | Obesidade grau I ");
        } else if (calculateImc >= 35.0 && calculateImc <= 39.9) {
            System.out.println("Entre 35.0 e  39.9 | Obesidade grau II (severa)");
        } else if (calculateImc >= 40) {
            System.out.println("Maior ou igual a 40 | Obesidade grau III (mórbida)");
        }
    }
}
