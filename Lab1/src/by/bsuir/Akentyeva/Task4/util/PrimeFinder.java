package by.bsuir.Akentyeva.Task4.util;

import java.util.ArrayList;
import java.util.stream.IntStream;

public class PrimeFinder {

    public Integer[] findPrimes(int[] sourceArray) {
        var primeIndexList = new ArrayList<Integer>();

        if (sourceArray != null) {
            for (int i = 0; i < sourceArray.length; i++) {
                if (isPrime(sourceArray[i])) {
                    primeIndexList.add(i);
                }
            }
        }

        return primeIndexList.toArray(new Integer[primeIndexList.size()]);
    }

    private boolean isPrime(int number) {
        if (number < 2) {
            return false;
        }

        int root = (int) Math.sqrt(number);
        return IntStream.rangeClosed(2, root)
                .noneMatch(i -> number % i == 0);
    }
}
