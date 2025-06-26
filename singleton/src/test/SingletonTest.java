package test;

import pattern.Singleton;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class SingletonTest {


    /**
     * Проверяет, что экземпляр Singleton не null.
     */
    public static void testNotNull() {
        assert Singleton.getInstance() != null : "Instance is null";
        System.out.println("testNotNull passed");
    }

    /**
     * Проверяет потокобезопасность Singleton.
     * Создает 1000 потоков и убеждается, что все получают один экземпляр.
     *
     * @throws InterruptedException при прерывании работы потоков
     */
    public static void testThreadSafety() throws InterruptedException {

        final int THREAD_COUNT = 1000;
        final Singleton[] instances = new Singleton[THREAD_COUNT];
        Thread[] threads = new Thread[THREAD_COUNT];

        for (int i = 0; i < THREAD_COUNT; i++) {
            final int index = i;
            threads[i] = new Thread(() -> {
                instances[index] = Singleton.getInstance();
            });
            threads[i].start();
        }

        for (Thread thread : threads) {
            thread.join();
        }

        Singleton first = instances[0];
        for (int i = 1; i < THREAD_COUNT; i++) {
            if (instances[i] != first) {
                throw new AssertionError("Multiple instances detected in thread " + i);
            }
        }
        System.out.println("testThreadSafety passed with " + THREAD_COUNT + " threads");
    }

    /**
     * Проверяет защиту от создания экземпляра через Reflection API.
     * Убеждается, что конструктор бросает исключение при рефлексивном вызове.
     */
    public static void testReflectionProtection() {
        try {
            Constructor<Singleton> constructor = Singleton.class.getDeclaredConstructor();
            constructor.setAccessible(true);
            constructor.newInstance();

            throw new AssertionError("Reflection attack succeeded! Created second instance");

        } catch (InvocationTargetException e) {

            Throwable cause = e.getCause();

            if (cause instanceof IllegalStateException) {
                String message = cause.getMessage();
                if (message != null && message.contains("initialized")) {
                    System.out.println("testReflectionProtection passed");
                    return;
                }
            }

            throw new AssertionError("Unexpected exception type: " + cause.getClass().getName(), cause);
        } catch (Exception e) {
            throw new AssertionError("Unexpected exception: " + e.getClass().getName(), e);
        }
    }

    public static void main(String[] args) throws InterruptedException {
        testNotNull();
        testThreadSafety();
        testReflectionProtection();
        System.out.println("All tests passed successfully");
    }
}