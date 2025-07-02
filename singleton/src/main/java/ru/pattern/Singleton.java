package main.java.ru.pattern;

/**
 * Реализация паттерна Singleton с защитой от:
 * - Многопоточности (через статическую инициализацию)
 * - Рефлексии (проверка в конструкторе)
 */
public final class Singleton {

    private static final Singleton INSTANCE = new Singleton();

    private Singleton() {
        if (INSTANCE != null) {
            throw new IllegalStateException("Already initialized");
        }
    }

    /**
     * Возвращает единственный экземпляр класса.
     *
     * @return экземпляр Singleton
     */
    public static Singleton getInstance() {
        return INSTANCE;
    }

}
