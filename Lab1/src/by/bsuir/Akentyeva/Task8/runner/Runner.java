package by.bsuir.Akentyeva.Task8.runner;

import by.bsuir.Akentyeva.DataScanner;
import by.bsuir.Akentyeva.Task8.util.MergeTask;

public class Runner {
    public static void main(String[] args) {
        int count;

        System.out.println("Enter first array size:");
        count = DataScanner.getPositiveIntFromConsole();
        double[] baseNumbers = getDoubleArrayFromConsole(count);

        System.out.println("Enter second array size:");
        count = DataScanner.getPositiveIntFromConsole();
        double[] mergingNumbers = getDoubleArrayFromConsole(count);

        MergeTask merger = new MergeTask();
        double[] resultArray = merger.mergeArrays(baseNumbers, mergingNumbers);

        printDoubleArray(resultArray);
    }

    private static void printDoubleArray(double[] numbers) {
        System.out.println("Result array:");

        if(numbers.length == 0) {
            System.out.println("array is empty.");
        } else {
            for (int i = 0; i < numbers.length; i++){
                System.out.print(String.format("%f ", numbers[i]));
            }
        }
    }

    public static double[] getDoubleArrayFromConsole(int count) {
        double[] numbers = new double[count];

        for(int i = 0; i < count; i++) {
            System.out.println(String.format("Enter element no. %d", i));
            numbers[i] = DataScanner.getDoubleFromConsole();
        }

        return numbers;
    }
}
