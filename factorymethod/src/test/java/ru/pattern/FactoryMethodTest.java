package test.java.ru.pattern;


import main.java.ru.pattern.creator.CreatorA;
import main.java.ru.pattern.creator.CreatorB;
import main.java.ru.pattern.product.Product;
import main.java.ru.pattern.product.ProductA;
import main.java.ru.pattern.product.ProductB;
import org.junit.Test;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

public class FactoryMethodTest {

  @Test
  public void testProductA() {
    Product product = new CreatorA().factoryMethod();

    assertNotNull(product.toString(), "Product should not be null");
    assertTrue("Should be instance of ProductA", product instanceof ProductA);
  }

  @Test
  public void testProductB() {
    Product product = new CreatorB().factoryMethod();

    assertNotNull(product.toString(), "Product should not be null");
    assertTrue("Should be instance of ProductB", product instanceof ProductB);
  }

  @Test
  public void testOperation() {
    new CreatorA().operation();
    new CreatorB().operation();
  }
}