package by.bsuir.Akentyeva.Task3.test;


import by.bsuir.Akentyeva.Task3.util.FunctionCalculator;
import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class FunctionTest {

    @Test
    public void testCalculations() {
        /*assertArrayEquals(new FunctionCalculator(-1, 5, 2).getResults().toArray(),
                new Double[]{-1.557408, 1.557408, -0.142547, -3.380515});*/
        assertArrayEquals(new Double[]{-1.5574077246549023},
                new FunctionCalculator(-1, -1, 0).getResults().toArray());
    }
}