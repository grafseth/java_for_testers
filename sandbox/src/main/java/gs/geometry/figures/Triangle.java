package gs.geometry.figures;

public class Triangle {
    public static Object printTrianglePerimeter;

    public void triangle(double a, double b, double c) {
    }

    public static void printtrianglePerimeter(double a, double b, double c) {
            var text = String.format("Периметр треугольника со сторонами %f, %f и %f = %f", a, b, c, trianglePerimeter(a, b, c));
            System.out.println(text);
        }

        public static void printtriangleArea(double a, double b, double c) {
            var text = String.format("Площадь треугольника со сторонами %f, %f и %f = %f", a, b, c, triangleArea(a, b, c));
            System.out.println(text);
        }

    static Object trianglePerimeter(double a, double b, double c) {
        return (a + b + c);
    }
    public static double triangleArea(double a, double b, double c) {
        double p = (a + b + c) / 2;
        double area = Math.sqrt(p * (p - a) * (p - b) * (p - c));
        return area;
       }
  }