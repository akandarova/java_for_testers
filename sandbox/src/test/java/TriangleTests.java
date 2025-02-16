import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.stqa.geometry.figures.Triangle;

public class TriangleTests {
    @Test
    void canCalculatePerimeter(){
        var result = Triangle.trianglePerimeter(4.0, 5.0, 3.0);
        Assertions.assertEquals(12.0, result);
    }
    @Test
    void canCalculateArea(){
        var result = Triangle.triangleArea(4.0, 5.0, 3.0);
        Assertions.assertEquals(6, result);
    }

}

