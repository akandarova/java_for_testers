import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.stqa.geometry.figures.Triangle;

public class TriangleTests {
    @Test
    void canCalculatePerimeter(){
        var t = new Triangle(4.0, 5.0, 3.0);
        var result = t.trianglePerimeter();
//        Assertions.assertEquals(12.0, result);
        if (result != 12.0) {
            throw new AssertionError(String.format("Expected: %f, actual: %f", 6.0, result));
        }
    }
    @Test
    void canCalculateArea(){
        var t = new Triangle(4.0, 5.0, 3.0);
        var result = t.triangleArea();
//        Assertions.assertEquals(6.0, result);
        if (result != 6.0) {
            throw new AssertionError(String.format("Expected: %f, actual: %f", 6.0, result));
        }
    }

}

