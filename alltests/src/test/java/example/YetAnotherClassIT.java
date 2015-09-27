package example;

import static org.junit.Assert.assertTrue;
import org.junit.Test;
import example.YetAnotherClass;

public class YetAnotherClassIT {

    @Test
    public void test() {
        final YetAnotherClass aclass = new YetAnotherClass();
        aclass.method4();
        aclass.method3(false);
        assertTrue(true);
    }

}
