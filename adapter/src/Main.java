import adapter.Adapter;
import newRel.NewInterface;
import old.OldClass;

public class Main {
    public static void main(String[] args) {
        NewInterface ni = new Adapter(new OldClass());
        System.out.println(ni.newRequest());
    }
}