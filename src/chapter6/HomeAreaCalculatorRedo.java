package chapter6;

import java.util.Scanner;

public class HomeAreaCalculatorRedo {

   private static Scanner scanner = new Scanner(System.in);
   static int testStatic;
    public static void main(String[] args) {

        HomeAreaCalculatorRedo calculator = new HomeAreaCalculatorRedo();
        Rectangle kitchen = calculator.getRoom();
        Rectangle bathRoom = calculator.getRoom();
        double area = calculator.calculateTotalArea(kitchen,bathRoom);
        System.out.println("The total area is: " + area);
        scanner.close();
    }

    public  Rectangle getRoom() {

        System.out.println("Enter the length of your room: ");
        double length = scanner.nextDouble();
        System.out.println("Enter the width of your room: ");
        double width = scanner.nextDouble();
        return new Rectangle(length,width);
    }

    /**
     *
     * @param rectangle1
     * @param rectangle2
     * @return
     */
    public double calculateTotalArea (Rectangle rectangle1, Rectangle rectangle2){
        return rectangle1.calculateArea() + rectangle2.calculateArea();
    }
}
