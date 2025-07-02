package main.java.ru.pattern.adapter;

import main.java.ru.pattern.newRel.NewInterface;
import main.java.ru.pattern.old.OldInterface;

/**
 * Адаптер, позволяет использовать OldInterface
 * через NewInterface.
 */
public class Adapter implements NewInterface {

    private final OldInterface adaptee;

    public Adapter(OldInterface adaptee) {
        this.adaptee = adaptee;
    }

    @Override
    public String newRequest() {
        return adaptee.oldRequest();
    }

}
