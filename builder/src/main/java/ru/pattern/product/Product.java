package main.java.ru.pattern.product;

/**
 * Продукт с двумя обязательными свойствами partA и partB.
 * В стиле Lombok: содержит static builder() и вложенный ProductBuilder.
 */
public final class Product {

  private final String partA;
  private final String partB;

  private Product(ProductBuilder b) {
    this.partA = b.partA;
    this.partB = b.partB;
  }

  /** Точка входа для сборки продукта. */
  public static ProductBuilder builder() {
    return new ProductBuilder();
  }

  public String getPartA() {
    return partA;
  }

  public String getPartB() {
    return partB;
  }

  @Override
  public String toString() {
    return "Product{partA='" + partA + "', partB='" + partB + "'}";
  }

  /**
   * Вложенный билдер.
   */
  public static class ProductBuilder {

    private String partA;
    private String partB;

    /**
     * Устанавливает partA.
     *
     * @param partA значение
     * @return self
     */
    public ProductBuilder partA(String partA) {
      this.partA = partA;
      return this;
    }

    /**
     * Устанавливает partB.
     *
     * @param partB значение
     * @return self
     */
    public ProductBuilder partB(String partB) {
      this.partB = partB;
      return this;
    }

    /**
     * Собирает продукт, проверяя обязательность полей.
     *
     * @return готовый Product
     * @throws IllegalStateException если поля не заданы
     */
    public Product build() {
      if (partA == null || partB == null) {
        throw new IllegalStateException("both partA and partB must be set");
      }
      return new Product(this);
    }

  }

}
