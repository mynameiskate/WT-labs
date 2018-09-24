package tests;

import org.junit.Test;
import tasks.BasketTask.entities.Ball;
import tasks.BasketTask.entities.Basket;
import tasks.BasketTask.entities.Color;
import java.util.List;
import static org.junit.Assert.assertEquals;

public class BasketTest {
    private double PRECISION = 0.001;

    Basket fullBasket = new Basket(List.of(new Ball(Color.WHITE, 2.5),
            new Ball(Color.BLUE, 1),
            new Ball(Color.BLUE, 0.5),
            new Ball(Color.BLACK, 5)));
    Basket emptyBasket = new Basket(List.of());

    @Test
    public void testBasketWeight() {
        assertEquals(9.0, fullBasket.getWeight(), PRECISION);
        assertEquals(0, emptyBasket.getWeight(), PRECISION);
    }

    @Test
    public void testBallCount() {
        assertEquals(4, fullBasket.getBallCount(null));
        assertEquals(0, emptyBasket.getBallCount(null));
        assertEquals(2, fullBasket.getBallCount(Color.BLUE));
        assertEquals(0, emptyBasket.getBallCount(Color.BLUE));

        fullBasket.removeBall(1);
        assertEquals(1, fullBasket.getBallCount(Color.BLUE));
    }
}
