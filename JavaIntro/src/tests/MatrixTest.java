package tests;

import org.junit.Test;
import tasks.MatrixTask;

import static org.junit.Assert.assertArrayEquals;

public class MatrixTest {

    @Test
    public void testMatrix() {
        MatrixTask task = new MatrixTask();

        assertArrayEquals(new int[][]{}, task.createMatrix(null));
        assertArrayEquals(new int[][]{}, task.createMatrix(new int[]{}));
        assertArrayEquals(new int[][]{{1,2,3},{2,3,1},{3,1,2}},
                task.createMatrix(new int[]{1,2,3}));
        assertArrayEquals(new int[][]{{0,0,0},{0,0,0},{0,0,0}},
                task.createMatrix(new int[]{0,0,0}));
        assertArrayEquals(new int[][]{{1}}, task.createMatrix(new int[]{1}));
    }

}
