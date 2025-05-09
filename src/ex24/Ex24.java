package ex24;

import java.util.Scanner;

public class Ex24 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        final int gasolinaPorQuilometro = 12;
        System.out.println("Quanto tempo sera gasto na viagem (em horas)?");
        double tempoGastoNaViagem = scan.nextDouble();

        System.out.println("Qual velocidade média esperada?");
        double velocidadeMedia = scan.nextInt();

        double distancia = tempoGastoNaViagem * velocidadeMedia;
        double litrosGastos = distancia / gasolinaPorQuilometro;

        System.out.printf("No final  %.2f horas é o tempo gasto, com uma média de velocidade de %.2f km/hora" +
                        "com uma distancia percorrida de %.2f km e gastando no total %.2f de litros ", tempoGastoNaViagem
                , velocidadeMedia, distancia, litrosGastos);
        scan.close();
    }
}
