package chapter4;

import java.util.Scanner;

public class GrossPayInputValidation {
    public static void main(String[] args) {

        int rate = 15;
        int maxHour = 40 ;

        System.out.println("How many Hours you work this week?");
        Scanner scanner = new Scanner(System.in);
        double hoursWorked = scanner.nextDouble();
        //validate input
        while (hoursWorked>maxHour || hoursWorked<1){
            System.out.println("Invalid entry. only between 1 : 40 hours");
            hoursWorked = scanner.nextDouble();
        }


        scanner.close();

//calculate the gross
        double gross = rate * hoursWorked;
        System.out.println("Gross Pay: $"+ gross);

    }
}
