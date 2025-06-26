import creator.Creator;
import product.ProductA;
import product.ProductB;

public class Main {
    public static void main(String[] args) {
        Creator c1 = ProductA::new;
        Creator c2 = ProductB::new;
        c1.operation();
        c2.operation();
    }
}