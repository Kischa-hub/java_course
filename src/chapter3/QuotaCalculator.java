package chapter3;

import java.util.Scanner;

public class QuotaCalculator {

    public static void main(String[] args) {

        //initialize the values we know
        int quota = 10;

        // get unknown values
        System.out.println("Enter the number os sales you made this week");
        Scanner scanner = new Scanner(System.in);
        int sales = scanner.nextInt();
        scanner.close();

        //Make a decision on the path to take - output
        if (sales >= quota)
            System.out.println("Congrates you meet your quota");
        else {
            int salesShort = quota - sales;
            System.out.println("you dont meet your quota " + salesShort + " sales short");
        }

    }
}
