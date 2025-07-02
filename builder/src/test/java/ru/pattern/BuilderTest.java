package test.java.ru.pattern;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import main.java.ru.pattern.product.Product;
import org.junit.jupiter.api.Test;

public final class BuilderTest {

  @Test
  public void testSuccess() {
    Product p = Product.builder()
            .partA("X")
            .partB("Y")
            .build();

    assertEquals("X", p.getPartA());
    assertEquals("Y", p.getPartB());
  }

  @Test
  public void testNoA() {
    assertThrows(IllegalStateException.class,
            () -> Product.builder().partB("Y").build()
    );
  }

  @Test
  public void testNoB() {
    assertThrows(IllegalStateException.class,
            () -> Product.builder().partA("X").build()
    );
  }

  @Test
  public void testExceptionMessage() {
    Exception exception = assertThrows(IllegalStateException.class,
            () -> Product.builder().partA("X").build()
    );

    assertEquals("both partA and partB must be set", exception.getMessage());
  }

}
