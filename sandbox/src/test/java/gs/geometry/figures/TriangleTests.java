package gs.geometry.figures;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static gs.geometry.figures.Triangle.TriangleArea;
import static gs.geometry.figures.Triangle.TrianglePerimeter;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class TriangleTests {

    @Test
    void canCalculateArea() {
        var s = new Triangle(3.0,4.0,5.0);
        double result = TriangleArea(3.0,4.0,5.0);
        Assertions.assertEquals(6.0, result);
    }

    @Test
    void canCalculatePerimeter() {
        var s = new Triangle(3.0,4.0,5.0);
        double result = (double) TrianglePerimeter(3.0,4.0,5.0);
        Assertions.assertEquals(12.0,result);
    }
}
