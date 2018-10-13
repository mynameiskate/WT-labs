package by.bsuir.Akentyeva.Task6.runner;

import by.bsuir.Akentyeva.DataScanner;
import by.bsuir.Akentyeva.Task1.util.FunctionCalculator;
import by.bsuir.Akentyeva.Task6.util.MatrixTask;

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

        MatrixTask matrixCreator = new MatrixTask();
        int[][] matrix = matrixCreator.createMatrix(sourceNumbers);

        printMatrix(matrix);
    }

    private static void printMatrix(int[][] matrix) {
        System.out.println("Result matrix:");

        if(matrix.length == 0) {
            System.out.println("matrix is empty.");
        } else {
            for (int i = 0; i < matrix.length; i++){
                for (int j = 0; j < matrix[0].length; j++) {
                    System.out.print(String.format("%5d", matrix[i][j]));
                }
                System.out.println();
            }
        }
    }
}
