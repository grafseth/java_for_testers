package gs.geometry.figures;

public class Triangle {
    double a;
    double b;
    double c;


    public Triangle() {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public static void printtrianglePerimeter(double a, double b, double c) {
        var text = String.format("Периметр треугольника со сторонами %f, %f и %f = %f", a, b, c, trianglePerimeter(a, b, c));
        System.out.println(text);
    }

    public static void printtriangleArea(double a, double b, double c) {
        var text = String.format("Площадь треугольника со сторонами %f, %f и %f = %f", a, b, c, triangleArea(a, b, c));
        System.out.println(text);
    }

    public static Object trianglePerimeter(double a, double b, double c) {
        return ((a + b + c));
    }

    public static double triangleArea(double a, double b, double c) {
        double p = semiPerimeter(a, b, c);
        return Math.sqrt(p * (p - a) * (p - b) * (p - c));
    }

    public static double semiPerimeter(double a, double b, double c) {
        double perimeter = (double) trianglePerimeter(a, b, c);
        return (perimeter) / 2;
    }
}
