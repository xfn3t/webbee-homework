import product.Product;

/**
 * Паттерн Builder разделяет создание сложного объекта
 * и его представление, позволяя задавать параметры шаг за шагом.
 */
public class Main {
    public static void main(String[] args) {
        Product p = Product.builder()
                .partA("Alpha")
                .partB("Beta")
                .build();
        System.out.println(p);
    }
}