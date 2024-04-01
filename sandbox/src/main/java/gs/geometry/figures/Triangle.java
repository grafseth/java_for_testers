package gs.geometry.figures;

public class Triangle {
    public static Object printTrianglePerimeter;

    public Triangle(double a, double b, double c) {
    }

    public static void printTrianglePerimeter(double a, double b, double c) {
            var text = String.format("Периметр треугольника со сторонами %f, %f и %f = %f", a, b, c, TrianglePerimeter(a, b, c));
            System.out.println(text);
        }

        public static void printTriangleArea(double a, double b, double c) {
            var text = String.format("Площадь треугольника со сторонами %f, %f и %f = %f", a, b, c, TriangleArea(a, b, c));
            System.out.println(text);
        }

    static Object TrianglePerimeter(double a, double b, double c) {
        return (a + b + c);
    }
    public static double TriangleArea(double a, double b, double c) {
        double p = (a + b + c) / 2;
        double area = Math.sqrt(p * (p - a) * (p - b) * (p - c));
        return area;
       }
  }