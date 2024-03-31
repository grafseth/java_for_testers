package gs.geometry.figures;

public class Square {
    public static void printSquareArea(double side) {
        String text = String.format("Площадь квадрата cо сторонами %f = %f", side, squareArea(side));
        System.out.println(text);
    }

    private static double squareArea(double a) {
        return a * a;
    }
}
