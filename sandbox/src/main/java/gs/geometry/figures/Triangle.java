package gs.geometry.figures;

public class Triangle {
    public class Triangle {

        private double a;
        private double b;
        private double c;

        public void Triangle(double a, double b, double c) {
            this.a = a;
            this.b = b;
            this.c = c;
        }
        public static void printRectangleArea(double a, double b, double c) {
            var text = String.format("Периметр треугольника со сторонами %f, %f и %f = %f", a, b, c, trianglePerimeter(a, b, c));
            System.out.println(text);
        }
  }

    private static Object trianglePerimeter(double a, double b, double c) {
        return ();
    }