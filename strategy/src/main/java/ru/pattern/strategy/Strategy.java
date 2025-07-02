package main.java.ru.pattern.strategy;

/**
 * Интерфейс стратегии инкапсулирует алгоритм.
 */
public interface Strategy {

    /**
     * Выполняет алгоритм над двумя числами.
     * @param a первый операнд
     * @param b второй операнд
     * @return результат
     */
    int execute(int a, int b);

}
