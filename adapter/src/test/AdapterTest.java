package test;

import adapter.Adapter;
import newRel.NewInterface;
import old.OldClass;

public class AdapterTest {

    public static void testBasic() {
        if (!new Adapter(new OldClass()).newRequest().equals("Old behavior"))
            throw new AssertionError();

        System.out.println("testBasic passed");
    }

    public static void testIntegration() {
        NewInterface ni = new Adapter(new OldClass());
        if (!ni.newRequest().contains("Old"))
            throw new AssertionError();

        System.out.println("testIntegration passed");
    }

    public static void main(String[] args) {
        testBasic();
        testIntegration();
    }
}