package creator;

import product.Product;
import product.ProductA;

public class CreatorA implements Creator {
    @Override
    public Product factoryMethod() {
        return new ProductA();
    }
}
