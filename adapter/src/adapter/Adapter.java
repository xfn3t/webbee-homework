package adapter;

import newRel.NewInterface;
import old.OldInterface;

/**
 * Адаптер, позволяет использовать old.OldInterface
 * через newRel.NewInterface.
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