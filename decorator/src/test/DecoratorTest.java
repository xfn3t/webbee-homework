package test;

import component.ComponentImpl;
import decorator.DecoratorImpl;

/**
 * Тесты для Decorator.
 */
public class DecoratorTest {
    public static void testBase() {
        new ComponentImpl().operation();
        System.out.println("testBase passed");
    }

    public static void testDecorated() {
        new DecoratorImpl(new ComponentImpl()).operation();
        System.out.println("testDecorated passed");
    }

    public static void main(String[] args) {
        testBase();
        testDecorated();
    }
}