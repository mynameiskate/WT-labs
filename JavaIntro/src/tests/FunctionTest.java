package tests;

import org.junit.Test;
import tasks.FunctionTask;

import static org.junit.Assert.assertEquals;

public class FunctionTest {

    @Test
    public void testCalculations() {
        FunctionTask task = new FunctionTask();
        assertEquals(317.332373, task.compute(-1, 10, 0.05), 0.001);
        assertEquals(1.557407725, task.compute(1, 10, 0), 0.001);
    }
}