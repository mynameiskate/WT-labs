package by.bsuir.Akentyeva.Task1.runner;

import by.bsuir.Akentyeva.DataScanner;
import by.bsuir.Akentyeva.Task1.util.FunctionCalculator;

public class Runner {
    public static void main(String[] args) {
        double x;
        double y;

        System.out.println("Enter x:");
        x = DataScanner.getDoubleFromConsole();

        System.out.println("Enter y:");
        y = DataScanner.getDoubleFromConsole();

        FunctionCalculator calculator = new FunctionCalculator(x, y);
        double result = calculator.calculate();
        System.out.println(String.format("Result: %f", result));
    }
}
