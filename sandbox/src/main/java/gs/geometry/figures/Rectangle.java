package gs.geometry.figures;

public record Rectangle(double a, double b) {

    public Rectangle(double a, double b) {
        if (a < 0 || b < 0) {
            throw new IllegalArgumentException("Rectangle side should be non-negative");
        }
        this.a = a;
        this.b = b;
    }

    public static void printRectangleArea(double a, double b) {
        var text = String.format("Площадь прямоугольника со сторонами %f и %f = %f", a, b, rectangleArea(a, b));
        System.out.println(text);
    }

    private static double rectangleArea(double a, double b) {
        return a * b;
    }
}
