package tasks.PrimeCheckerTask;

import java.util.ArrayList;

public class PrimeFinder {

    public Integer[] findPrimes(int[] sourceArray) {
        var primeIndexList = new ArrayList<Integer>();

        if (sourceArray != null) {
            for (int i = 0; i < sourceArray.length; i++) {
                if (PrimeChecker.isPrime(sourceArray[i])) {
                    primeIndexList.add(i);
                }
            }
        }

        NumberPrinter.printList(primeIndexList,
                "Indexes of prime numbers:",
                "none found");

        return primeIndexList.toArray(new Integer[primeIndexList.size()]);
    }

}
