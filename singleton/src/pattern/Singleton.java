package pattern;

public class Singleton {

    private static final Singleton instance = new Singleton();

    private Singleton() {
        if (instance != null) {
            throw new IllegalStateException("Already initialized");
        }
    }

    public static Singleton getInstance() {
        return instance;
    }
}
