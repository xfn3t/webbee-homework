package main.java.ru.pattern.creator;

import main.java.ru.pattern.product.Product;
import main.java.ru.pattern.product.ProductB;

public class CreatorB implements Creator {

    @Override
    public Product factoryMethod() {
        return new ProductB();
    }

}
