package chapter4;

import java.util.Scanner;

public class AddNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean again ;
        do {
            System.out.println("Enter the first no");
            double number1 = scanner.nextDouble();
            System.out.println("Enter the secound no");
            double number2 = scanner.nextDouble();
             double sum = number1 + number2;
            System.out.println("the sum is : " + sum);

            System.out.println("Would you like to run again?");
            again = scanner.nextBoolean();

        }while (again);

        scanner.close();

    }
}
