package example;

import static org.junit.Assert.assertTrue;
import org.junit.Test;
import example.AClass;

public class AClassTest {

    @Test
    public void example() {
        final AClass aclass = new AClass();
        aclass.method3();
        assertTrue(true);
    }

}
