package tasks.PrimeCheckerTask;

import java.util.stream.IntStream;

public class PrimeChecker {

    public static boolean isPrime(int number) {
        if (number < 2) {
            return false;
        }

        int root = (int) Math.sqrt(number);
        return IntStream.rangeClosed(2, root)
                .noneMatch(i -> number % i == 0);
    }

}
