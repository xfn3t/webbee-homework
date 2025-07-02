package test.java.ru.pattern;

import main.java.ru.pattern.component.Component;
import main.java.ru.pattern.component.ComponentImpl;
import main.java.ru.pattern.decorator.DecoratorImpl;
import org.junit.Test;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import static org.junit.Assert.assertEquals;

/**
 * Тесты для паттерна Decorator.
 */
public final class DecoratorTest {

    /**
     * Проверяет базовую операцию компонента.
     */
    @Test
    public void testBaseComponentOperation() {

        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        PrintStream originalOut = System.out;
        System.setOut(new PrintStream(outContent));

        new ComponentImpl().operation();

        System.setOut(originalOut);
        assertEquals("ComponentImpl operation\n", outContent.toString().replace("\r\n", "\n"));
    }

    /**
     * Проверяет операцию декорированного компонента.
     */
    @Test
    public void testDecoratedComponentOperation() {

        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        PrintStream originalOut = System.out;
        System.setOut(new PrintStream(outContent));

        Component component = new ComponentImpl();
        new DecoratorImpl(component).operation();

        System.setOut(originalOut);
        String expectedOutput = """
                ComponentImpl operation
                DecoratorImpl added behavior
                """;

        assertEquals(expectedOutput, outContent.toString().replace("\r\n", "\n"));
    }
}