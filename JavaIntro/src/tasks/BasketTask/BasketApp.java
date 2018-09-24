package tasks.BasketTask;

import tasks.BasketTask.entities.Ball;
import tasks.BasketTask.entities.Basket;
import tasks.BasketTask.entities.Color;

import java.util.List;

public class BasketApp {
    public static void main(String[] args) {
        Basket basketBallBasket = new Basket(List.of(new Ball(Color.ORANGE, 0.65),
                new Ball(Color.ORANGE, 0.55),
                new Ball(Color.ORANGE, 0.57),
                new Ball(Color.ORANGE, 0.4)));

        Basket frenchBasket = new Basket(List.of(new Ball(Color.BLUE, 1),
                new Ball(Color.WHITE, 1.5),
                new Ball(Color.RED, 0.4)));

        System.out.println(basketBallBasket);
        System.out.println(frenchBasket);
    }
}
