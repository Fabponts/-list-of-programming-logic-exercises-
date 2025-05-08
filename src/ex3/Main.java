package ex3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite 2 numeros: (a/b)");
        int a = scan.nextInt();
        int b = scan.nextInt();
        int c;

        if(a == b ){
            c = a + b;
            System.out.println("O valor somado de a e b: " + c);
        }else {
            c = a * b;
            System.out.println("Os valores de a e b multiplicados: " + c);
        }
    }
}
