package tasks.BasketTask.entities;

public class Ball {
    private Color color;
    private double weight;

    public Ball(Color color, double weight) {
        this.color = color;
        this.weight = weight;
    }

    public Color getColor() {
        return color;
    }

    public double getWeight() {
        return weight;
    }

    @Override
    public String toString() {
        String ballStr = "\r\nBall\r\n";
        ballStr += String.format("color: %s\r\n", color.toString());
        ballStr += String.format("weight: %f\r\n", weight);
        ballStr += "_____________________\r\n";

        return ballStr;
    }
}
