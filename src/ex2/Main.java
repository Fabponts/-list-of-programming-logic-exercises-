package ex2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite um numero abaixo");
        int number = scan.nextInt();

        if (number % 2 != 0){
            System.out.println(number + " é um numero impar");
        }else{
            System.out.println(number + " é um numero par");
        }

        if (number > 0){
            System.out.println(number + " é um numero positivo");

        }else{
            System.out.println(number + " é um numero negativo");
        }
    }
}
