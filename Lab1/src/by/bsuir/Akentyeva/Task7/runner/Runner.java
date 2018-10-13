package by.bsuir.Akentyeva.Task7.runner;

import by.bsuir.Akentyeva.DataScanner;
import by.bsuir.Akentyeva.Task7.util.ShellSortTask;

public class Runner {
    public static void main(String[] args) {
        int count;

        System.out.println("Enter array size:");
        count = DataScanner.getPositiveIntFromConsole();
        double[] numbers = getDoubleArrayFromConsole(count);

        ShellSortTask sorter = new ShellSortTask();
        double[] sortedArray = sorter.shellSort(numbers);

        printDoubleArray(sortedArray);
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
