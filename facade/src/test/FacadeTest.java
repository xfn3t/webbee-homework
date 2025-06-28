package test;

import subsystem.Facade;

public class FacadeTest {
    public static void testOperation() {
        new Facade().operation();
        System.out.println("testOperation passed");
    }

    public static void main(String[] args) {
        testOperation();
    }
}
