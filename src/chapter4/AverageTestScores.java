package chapter4;

import java.util.Scanner;

public class AverageTestScores {

    public static void main(String[] args) {
        int numberOfStundents = 24;
        int numberOfTests = 5;

        Scanner scanner = new Scanner(System.in);

        //process all students
        for (int i = 0; i < numberOfStundents; i++) {
            double total = 0;
            for (int j = 0; j < numberOfTests; j++) {
                System.out.println("Enter the score for test #" + (j + 1));
                double score = scanner.nextDouble();
                total = total + score;
            }
            double average = total / numberOfTests;
            System.out.println("The test average for student #" + (i+1)+" is "+average);
        }


        /*


        double salary = scanner.nextDouble();
        scanner.close();
         */
    }
}
