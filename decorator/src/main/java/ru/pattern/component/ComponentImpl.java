package main.java.ru.pattern.component;

/**
 * Базовая реализация mComponent.
 */
public class ComponentImpl implements Component {

    @Override
    public void operation() {
        System.out.println("ComponentImpl operation");
    }

}
