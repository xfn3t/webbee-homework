package decorator;

import component.Component;

/**
 * Абстрактный декоратор, делегирующий вызов обернутому компоненту.
 */
public abstract class Decorator implements Component {

    protected final Component wrappee;
    public Decorator(Component wrappee) { this.wrappee = wrappee; }

    @Override
    public void operation() {
        wrappee.operation();
    }
}