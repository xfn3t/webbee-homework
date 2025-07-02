package test.java.ru.pattern;

import main.java.ru.pattern.adapter.Adapter;
import main.java.ru.pattern.old.OldClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class AdapterTest {

    @Test
    public void testBasic() {
        assertEquals("Old behavior", new Adapter(new OldClass()).newRequest());
    }

    @Test
    public void testIntegration() {
        assertTrue(new Adapter(new OldClass()).newRequest().contains("Old"));
    }
}