package tests;

import org.junit.Test;
import tasks.ShellSortTask;
import static org.junit.Assert.assertArrayEquals;

public class ShellSortTest {
    private double PRECISION = 0.001;

    @Test
    public void testShellSort() {
        ShellSortTask task = new ShellSortTask();

        assertArrayEquals(new double[]{}, task.shellSort(new double[]{}), PRECISION);
        assertArrayEquals(null, task.shellSort(null), PRECISION);
        assertArrayEquals(new double[]{0,0,0}, task.shellSort(new double[]{0,0,0}), PRECISION);
        assertArrayEquals(new double[]{0,1,3,7,8}, task.shellSort(new double[]{7,3,8,1,0}), PRECISION);
    }
}
