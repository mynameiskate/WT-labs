package tasks;

public class FunctionTask {
    private double leftEndPoint;
    private double rightEndPoint;
    private double step;

    private double calcFunction(double x) {
        return Math.tan(x);
    }

    private void correctEndPoints() {
        if (rightEndPoint < leftEndPoint) {
            double temp = leftEndPoint;
            leftEndPoint = rightEndPoint;
            rightEndPoint = temp;
        }
    }

    public double compute(double a, double b, double h) {
        leftEndPoint = a;
        rightEndPoint = (h == 0) ? a : b;
        step = (h < 0) ? -h : h;
        correctEndPoints();

        double result = 0;

        String table = " _______________________\r\n";
        table +=       "|    x    |   f(x)      |\r\n";
        table +=       "|_________|_____________|\r\n" ;

         do {
            result += calcFunction(leftEndPoint);
            table += String.format("| %+.4f | %+.6f  |\r\n", leftEndPoint, result);
            table +=       "|_________|_____________|\r\n";
            leftEndPoint += step;
        } while (leftEndPoint < rightEndPoint + step / 1000);

        System.out.println(table);

        return result;
    }

}

