package component;

/**
 * Базовая реализация component.Component.
 */
public class ComponentImpl implements Component {
    @Override
    public void operation() {
        System.out.println("component.ComponentImpl operation");
    }
}