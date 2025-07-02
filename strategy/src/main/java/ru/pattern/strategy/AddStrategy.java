package main.java.ru.pattern.strategy;

/**
 * Стратегия сложения.
 */
public class AddStrategy implements Strategy {

    @Override
    public int execute(int a, int b) {
        return a + b;
    }

}
