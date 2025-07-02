import main.java.ru.pattern.component.Component;
import main.java.ru.pattern.component.ComponentImpl;
import main.java.ru.pattern.decorator.DecoratorImpl;

/**
 * Паттерн Decorator динамически добавляет объектам
 * новые обязанности, оборачивая их в декораторы.
 */
public class Main {
    public static void main(String[] args) {
        Component c = new DecoratorImpl(new ComponentImpl());
        c.operation();
    }
}