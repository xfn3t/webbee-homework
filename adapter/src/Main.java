import main.java.ru.pattern.adapter.Adapter;
import main.java.ru.pattern.newRel.NewInterface;
import main.java.ru.pattern.old.OldClass;

public class Main {
    public static void main(String[] args) {
        NewInterface ni = new Adapter(new OldClass());
        System.out.println(ni.newRequest());
    }
}