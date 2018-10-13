package by.bsuir.Akentyeva.Task1.util;

public class FunctionCalculator {
    private double x;
    private double y;

    public FunctionCalculator(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double calculate() {
        double numerator = 1 + Math.pow(Math.sin(x + y), 2);
        double denominator = 2 + Math.abs(x - 2 * x / (1 + x * x * y * y));
        double result = numerator / denominator + x;

        return result;
    }
}
