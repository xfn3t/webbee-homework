import main.java.ru.pattern.creator.Creator;
import main.java.ru.pattern.product.ProductA;
import main.java.ru.pattern.product.ProductB;

/**
 * Паттерн Factory Method позволяет определить интерфейс для создания объектов,
 * делегируя решение о том, какой класс инстанцировать, подклассам.
 *
 * @author xfnet
*/

public class Main {
    public static void main(String[] args) {
        Creator c1 = ProductA::new;
        Creator c2 = ProductB::new;
        c1.operation();
        c2.operation();
    }
}
