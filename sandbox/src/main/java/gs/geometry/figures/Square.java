package gs.geometry.figures;

public class Square {
    public static void printSquareArea(double a) {
        System.out.println("Площадь прямоугольника cо сторонами" + a + " = " + squareArea(a));
    }

    private static double squareArea(double a) {
        return a * a;
    }
}
