package by.bsuir.Akentyeva.Task2.util;

public class AreaTask {

    private boolean isInUpperRect(double x, double y) {
        return (y >= 0) && (y <= 5)
                && (x >= -4) && (x <= 4);
    }

    private boolean isInLowerRect(double x, double y) {
        return (y >= -3) && (y <= 0)
                && (x >= -6) && (x <= 6);
    }

    public boolean isInArea(double x, double y) {
        return isInLowerRect(x, y)
                || isInUpperRect(x, y);
    }

}
