package test.java.ru.pattern;

import main.java.ru.pattern.strategy.AddStrategy;
import main.java.ru.pattern.strategy.SubtractStrategy;
import org.junit.Test;
import static org.junit.Assert.assertEquals;


/**
 * Тесты для strategy.Strategy.
 */
public class StrategyTest {

    @Test
    public void testAdd() {
        int result = new AddStrategy().execute(2, 3);
        assertEquals(5, result);
    }

    @Test
    public void testSubtract() {
        int result = new SubtractStrategy().execute(5, 2);
        assertEquals(3, result);
    }
}