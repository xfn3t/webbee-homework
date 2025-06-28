package test;

import strategy.AddStrategy;
import strategy.SubtractStrategy;

/**
 * Тесты для strategy.Strategy.
 */
public class StrategyTest {
    public static void testAdd() {
        assert new AddStrategy().execute(2, 3) == 5;
        System.out.println("testAdd passed");
    }

    public static void testSubtract() {
        assert new SubtractStrategy().execute(5, 2) == 3;
        System.out.println("testSubtract passed");
    }

    public static void main(String[] args) {
        testAdd();
        testSubtract();
    }
}