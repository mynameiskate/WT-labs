package by.bsuir.Akentyeva.Task5.runner;

import by.bsuir.Akentyeva.DataScanner;
import by.bsuir.Akentyeva.Task4.util.PrimeFinder;
import by.bsuir.Akentyeva.Task5.util.LongestSubsequenceTask;

public class Runner {
    public static void main(String[] args) {
        int count;

        System.out.println("Enter number amount:");
        count = DataScanner.getPositiveIntFromConsole();

        int[] sourceNumbers = new int[count];

        for(int i = 0; i < count; i++) {
            System.out.println(String.format("Enter element no. %d", i));
            sourceNumbers[i] = DataScanner.getIntFromConsole();
        }

        LongestSubsequenceTask subsequenceFinder = new LongestSubsequenceTask();
        int result = subsequenceFinder.fingLongestIncreasingSubsequenceLength(sourceNumbers);

        System.out.println(String.format("Longest increasing subsequence length: %d", result));
    }
}


