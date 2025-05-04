import org.junit.Test;
import static org.junit.Assert.*;

public class AverageTest {
    @Test
    public void testFunctional() {
        Average avg = new Average();
        int[] list = {1, 2, 3, 4, 5};
        assertEquals(2, avg.average(3, list));
        assertEquals(3, avg.average(5, list));
        assertEquals(0, avg.average(0, list));
        assertEquals(0, avg.average(3, new int[]{}));
    }

    @Test
    public void testPartitions() {
        Average avg = new Average();
        int[] list = {10, 20, 30, 40, 50};
        assertEquals(15, avg.average(2, list));
        assertEquals(30, avg.average(5, list));
        assertEquals(30, avg.average(6, list));
        assertEquals(0, avg.average(0, list));
        assertEquals(0, avg.average(3, new int[]{}));
    }

    @Test
    public void testBoundaryValues() {
        Average avg = new Average();
        int[] list = {1, 2, 3};
        assertEquals(1, avg.average(1, list));
        assertEquals(2, avg.average(3, list));
        assertEquals(2, avg.average(4, list));
        assertEquals(0, avg.average(0, new int[]{}));
    }
}