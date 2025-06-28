package product.builder;

import product.Product;

/**
 * Вложенный билдер, повторяет поведение Lombok.
 */
public final class ProductBuilder {
    private String partA;
    private String partB;

    public ProductBuilder partA(String partA) {
        this.partA = partA;
        return this;
    }

    public ProductBuilder partB(String partB) {
        this.partB = partB;
        return this;
    }

    public Product build() {
        // Проверка обязательных полей перед созданием объекта
        if (partA == null) {
            throw new IllegalStateException("partA must be set");
        }
        if (partB == null) {
            throw new IllegalStateException("partB must be set");
        }
        return new Product(partA, partB);
    }
}