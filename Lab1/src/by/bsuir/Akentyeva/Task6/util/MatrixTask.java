package by.bsuir.Akentyeva.Task6.util;

public class MatrixTask {

    public int[][] createMatrix(int[] sourceArray) {
        if (sourceArray == null) {
            return new int[][]{};
        }

        int size = sourceArray.length;
        int[][] resultArray = new int[size][size];

        for (int i = 0; i < size; i ++) {
            for (int j = 0; j < size; j ++) {
                resultArray[i][j] = sourceArray[(i + j) % size];
            }
        }

        return resultArray;
    }

}
