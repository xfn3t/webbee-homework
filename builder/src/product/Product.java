package product;

import product.builder.ProductBuilder;

import java.util.Objects;

/**
 * Продукт с двумя обязательными свойствами partA и partB.
 * В стиле Lombok: содержит static builder() и вложенный product.builder.ProductBuilder.
 */
public class Product {

    private final String partA;
    private final String partB;

    // Package-private конструктор (доступен только в своём пакете)
    public Product(String partA, String partB) {
        this.partA = Objects.requireNonNull(partA, "partA must not be null");
        this.partB = Objects.requireNonNull(partB, "partB must not be null");
    }

    public static ProductBuilder builder() {
        return new ProductBuilder();
    }

    // Геттеры и toString
    public String getPartA() { return partA; }
    public String getPartB() { return partB; }

    @Override
    public String toString() {
        return "product.Product{partA='" + partA + "', partB='" + partB + "'}";
    }
}
