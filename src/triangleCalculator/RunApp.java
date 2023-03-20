package triangleCalculator;

import java.util.InputMismatchException;
import java.util.Scanner;

public class RunApp {

    public static void main(String[] args) {

        double sideAInput = 0.0;
        double sideBInput = 0.0;
        double sideCInput = 0.0;
        boolean isNumber = true;

        //get user input
        Scanner scanner = new Scanner(System.in);

        do{
            System.out.println("Enter the length of side A of the triangle");
            String value = scanner.next();
            if(!value.matches("[0-9]+" ) || ("0".equals(value))){
                System.out.println("Please insert only a number above 0");
                isNumber = false;
            }

            if(isNumber){
                sideAInput = Double.parseDouble(value);
            }
        } while (!isNumber);

        do{
            System.out.println("Enter the length of side B of the triangle");
            String value = scanner.next();
            if(!value.matches("[0-9]+" ) || ("0".equals(value))){
                System.out.println("Please insert only a number above 0");
                isNumber = false;
            }
            if(isNumber){
                sideBInput = Double.parseDouble(value);
            }
        } while (!isNumber);

        do{
            System.out.println("Enter the length of side C of the triangle");
            String value = scanner.next();
            if(!value.matches("[0-9]+" ) || ("0".equals(value))){
                System.out.println("Please insert only a number above 0");
                isNumber = false;
            }
            if(isNumber){
                sideCInput = Double.parseDouble(value);
            }
        } while (!isNumber);


        //next double converts all integers even 0 to 0.0
        //read in as a string check the value with a regex to see if it is a number
        //"0".equals(value) your catch for not wanting 0, 0 is a constant value is not, will never throw a nullptr because if values is null it will return false.


        //initialize TriangleCalculator
        TriangleCalculator triangleCalculator = new TriangleCalculator();


        //call TriangleCalculator method
        double calculateArea = triangleCalculator.calculateArea(sideAInput, sideBInput, sideCInput);

    } //end main




} //end RunApp
