import component.Component;
import component.ComponentImpl;
import decorator.DecoratorImpl;

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