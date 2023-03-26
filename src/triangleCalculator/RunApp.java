package triangleCalculator;

import java.text.NumberFormat;
import java.util.InputMismatchException;
import java.util.Scanner;

public class RunApp {
    public static void main(String[] args) {
        TriangleCalculator triangleCalculator = new TriangleCalculator();
        //create Scanner object
        Scanner scanner = new Scanner(System.in);
        //ask for user input to determine area
        System.out.println("Enter the base of the triangle");
        double sideA = scanner.nextDouble();
        System.out.println("Enter the height of the triangle");
        double sideB = scanner.nextDouble();
        //call calculateArea
        triangleCalculator.calculateArea(sideA, sideB);
        //ask for user input to determine triangle type
        System.out.println("Now, let's determine if your triangle is an equilateral, isosceles, or scalene triangle. Please enter the length of the first side of the triangle: ");
        double sideOne = scanner.nextDouble();
        System.out.println("Enter the second length of the second side: ");
        double sideTwo = scanner.nextDouble();
        System.out.println("Enter the length of the third side: ");
        double sideThree = scanner.nextDouble();
        //call determineTriangleType method
        triangleCalculator.determineTriangleType(sideOne, sideTwo, sideThree);
    }
}