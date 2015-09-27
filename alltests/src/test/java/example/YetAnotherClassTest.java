package example;

import static org.junit.Assert.assertTrue;
import org.junit.Test;
import example.YetAnotherClass;

public class YetAnotherClassTest {

    @Test
    public void test() {
        final YetAnotherClass aclass = new YetAnotherClass();
        aclass.method3(true);
        assertTrue(true);
    }

}
