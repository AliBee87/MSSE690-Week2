package triangleCalculator;

import java.util.Objects; //IntelliJ is telling me this is necessary for hash
import java.util.Scanner;

public class TriangleCalculator {
    private double base;
    private double height;
    private double sideOne;
    private double sideTwo;
    private double sideThree;
    private double sideA;
    private double sideB;
    private double sideC;
    enum Type {EQUILATERAL, ISOSCELES, SCALENE, NOTTRIANGLE}
    Scanner scanner = new Scanner(System.in);

    //no arg constructor
    public TriangleCalculator() {
    }

    //constructor for calculateArea
    public TriangleCalculator(double base, double height) {
        this.base = base;
        this.height = height;
    }

    //constructor for determineTriangleType
    public TriangleCalculator(double sideA, double sideB, double sideC) {
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
    }

    //calculate area of triangle
    public void calculateArea(double base, double height) {
        if (base > 0 && height > 0) {
            double answer = base * height / 2;
            System.out.println("The area of the triangle is "+ answer);
        } else
            System.out.println("Invalid entry. Please enter an integer greater than 0.");
    }

   //added area calculation with three sides back
    public void calculateAreaWithSides(double sideOne, double sideTwo, double sideThree){
        if ((sideOne + sideTwo) > sideThree && (sideOne + sideThree) > sideTwo && (sideTwo + sideThree) > sideOne) {
            double s = (sideOne + sideTwo + sideThree) / 2;
            double area = Math.sqrt(s * (s - sideOne) * (s - sideTwo) * (s- sideThree));
            System.out.println("The area of the triangle is: " + area);
        }
        else {
            System.out.println("The triangle with entered dimensions does not exist.");
        }

    }
    //determine if isosceles, scalene, or equilateral
    public void determineTriangleType(double sideA, double sideB, double sideC) {
           Type currentType = Type.EQUILATERAL;
        if ((sideA + sideB <= sideC) || (sideA + sideC <= sideB) || (sideB + sideC <= sideA)) {
            currentType = Type.NOTTRIANGLE;
        } else if ((sideA == sideB) || (sideB == sideC) || (sideC == sideA)) {
            currentType = Type.ISOSCELES;
        } else if ((sideA == sideB) && (sideB == sideC) && (sideC == sideA)) {
            currentType = Type.EQUILATERAL;
        } else {
            currentType = Type.SCALENE;
        }
        switch (currentType) {
            case NOTTRIANGLE : {
                System.out.println("This is not a triangle.");
                break;
            }
            case ISOSCELES : {
                System.out.println("This is an isosceles triangle.");
                break;
            }
            case EQUILATERAL : {
                System.out.println("This is an equilateral triangle.");
                break;
            }
            case SCALENE : {
                System.out.println("This is a scalene triangle.");
                break;
            }

        }

    }
    //keeping this method because it makes more sense to me
    public void determineTriangleTypeTwo(double sideA, double sideB, double sideC){
        if ((sideA + sideB <= sideC) || (sideA + sideC <= sideB) || (sideB + sideC <= sideA)) {
            System.out.println("This is not a triangle.");
        } else if ((sideA == sideB) || (sideB == sideC) || (sideC == sideA)) {
            System.out.println("this is an isosceles triangle.");
        } else if ((sideA == sideB) && (sideB == sideC) && (sideC == sideA)) {
            System.out.println("This is an equilateral triangle.");
        } else {
            System.out.println("This is a scalene triangle");
        }
    }

    public void primeNumberCalculator(){
        int i, j, isPrime, n;
        System.out.println("\nAll prime numbers between 1 and 100: ");
        //for every number between 2 and 100, check whether prime number or not
        for (i = 2; i <= 100; i++){
            isPrime = 0;
            //check whether i is prime or not
            for (j = 2; j <= i/2; j++){
                //if any number between 2 to i/2 divides i completely, it cannot be a prime number
                if (i % j == 0) {
                    isPrime = 1;
                    break;
                }
            }
            if (isPrime == 0)
                System.out.print(i + " ");


        }

    }
    //getters an setters
    public double getSideA() {
        return sideA;
    }
    public void setSideA(double sideA) {
        this.sideA = sideA;
    }
    public double getSideB() {
        return sideB;
    }
    public void setSideB(double sideB) {
        this.sideB = sideB;
    }
    public double SideC() {
        return sideC;
    }
    public void setSideC(double sideC) {
        this.sideC = sideC;
    }

    public double getBase() {
        return base;
    }

    public double getHeight() {
        return height;
    }

    public double getSideOne() {
        return sideOne;
    }

    public double getSideTwo() {
        return sideTwo;
    }

    public double getSideThree() {
        return sideThree;
    }

    public double getSideC() {
        return sideC;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TriangleCalculator that = (TriangleCalculator) o;
        return Double.compare(that.base, base) == 0 && Double.compare(that.height, height) == 0 && Double.compare(that.sideOne, sideOne) == 0 && Double.compare(that.sideTwo, sideTwo) == 0 && Double.compare(that.sideThree, sideThree) == 0 && Double.compare(that.sideA, sideA) == 0 && Double.compare(that.sideB, sideB) == 0 && Double.compare(that.sideC, sideC) == 0 && Objects.equals(scanner, that.scanner);
    }

    @Override
    public int hashCode() {
        return Objects.hash(base, height, sideOne, sideTwo, sideThree, sideA, sideB, sideC, scanner);
    }

    @Override
    public String toString() {
        return "TriangleCalculator{" +
                "base=" + base +
                ", height=" + height +
                ", sideOne=" + sideOne +
                ", sideTwo=" + sideTwo +
                ", sideThree=" + sideThree +
                ", sideA=" + sideA +
                ", sideB=" + sideB +
                ", sideC=" + sideC +
                ", scanner=" + scanner +
                '}';
    }
}