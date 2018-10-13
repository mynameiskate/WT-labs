package by.bsuir.Akentyeva;

import java.util.Scanner;

public class DataScanner {

    private static Scanner scanner =  new Scanner(System.in);

    public static double getDoubleFromConsole() {
        while(!scanner.hasNextDouble()) {
            scanner.next();
        }

        return scanner.nextDouble();
    }

    public static int getIntFromConsole() {
        while (!scanner.hasNextInt()) {
            scanner.next();
        }

        return scanner.nextInt();
    }

    public static int getPositiveIntFromConsole() {
        int result;

        do {
            result = getIntFromConsole();
        } while (result <= 0);
        return result;
    }

    public static int getNonNegativeIntFromConsole() {
        int result;

        do {
            result = getIntFromConsole();
        } while (result < 0);
        return result;
    }

    public static String getStringFromConsole() {
        return scanner.nextLine();
    }
}
