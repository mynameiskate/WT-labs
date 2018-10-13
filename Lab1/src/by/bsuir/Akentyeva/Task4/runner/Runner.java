package by.bsuir.Akentyeva.Task4.runner;

import by.bsuir.Akentyeva.DataScanner;
import by.bsuir.Akentyeva.Task4.util.PrimeFinder;

import java.util.ArrayList;

public class Runner {
    public static void main(String[] args) {
        int x;

        System.out.println("Enter positive array size:");
        x = DataScanner.getPositiveIntFromConsole();

        int[] sourceNumbers = new int[x];

        for(int i = 0; i < sourceNumbers.length; i++) {
            System.out.println(String.format("Enter number no. %d", i));
            sourceNumbers[i] = DataScanner.getIntFromConsole();
        }

        PrimeFinder primeFinder = new PrimeFinder();
        Integer[] result = primeFinder.findPrimes(sourceNumbers);
        printIntArray(result, "Indexes of prime numbers:", "none found");
    }

    private static void printIntArray(Integer[] numberList,
                                 String title, String defaultText) {
        System.out.println(title);

        if (numberList.length > 0) {
            for(Integer x : numberList) {
                System.out.print(String.format(" %d", x));
            }
        } else {
            System.out.println(defaultText);
        }
    }
}


