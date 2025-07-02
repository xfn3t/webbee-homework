package test.java.ru.pattern;

import main.java.ru.pattern.Singleton;
import org.junit.Test;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

import static org.junit.Assert.*;

/**
 * Тесты для Singleton.
 */
public final class SingletonTest {

    /**
     * Проверяет, что экземпляр Singleton не null.
     */
    @Test
    public void testNotNull() {
        Singleton instance = Singleton.getInstance();
        assertNotNull("Instance should not be null", instance);
    }

    /**
     * Проверяет потокобезопасность Singleton.
     * Создает 1000 потоков и убеждается, что все получают один экземпляр.
     *
     * @throws InterruptedException при прерывании работы потоков
     */
    @Test
    public void testThreadSafety() throws InterruptedException {
        final int threadCount = 1000;
        final Singleton[] instances = new Singleton[threadCount];
        Thread[] threads = new Thread[threadCount];

        for (int i = 0; i < threadCount; i++) {
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
        for (int i = 1; i < threadCount; i++) {
            assertSame(
                    "All threads should get the same instance",
                    first,
                    instances[i]
            );
        }
    }

    /**
     * Проверяет защиту от создания экземпляра через Reflection API.
     * Убеждается, что конструктор бросает исключение при рефлексивном вызове.
     */
    @Test
    public void testReflectionProtection() {
        try {
            Constructor<Singleton> constructor =
                    Singleton.class.getDeclaredConstructor();
            constructor.setAccessible(true);
            constructor.newInstance();

            fail("Expected exception for reflection attack");

        } catch (InvocationTargetException e) {
            Throwable cause = e.getCause();
            if (!(cause instanceof IllegalStateException)) {
                fail("Expected IllegalStateException but got: " + cause.getClass());
            }
            String message = cause.getMessage();
            if (message == null || !message.contains("initialized")) {
                fail("Unexpected exception message: " + message);
            }
        } catch (Exception e) {
            fail("Unexpected exception: " + e.getClass().getName());
        }
    }
}