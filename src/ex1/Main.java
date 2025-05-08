package ex1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Insira 3 valores abaixo: (a,b,c)");
        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();

        int sum = a + b;
        if (sum < c){
            System.out.println("A soma de A e B: " + sum + " menor que C: " + c);
        }else{
            System.out.println("O resultado entre A e B: " + sum + " maior que C: " + c);
        }
    }
}