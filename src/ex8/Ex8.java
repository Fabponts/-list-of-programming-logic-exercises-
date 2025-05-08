package ex8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Ex8 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        List<Integer> values = new ArrayList<>();

        int numberOfValues = scan.nextInt();

        for (int i = 0; i < numberOfValues; i++) {
            System.out.println("#" + (i + 1) + "number");
            int number = scan.nextInt();
            scan.nextLine();
            values.add(number);
        }
        Collections.sort(values,Collections.reverseOrder());
        System.out.println(values);
    }
}
