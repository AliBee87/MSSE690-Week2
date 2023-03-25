package triangleCalculator;

import java.text.NumberFormat;
import java.util.Scanner;

public class RunApp {

    public static void main(String[] args) {
        TriangleCalculator triangleCalculator = new TriangleCalculator();
        //create Scanner object
        Scanner scanner = new Scanner(System.in);
        //ask for user input to determine area
        System.out.println("Enter the base of the triangle");
        double sideAInput = scanner.nextDouble();
        //if user provides invalid entry
        if (sideAInput >0) {
            System.out.println("Enter the height of the triangle");
            double sideBInput = scanner.nextDouble();
            if (sideBInput >0){
                System.out.println("Area of the triangle is: " +triangleCalculator.calculateArea(sideAInput, sideBInput));

            } else
                System.out.println("Invalid entry.");
        }  else
            System.out.println("Invalid entry.");


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