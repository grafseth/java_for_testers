package gs.geometry;

import gs.geometry.figures.Rectangle;
import gs.geometry.figures.Square;
import gs.geometry.figures.Triangle;


public class Geometry {
    public static void main(String[] args) {
        Square.printSquareArea(new Square(7.0));
        Square.printSquareArea(new Square(5.0));
        Square.printSquareArea(new Square(3.0));
        Square.printSquarePerimeter(new Square(5.0));

        Rectangle.printRectangleArea(3.0, 5.0);
        Rectangle.printRectangleArea(7.0, 9.0);

        Triangle.printtrianglePerimeter(2.0, 3.0, 7.0);
        Triangle.printtriangleArea(3.0,4.0,5.0);
    }

}
