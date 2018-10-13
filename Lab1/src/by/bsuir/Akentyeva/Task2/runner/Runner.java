package by.bsuir.Akentyeva.Task2.runner;

import by.bsuir.Akentyeva.DataScanner;
import by.bsuir.Akentyeva.Task2.util.AreaTask;

public class Runner {
    public static void main(String[] args) {
        double x;
        double y;

        System.out.println("Enter x:");
        x = DataScanner.getDoubleFromConsole();

        System.out.println("Enter y:");
        y = DataScanner.getDoubleFromConsole();

        AreaTask areaChecker = new AreaTask();
        boolean result = areaChecker.isInArea(x, y);
        System.out.println(String.format("Result: %b", result));
    }
}
