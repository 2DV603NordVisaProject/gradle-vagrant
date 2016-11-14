import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Class ExampleTest
 *
 * @author Axel Nilsson (axnion)
 */
public class ExampleTest {
    private Example target;

    @Before
    public void createExample() {
        target = new Example();
    }

    @Test
    public void addTest() {
        assertEquals(2, target.add(1, 1));
    }

    @Test
    public void subTest() {
        assertEquals(0, target.sub(1, 1));
    }

    @Test
    public void multiplyTest() {
        assertEquals(1, target.multiply(1, 1));
    }

    @Test
    public void divideTest() {
        assertEquals(1.0, target.divide(1, 1));
    }

    @Test
    public void divideByZeroTest() {
        target.divide(1, 0);
    }
}
