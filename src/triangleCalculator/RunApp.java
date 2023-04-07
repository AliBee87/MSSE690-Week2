package triangleCalculator;

import java.io.IOException;
import java.util.Scanner;

public class RunApp {
    public static void main(String[] args) throws IOException {
        TriangleCalculator triangleCalculator = new TriangleCalculator();
        //create Scanner object
        Scanner scanner = new Scanner(System.in);
        String choice;
        System.out.println("\nWelcome to Ali's Super Fancy Calculator! \nHere are the ultra sophisticated operations:");


        while(true){
            String menu = """
                    \n\t1 Calculate area of triangle using its base and height
                    \t2 Calculate area of triangle using three sides
                    \t3 Determine what kind of triangle you have
                    \t4 Review prime numbers from 1-100
                    \t5 Exit the Calculator
                        \nMake your selection!                
                    """;
            System.out.println(menu);
            choice = scanner.next();

            switch(choice){
                case "1" :
                    //ask for user input to determine area
                    System.out.println("Enter the base of the triangle");
                    double base = scanner.nextDouble();
                    System.out.println("Enter the height of the triangle");
                    double height = scanner.nextDouble();
                    //call calculateArea
                    triangleCalculator.calculateArea(base, height);
                    break;
                case "2" :
                    //ask for user input to determine area with three sides
                    System.out.println("Enter all the sides of the triangle");
                    System.out.println("Side A: ");
                    double sideA = scanner.nextDouble();
                    System.out.println("Side B: ");
                    double sideB = scanner.nextDouble();
                    System.out.println("Side C: ");
                    double sideC = scanner.nextDouble();
                    //call calculateArea method that uses three sides
                    triangleCalculator.calculateAreaWithSides(sideA, sideB, sideC);
                    break;
                case "3" :
                    //ask for user input to determine triangle type using three sides
                    System.out.println("Let's determine if your triangle is an equilateral, isosceles, or scalene triangle. Please enter the length of the first side of the triangle: ");
                    double sideOne = scanner.nextDouble();
                    System.out.println("Enter the second length of the second side: ");
                    double sideTwo = scanner.nextDouble();
                    System.out.println("Enter the length of the third side: ");
                    double sideThree = scanner.nextDouble();
                    //call determineTriangleType method
                    triangleCalculator.determineTriangleType(sideOne, sideTwo, sideThree);
                    break;
                case "4" :
                    System.out.println("It's Prime Time!");
                    triangleCalculator.primeNumberCalculator();
                    break;
                case "5" :
                    System.out.println("Goodbye!");
                    System.exit(0);
                default :
                    System.out.println("Invalid selection. Please try again!");
                    break;


            }


        }







    }
}