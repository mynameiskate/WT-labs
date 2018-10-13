package by.bsuir.Akentyeva.Task9.util.entities;

import java.util.LinkedList;
import java.util.List;

public class Basket {
    private List<Ball> ballList;

    public Basket(List<Ball> balls) {
        ballList = new LinkedList<Ball>();

        for(Ball ball: balls) {
            addBall(ball);
        }
    }

    public double getWeight() {
        return ballList.stream()
                .mapToDouble(ball -> ball.getWeight())
                .sum();
    }

    public long getBallCount(Color color) {
        if (color == null) {
            return ballList.size();
        }

        return ballList.stream()
                .filter(ball -> ball.getColor() == color)
                .count();
    }

    public void addBall(Ball ball) {
        ballList.add(ball);
    }

    public void removeBall(int index) {
        ballList.remove(index);
    }

    @Override
    public String toString() {
        String basketStr = "_____________________\r\n";
        basketStr += "Basket:\r\n";
        basketStr += String.format("contents: %d balls\r\n", ballList.size());
        basketStr += String.format("total weight: %f\r\n", getWeight());
        basketStr += String.format("blue balls: %d\r\n", getBallCount(Color.BLUE));
        basketStr += "balls:\r\n";

        if (ballList.size() == 0) {
            basketStr += "none\r\n";
        } else {
            for (Ball ball : ballList) {
                basketStr += ball;
            }
        }

        basketStr += "_____________________\r\n";

        return basketStr;
    }

}
