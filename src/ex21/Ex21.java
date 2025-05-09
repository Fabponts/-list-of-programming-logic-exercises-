package ex21;

import java.util.Random;

public class Ex21 {
    public static void main(String[] args) {
        Random random = new Random();
        int randomNumber = random.nextInt(1,100);
        System.out.printf("Numero aleatorio entre 1 e 100 é: %d",randomNumber );

    }


}
