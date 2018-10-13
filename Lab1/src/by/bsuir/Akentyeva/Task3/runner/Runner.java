package by.bsuir.Akentyeva.Task3.runner;

import by.bsuir.Akentyeva.DataScanner;
import by.bsuir.Akentyeva.Task3.util.FunctionCalculator;
import java.util.ArrayList;

public class Runner {
    public static void main(String[] args) {
        double a;
        double b;
        double step;

        System.out.println("Enter left end point:");
        a = DataScanner.getDoubleFromConsole();

        System.out.println("Enter right end point:");
        b = DataScanner.getDoubleFromConsole();

        System.out.println("Enter calculation step:");
        step = DataScanner.getDoubleFromConsole();

        FunctionCalculator calculator = new FunctionCalculator(a, b, step);
        ArrayList<Double> results = calculator.getResults();

        System.out.println("Result:");
        System.out.println(createTable(results, Math.min(a,b), Math.abs(step)));
    }

    private static String createTable(ArrayList<Double> values, double a, double step) {
        String table = " _______________________\r\n";
        table +=       "|    x    |   f(x)      |\r\n";
        table +=       "|_________|_____________|\r\n" ;

        for(Double value: values) {
            table += String.format("| %+.4f | %+.6f  |\r\n", a, value);
            table +=       "|_________|_____________|\r\n";
            a += step;
        }

        return table;
    }
}
