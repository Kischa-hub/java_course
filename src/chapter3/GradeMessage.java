package chapter3;

import java.util.Scanner;

public class GradeMessage {
    public static void main(String[] args) {
        System.out.println("Enter your letter grade");
        Scanner scanner = new Scanner(System.in);
        String grade = scanner.next();
        scanner.close();
        String message;
        switch (grade) {
            case "A":
                message = "Excellent job!";
                break;
            case "B":
                message = "great job!";
                break;
            case "C":
                message = "good job!";
                break;
            case "D":
                message = "you need to work hard !";
                break;
            case "F":
                message = "Uh Oh!";
                break;
            default:
                message = "Error . Invaled Grade";
                break;
        }

        System.out.println(message);
    }
}
