package test;

import product.Product;

/**
 * Тесты для Builder.
 */
public class BuilderTest {
    public static void testSuccess() {
        Product p = Product.builder().partA("X").partB("Y").build();
        assert "X".equals(p.getPartA()) && "Y".equals(p.getPartB());
        System.out.println("testSuccess passed");
    }

    public static void testNoA() {
        try {
            Product.builder().partB("Y").build();
            throw new AssertionError("Expected exception for missing partA");
        } catch (IllegalStateException e) {
            System.out.println("testNoA passed");
        }
    }

    public static void testNoB() {
        try {
            Product.builder().partA("X").build();
            throw new AssertionError("Expected exception for missing partB");
        } catch (IllegalStateException e) {
            System.out.println("testNoB passed");
        }
    }

    public static void main(String[] args) {
        testSuccess();
        testNoA();
        testNoB();
    }
}
