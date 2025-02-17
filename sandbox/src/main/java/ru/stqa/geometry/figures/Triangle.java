package ru.stqa.geometry.figures;

public record Triangle(double sideA, double sideB, double sideC) {

    public Triangle{
        if (sideA < 0 || sideB < 0 || sideC < 0){
            throw new IllegalArgumentException("Triangle side should be non-negative");
        }
    }

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
}



