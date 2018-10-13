package by.bsuir.Akentyeva.Task8.test;

import org.junit.Test;
import by.bsuir.Akentyeva.Task8.util.MergeTask;

import static org.junit.Assert.assertArrayEquals;

public class MergeTest {
    private double PRECISION = 0.001;

    @Test
    public void testMerge() {
        MergeTask task = new MergeTask();

        assertArrayEquals(new double[]{},
                task.mergeArrays(new double[]{}, new double[]{}), PRECISION);
        assertArrayEquals(new double[]{5,5,5},
                task.mergeArrays(new double[]{5,5}, new double[]{5}), PRECISION);
        assertArrayEquals(new double[]{5,5},
                task.mergeArrays(new double[]{5,5}, new double[]{}), PRECISION);
        assertArrayEquals(new double[]{1,2,3,4,5},
                task.mergeArrays(new double[]{1,5}, new double[]{2,3,4}), PRECISION);
        assertArrayEquals(new double[]{5},
                task.mergeArrays(new double[]{5}, null), PRECISION);
        assertArrayEquals(null,
                task.mergeArrays(null, null), PRECISION);
    }

}