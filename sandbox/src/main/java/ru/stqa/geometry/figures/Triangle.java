package ru.stqa.geometry.figures;

public class Triangle {

    static void printTriangleArea(double a, double b, double c) {
        String text = String.format("Площадь треугольника со сторонами %f, %f и %f = %f", a, b, c, triangleArea(a, b, c));
        System.out.println(text);
    }

    public static double triangleArea(double a, double b, double c) {
        return Math.sqrt(((0.5 * trianglePerimeter(a, b, c)) * (0.5 * trianglePerimeter(a, b, c) - a) * (0.5 * trianglePerimeter(a, b, c) - b) * (0.5 * trianglePerimeter(a, b, c) - c)));
    }

    public static void printTrianglePerimeter(double a, double b, double c){
        String text = String.format("Периметр треугольника со сторонами %f, %f и %f = %f", a, b, c, trianglePerimeter(a, b, c));
        System.out.println(text);

    }

    public static double trianglePerimeter(double a, double b, double c) {
        return a + b + c;
    }
}



