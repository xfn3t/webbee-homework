package creator;

import product.Product;
import product.ProductB;

public class CreatorB implements Creator {
    @Override
    public Product factoryMethod() {
        return new ProductB();
    }
}
