package main.java.ru.pattern;

/**
 * Демонстрация работы паттерна Singleton.
 */
public final class Main {

    private Main() {
    }

    /**
     * Точка входа в приложение.
     *
     * @param args аргументы командной строки
     */
    public static void main(String[] args) {
        Singleton s1 = Singleton.getInstance();
        Singleton s2 = Singleton.getInstance();

        if (s1 == s2) {
            System.out.println("Singleton works: same instance");
        } else {
            System.out.println("Singleton failed");
        }
    }

}
