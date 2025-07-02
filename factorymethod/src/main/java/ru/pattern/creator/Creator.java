package main.java.ru.pattern.creator;

import main.java.ru.pattern.product.Product;

/**
 * Интерфейс фабрики. Метод {@code factoryMethod()}
 * возвращает конкретный продукт, а default-метод
 * {@code operation()} демонстрирует шаблон.
 */
public interface Creator {

  Product factoryMethod();

  /**
   * Демонстрационный метод, использующий продукт.
   */
  default void operation() {
    Product p = factoryMethod();
    p.use();
  }

}
