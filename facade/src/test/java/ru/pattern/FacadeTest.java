package test.java.ru.pattern;

import main.java.ru.pattern.subsystem.Facade;
import org.junit.Test;

/**
 * Тесты для паттерна Facade.
 */
public final class FacadeTest {

  /**
   * Проверяет выполнение операции фасада.
   */
  @Test
  public void testOperation() {
    new Facade().operation();
  }

}
