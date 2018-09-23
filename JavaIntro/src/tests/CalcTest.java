package tests;

import org.junit.Test;
import tasks.CalcTask;
import static org.junit.Assert.assertEquals;

public class CalcTest {

    @Test
    public void testCalculations() {
        CalcTask task = new CalcTask();
        assertEquals(1.5, task.calculate(1,-1),0.001);
    }
}