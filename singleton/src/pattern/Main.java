package pattern;

public class Main {
    public static void main(String[] args) {
        Singleton s1 = Singleton.getInstance();
        Singleton s2 = Singleton.getInstance();
        System.out.println(s1 == s2
                ? "pattern.Singleton works: same instance"
                : "pattern.Singleton failed");
    }
}