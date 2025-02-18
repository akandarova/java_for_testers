package ru.stqa.geometry.figures;

import java.awt.*;
import java.util.Objects;

public record Triangle(double sideA, double sideB, double sideC) {

//    public Triangle {
//        if (sideA < 0 || sideB < 0 || sideC < 0) {
//            throw new IllegalArgumentException("Triangle side should be non-negative");
//        }
//
//        if ((sideA + sideB) < sideC || (sideB + sideC) < sideA || (sideA + sideC) > sideB){
//            throw new IllegalArgumentException("The sum of two sides cannot be less than the third");
//        }
//    }

    static void printTriangleArea(Triangle t) {
        String text = String.format("Площадь треугольника со сторонами %f, %f и %f = %f", t.sideA, t.sideB, t.sideC, t.triangleArea());
        System.out.println(text);
    }

    public static void printTrianglePerimeter(Triangle t){
        String text = String.format("Периметр треугольника со сторонами %f, %f и %f = %f", t.sideA, t.sideB, t.sideC, t.trianglePerimeter());
        System.out.println(text);

    }

    public double triangleArea() {
        return Math.sqrt(0.5 * trianglePerimeter() * (0.5 * trianglePerimeter() - this.sideA) * (0.5 * trianglePerimeter() - this.sideB) * (0.5 * trianglePerimeter() - this.sideC));
    }

    public double trianglePerimeter() {
        return this.sideA + this.sideB + this.sideC;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Triangle triangle = (Triangle) o;
        return (Double.compare(this.sideA, triangle.sideA) == 0 && Double.compare(this.sideB, triangle.sideB) == 0 && Double.compare(this.sideC, triangle.sideC) == 0)
                || (Double.compare(this.sideA, triangle.sideB) == 0 && Double.compare(this.sideB, triangle.sideC) == 0 && Double.compare(this.sideC, triangle.sideA) == 0)
        || (Double.compare(this.sideA, triangle.sideC) == 0 && Double.compare(this.sideB, triangle.sideA) == 0 && Double.compare(this.sideC, triangle.sideB) == 0);
    }

    @Override
    public int hashCode() {
        return Objects.hash(sideA, sideB, sideC);
    }
}



