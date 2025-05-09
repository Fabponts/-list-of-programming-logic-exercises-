package ex22;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ex22 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        try {
            System.out.println("Digite o dividendo: ");
            int dividendo = scan.nextInt();

            System.out.println("Digite o divisor: ");
            int divisor = scan.nextInt();

            int quociente = dividendo/divisor;
            int resto = dividendo % divisor;

            System.out.printf("O quociente da divisao é: %d e o resto: %d",quociente,resto);
        }catch (InputMismatchException e){
            System.out.println("Escreva um dado valido");
        }

    }
}
