package nonstandard;

import java.util.concurrent.ThreadLocalRandom;

public class StaticClass {

    static int staticMethod() {
        return ThreadLocalRandom.current()
            .nextInt(0, 10);
    }

}
