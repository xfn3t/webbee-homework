package main.java.ru.pattern.subsystem;

/**
 * Фасад упрощает использование нескольких подсистем
 * через единый метод operation().
 *
 * @author xfnet
 */
public class Facade {

    private final SubsystemA a = new SubsystemA();
    private final SubsystemB b = new SubsystemB();

    public void operation() {
        a.opA();
        b.opB();
    }

}
