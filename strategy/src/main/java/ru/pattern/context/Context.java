package main.java.ru.pattern.context;

import main.java.ru.pattern.strategy.Strategy;

/**
 * Контекст позволяет менять стратегию во время выполнения.
 */
public class Context {

    private final Strategy strategy;

    public Context(Strategy strategy) {
        this.strategy = strategy;
    }

    /**
     * Выполняет текущую стратегию.
     * @param a первый операнд
     * @param b второй операнд
     * @return результат
     */
    public int execute(int a, int b) {
        return strategy.execute(a, b);
    }

}
