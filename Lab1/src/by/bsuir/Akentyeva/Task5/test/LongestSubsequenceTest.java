package by.bsuir.Akentyeva.Task5.test;

import org.junit.Test;
import by.bsuir.Akentyeva.Task5.util.LongestSubsequenceTask;
import static org.junit.Assert.assertEquals;

public class LongestSubsequenceTest {

    @Test
    public void testIncreasingSubsequenceLength() {
        LongestSubsequenceTask task = new LongestSubsequenceTask();

        assertEquals(0,
                task.fingLongestIncreasingSubsequenceLength(new int[]{}));
        assertEquals(0,
                task.fingLongestIncreasingSubsequenceLength(null));
        assertEquals(4,
                task.fingLongestIncreasingSubsequenceLength(new int[]{ -1, 6, 4, 8, 11, 8, 10, 6 }));
        assertEquals(1,
                task.fingLongestIncreasingSubsequenceLength(new int[]{ 1, 1, 1, 1 }));
    }
}
