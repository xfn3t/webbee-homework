package main.java.ru.pattern.decorator;

import main.java.ru.pattern.component.Component;

/**
 * Конкретный декоратор, добавляющий поведение после базового.
 */
public class DecoratorImpl extends Decorator {

    public DecoratorImpl(Component wrappee) {
        super(wrappee);
    }

    @Override
    public void operation() {
        super.operation();
        System.out.println("DecoratorImpl added behavior");
    }

}
