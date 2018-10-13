package by.bsuir.Akentyeva.Task3.util;

import java.util.ArrayList;

public class FunctionCalculator {
    private double leftEndPoint;
    private double rightEndPoint;
    private double step;

    public FunctionCalculator(double a, double b, double step) {
        setEndPoints(a, b);
        setStep(step);
    }

    public void setStep(double step) {
        this.step = (step < 0) ? -step : step;
    }

    public void setEndPoints(double a, double b) {
        if (a > b) {
            this.leftEndPoint = b;
            this.rightEndPoint = a;
        } else {
            this.leftEndPoint = a;
            this.rightEndPoint = b;
        }
    }

    private double calculateFunction(double x) {
        return Math.tan(x);
    }

    public ArrayList<Double> getResults() {
        ArrayList<Double> result = new ArrayList<>();

        if (step == 0) {
            rightEndPoint = leftEndPoint;
        }

        do {
            result.add(calculateFunction(leftEndPoint));
            leftEndPoint += step;
        } while (leftEndPoint < rightEndPoint + step / 1000);

        return result;
    }

}
