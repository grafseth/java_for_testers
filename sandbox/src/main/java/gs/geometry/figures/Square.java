package gs.geometry.figures;

public class Square {

    private double side;

    public Square(double side) {
        this.side = side;
    }

    public static void printSquareArea(Square s) {
        String text = String.format("Площадь квадрата cо сторонами %f = %f", s.side, s.area());
        System.out.println(text);
    }

    public static void printSquarePerimeter(Square s) {
        String text = String.format("Периметр квадрата со сторонами %f = %f", s.side, s.perimeter());
        System.out.println(text);
    }

    public double area() {
        return this.side * this.side;
    }

    public double perimeter() {
        return 4 * this.side;
    }
}
