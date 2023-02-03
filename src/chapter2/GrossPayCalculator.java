package chapter2;

import java.util.Scanner;

public class GrossPayCalculator {

    public static void main(String[] args) {

        //1. get the number of hours worked
        System.out.print("Enter the number of hours the employee worked.");
        Scanner scanner = new Scanner(System.in);
        int hours = scanner.nextInt();

        //2. get the hourly pay rate.
        System.out.print("Enter the Employee's pay rate");
        double rate = scanner.nextDouble();
        scanner.close();

        //3. Multiply hours pay rate.
        double grossPay = hours * rate ;

        //4. Display result.
        System.out.println("The Employee gross pay is $" + grossPay);

    }
}
