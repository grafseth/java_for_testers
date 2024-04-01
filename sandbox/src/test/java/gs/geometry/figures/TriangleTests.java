package gs.geometry.figures;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static gs.geometry.figures.Triangle.TriangleArea;

public class TriangleTests {

    @Test
    void canCalculateArea() {
        var s = new Triangle(8.0,4.0,7.0);
        double result = TriangleArea(8.0,4.0,7.0);
        Assertions.assertEquals(6.0, result);
    }
}
