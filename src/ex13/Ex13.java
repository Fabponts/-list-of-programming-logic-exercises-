package ex13;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ex13 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        final int ageToBeMajor = 18;
        try{
        System.out.println("Write the person's name:");
        String name = scan.nextLine();

        System.out.println("Write the person's age: ");
        Integer age = scan.nextInt();
        scan.nextLine();

        if (age >= ageToBeMajor){
            System.out.printf("Name: %s and age: %d, is major", name,age);
        }else {
            System.out.printf("Name: %s and age: %d, is minor", name,age);
        }
        }catch (InputMismatchException e){
            System.out.println("Error: " + e.getMessage());
        }
        scan.close();
    }
}
