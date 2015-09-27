package example;

import static org.junit.Assert.assertTrue;
import org.junit.Test;
import example.AnotherCoolClass;

public class AnotherCoolClassIT {

    @Test
    public void test() {
        final AnotherCoolClass aclass = new AnotherCoolClass();
        aclass.method4();
        assertTrue(true);
    }

}
