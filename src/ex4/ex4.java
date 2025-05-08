package ex4;

import java.util.Scanner;

public class ex4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite um numero para saber seu antecessor e seu sucessor");
        int numero = scan.nextInt();
        int sucessor = numero + 1;
        int antecessor = numero - 1;

        System.out.println(String.format("O numero: %d tem como antecessor: %d e como sucessor: %d", numero, antecessor, sucessor));
    }
}
