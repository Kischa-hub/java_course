package chapter3;

import java.util.Scanner;

public class LoanQualifier {
    public static void main(String[] args) {
        //Initialize what we know
        int requierdSalary = 30000;
        int requierdYearSalary = 2;

        //get what we don't
        System.out.println("Enter your salary");
        Scanner scanner = new Scanner(System.in);
        double salary = scanner.nextDouble();
        System.out.println("Enter the nummber of years with your current emplyer");
        double years = scanner.nextDouble();
        scanner.close();

        //Make a decision
        if (salary >= requierdSalary) {
            if (years >= requierdYearSalary) {
                System.out.println("Congrates you are qualify for the loan");
            } else {
                System.out.println("Sorry you must have worked at current job " + requierdYearSalary + " years");
            }
        } else {
            System.out.println("Sorry you must earn at least $ " + requierdSalary + "to qualify for the loan");
        }
    }

}

