package main.java.ru.pattern;

import main.java.ru.pattern.product.Product;

/**
 * Паттерн Builder разделяет создание сложного объекта
 * и его представление, позволяя задавать параметры шаг за шагом.
 *
 * @author xfnet
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
    Product p = Product.builder()
        .partA("Alpha")
        .partB("Beta")
        .build();
    System.out.println(p);
  }

}
