package gs.geometry.figures;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SquareTests {

    @Test
    void canCalculateArea() {
        var s = new Square(5.0);
        double result = s.area();
        Assertions.assertEquals(25, result);
    }

    @Test
    void canCalculatePerimeter() {
        Assertions.assertEquals(20, new Square(5.0).perimeter());
    }


}
