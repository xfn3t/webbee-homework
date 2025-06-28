package subsystem;

/**
 * Фасад упрощает использование нескольких подсистем
 * через единый метод operation().
 */
public class Facade {

    private final SubsystemA a = new SubsystemA();
    private final SubsystemB b = new SubsystemB();

    public void operation() {
        a.opA();
        b.opB();
    }
}
