package old;

/** Конкретная старая реализация. */
public class OldClass implements OldInterface {
    @Override
    public String oldRequest() {
        return "Old behavior";
    }
}