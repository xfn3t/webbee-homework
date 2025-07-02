package main.java.ru.pattern.creator;

import main.java.ru.pattern.product.Product;
import main.java.ru.pattern.product.ProductA;

public class CreatorA implements Creator {

  @Override
  public Product factoryMethod() {
    return new ProductA();
  }

}
