package test;

import creator.CreatorA;
import creator.CreatorB;
import product.Product;
import product.ProductA;
import product.ProductB;

public class FactoryMethodTest {

    public static void testProductA() {
        Product p = new CreatorA().factoryMethod();
        if (!(p instanceof ProductA))
            throw new AssertionError();

        System.out.println("testProductA passed");
    }

    public static void testProductB() {
        Product p = new CreatorB().factoryMethod();
        if (!(p instanceof ProductB))
            throw new AssertionError();

        System.out.println("testProductB passed");
    }

    public static void testOperation() {
        new CreatorA().operation();
        new CreatorB().operation();
        System.out.println("testOperation passed");
    }

    public static void main(String[] args) {
        testProductA();
        testProductB();
        testOperation();
    }
}
