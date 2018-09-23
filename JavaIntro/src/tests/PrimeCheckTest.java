package tests;

import org.junit.Test;
import tasks.PrimeCheckerTask.PrimeFinder;
import static org.junit.Assert.assertArrayEquals;

public class PrimeCheckTest {

    @Test
    public void testPrimeIndexes() {
        PrimeFinder task = new PrimeFinder();

        assertArrayEquals(task.findPrimes(new int[]{1, 10, 15, -5, 0}),
                new Integer[]{});
        assertArrayEquals(task.findPrimes(new int[]{10, 2, 17, 45, -100}),
                new Integer[]{1, 2});
    }
}