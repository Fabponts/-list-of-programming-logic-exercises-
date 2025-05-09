package ex17;

import java.util.Scanner;

public class Ex17 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double celsiusTemperature = 0;

        System.out.println("Write the temperature in fahrenheit: ");
        double fahrenheitTemperature = scan.nextDouble();

        celsiusTemperature = (5 * (fahrenheitTemperature-32))/9;
        System.out.printf("A temperatura em fahrenheit é %.2f, e em celsius: %.2f",fahrenheitTemperature,celsiusTemperature);

    }
}
