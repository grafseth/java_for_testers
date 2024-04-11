package gs.geometry.figures;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static gs.geometry.figures.Triangle.triangleArea;
import static gs.geometry.figures.Triangle.trianglePerimeter;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class TriangleTests {

    @Test
    void canCalculateArea() {
        double result = triangleArea(3.0,4.0,5.0);
        Assertions.assertEquals(6.0, result);
    }

    @Test
    void canCalculatePerimeter() {
        var s = new Triangle();
        double result = (double) s.trianglePerimeter(3.0,4.0,5.0);
        Assertions.assertEquals(12.0,result);
    }
    @Test
    void cannotCreateTriangleWithNegativeSide() {
        try {
            new Triangle(-5.0, 3.0, 10.0);
            Assertions.fail();
        } catch (IllegalArgumentException exception) {
// Ok
        }
}
