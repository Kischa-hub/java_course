package chapter5;

import java.util.Scanner;

public class InstantCreditCheck {

    static int requierdSalary = 25000;
    static int requierdCreditScore = 700;
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        //Intialize what we know


        //Get we dont know
        double salary = getSalary();
        int creditScore = getCreditScore();
        scanner.close();

        //check if the user qualified
        boolean qualified = isUserQualified(creditScore, salary);

        //notify the user
        notifyUser(qualified);

    }


    public static double getSalary() {
        System.out.println("Enter your salary");
        double salary = scanner.nextDouble();
        return salary;
    }

    public static int getCreditScore() {
        System.out.println("Enter your credit score");
        int creditScore = scanner.nextInt();
        return creditScore;
    }

    public static boolean isUserQualified(int creditScore, double salary) {
        if (creditScore >= requierdCreditScore && salary >= requierdSalary)
            return true;
        else
            return false;
    }

    public static void notifyUser(boolean isQualified) {
        if (isQualified)
            System.out.println("Congratulation u r approved");
        else
            System.out.println("Sorry u r denied");
    }
}
