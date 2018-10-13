package by.bsuir.Akentyeva.Task1.test;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

import by.bsuir.Akentyeva.Task1.util.FunctionCalculator;

public class FunctionTest {
    private static double PRECISION = 0.001;

    @Test
    public void testCalculations() {
        assertEquals(1.5,
                new FunctionCalculator(1, -1).calculate(), PRECISION);
    }
}
