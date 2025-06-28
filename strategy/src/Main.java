import context.Context;
import strategy.AddStrategy;
import strategy.SubtractStrategy;

/**
 * Паттерн strategy.Strategy позволяет выбирать алгоритм на лету,
 * не меняя клиентский код.
 */
public class Main {
    public static void main(String[] args) {
        Context c1 = new Context(new AddStrategy());
        Context c2 = new Context(new SubtractStrategy());
        System.out.println("5 + 3 = " + c1.execute(5, 3));
        System.out.println("5 - 3 = " + c2.execute(5, 3));
    }
}