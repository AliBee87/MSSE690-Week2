package triangleCalculator;

import java.util.Objects; //IntelliJ is telling me this is necessary for hash

public class TriangleCalculator {


    private double base;
    private double height;
    private double sideA;
    private double sideB;
    private double sideC;


    //no arg constructor
    public TriangleCalculator() {
    }
    public TriangleCalculator(double base, double height){
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
    public void calculateArea(double base, double height){
        double answer;
        if (base > 0 && height > 0) {
            answer = base*height/2;
            System.out.println("The area of the triangle is: " + answer);
        } else
            System.out.println("Invalid entry. Please enter an integer greater than 0.");
    }
    //determine if isosceles, scalene, or equilateral
    public void determineTriangleType(double sideA, double sideB, double sideC){
        if (sideA == sideB && sideB == sideC) {
            System.out.println("This is an equilateral triangle.");
        } else if (sideA == sideB || sideB == sideC || sideC == sideA) {
            System.out.println("This is an isosceles triangle.");
        } else {
            System.out.println("This is a scalene triangle.");
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TriangleCalculator that = (TriangleCalculator) o;
        return Double.compare(that.base, base) == 0 && Double.compare(that.height, height) == 0 && Double.compare(that.sideA, sideA) == 0 && Double.compare(that.sideB, sideB) == 0 && Double.compare(that.sideC, sideC) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(base, height, sideA, sideB, sideC);
    }

    @Override
    public String toString() {
        return "TriangleCalculator{" +
                "base=" + base +
                ", height=" + height +
                ", sideA=" + sideA +
                ", sideB=" + sideB +
                ", sideC=" + sideC +
                '}';
    }
}