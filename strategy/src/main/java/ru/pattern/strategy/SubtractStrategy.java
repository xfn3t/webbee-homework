package main.java.ru.pattern.strategy;

/**
 * Стратегия вычитания.
 */
public class SubtractStrategy implements Strategy {

    @Override
    public int execute(int a, int b) {
        return a - b;
    }

}
