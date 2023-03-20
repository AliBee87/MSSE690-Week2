package triangleCalculator;
import java.util.Objects;
public class TriangleCalculator {

    private double sideA;
    private double sideB;
    private double sideC;

    //constructor for calculateArea
    public TriangleCalculator(double sideA, double sideB, double sideC) {
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
    }

    //no arg constructor
    public TriangleCalculator() {
    }

    //calculate the area of the triangle
    //method determineTriangleType got moved into calculateArea method
    public double calculateArea(double sideA, double sideB, double sideC) {
        System.out.println("The area of the triangle is: ");
        double perimeter = (sideA + sideB + sideC) / 2;
        System.out.println(Math.sqrt(perimeter *(perimeter - sideA) * (perimeter - sideB) * (perimeter - sideC)));
        if (sideA == sideB && sideB == sideC) {
            System.out.println("This is an equilateral triangle.");
        } else if (sideA == sideB || sideB == sideC || sideC == sideA) {
            System.out.println("This is an isosceles triangle.");
        } else {
            System.out.println("This is a scalene triangle.");
        }
        return perimeter;
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

    //equals
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TriangleCalculator that = (TriangleCalculator) o;
        return Double.compare(that.sideA, sideA) == 0 && Double.compare(that.sideB, sideB) == 0 && Double.compare(that.sideC, sideC) == 0;
    }
    //hash
    @Override
    public int hashCode() {
        return Objects.hash(sideA, sideB, sideC);
    }

    //toString
    @Override
    public String toString() {
        return "TriangleCalculator{" +
                "sideA=" + sideA +
                ", sideB=" + sideB +
                ", sideC=" + sideC +
                '}';
    }
}
