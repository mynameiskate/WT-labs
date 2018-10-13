package by.bsuir.Akentyeva.Task7.util;

public class ShellSortTask {

    private void swap(double[] array, int indexA, int indexB) {
        double temp = array[indexA];
        array[indexA] = array[indexB];
        array[indexB] = temp;
    }

    public double[] shellSort(double[] sourceArray) {
        if (sourceArray == null) {
            return null;
        }

        int i = 0;

        while (i < sourceArray.length - 1) {
            if (sourceArray[i] <= sourceArray[i + 1]) {
                i++;
            } else {
                swap(sourceArray, i, i + 1);
                i = (i > 0) ? (i - 1) : 0;
            }
        }

        return sourceArray;
    }
}
