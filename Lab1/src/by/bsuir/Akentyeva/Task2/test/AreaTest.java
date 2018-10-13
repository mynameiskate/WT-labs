package by.bsuir.Akentyeva.Task2.test;

import org.junit.Test;
import by.bsuir.Akentyeva.Task2.util.AreaTask;
import static org.junit.Assert.*;

public class AreaTest {

    @Test
    public void testIfPointIsInArea() {
        AreaTask task = new AreaTask();
        assertTrue(task.isInArea(0,0));
        assertTrue(task.isInArea(3.5,5));
        assertTrue(task.isInArea(6,0));
        assertTrue(task.isInArea(5,-1));
        assertTrue(task.isInArea(-6,0));
        assertTrue(task.isInArea(-6,-3));
        assertTrue(task.isInArea(-4,0));
        assertFalse(task.isInArea(6.1, 0));
        assertFalse(task.isInArea(10, 10));
    }
}