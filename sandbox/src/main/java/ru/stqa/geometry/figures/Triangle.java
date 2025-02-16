package ru.stqa.geometry.figures;

public class Triangle {

    double sideA;
    double sideB;
    double sideC;

    public Triangle(double sideA, double sideB, double sideC) {
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
    }

    static void printTriangleArea(Triangle t) {
        String text = String.format("Площадь треугольника со сторонами %f, %f и %f = %f", t.sideA, t.sideB, t.sideC, t.triangleArea());
        System.out.println(text);
    }

//    public static double triangleArea(double a, double b, double c) {
//        return Math.sqrt(((0.5 * trianglePerimeter(a, b, c)) * (0.5 * trianglePerimeter(a, b, c) - a) * (0.5 * trianglePerimeter(a, b, c) - b) * (0.5 * trianglePerimeter(a, b, c) - c)));
//    }

    public static void printTrianglePerimeter(Triangle t){
        String text = String.format("Периметр треугольника со сторонами %f, %f и %f = %f", t.sideA, t.sideB, t.sideC, t.trianglePerimeter());
        System.out.println(text);

    }

//    public static double trianglePerimeter(double a, double b, double c) {
//        return a + b + c;
//    }

    public double triangleArea() {
        return Math.sqrt(0.5 * trianglePerimeter() * (0.5 * trianglePerimeter() - this.sideA) * (0.5 * trianglePerimeter() - this.sideB) * (0.5 * trianglePerimeter() - this.sideC));
    }

    public double trianglePerimeter() {
        return this.sideA + this.sideB + this.sideC;
    }
}



