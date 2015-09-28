package example;

import static org.junit.Assert.assertTrue;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mockito;
import org.powermock.api.mockito.PowerMockito;
import org.powermock.core.classloader.annotations.PrepareOnlyThisForTest;
import org.powermock.modules.junit4.PowerMockRunner;

@RunWith(PowerMockRunner.class)
@PrepareOnlyThisForTest({
    AFinalClass.class,
    StaticClass.class
})
public class AClassTest {

    private AFinalClass finalClass = PowerMockito.mock(AFinalClass.class);

    @InjectMocks
    private AClass sut = new AClass(true);

    @Test
    public void example() {
        this.sut.method3();
        assertTrue(true);
    }

    @Test
    public void exampleWithPowerMockStaticReturns0() {
        PowerMockito.mockStatic(StaticClass.class);
        Mockito.when(StaticClass.staticMethod())
            .thenReturn(0);
        this.sut.method2();
        PowerMockito.verifyStatic();
        StaticClass.staticMethod();
    }

    @Test
    public void exampleWithPowerMockStaticReturns4() {
        PowerMockito.mockStatic(StaticClass.class);
        Mockito.when(StaticClass.staticMethod())
            .thenReturn(4);
        this.sut.method2();
        PowerMockito.verifyStatic();
        StaticClass.staticMethod();
    }

    @Test
    public void exampleWithPowerMockStaticReturns8() {
        PowerMockito.mockStatic(StaticClass.class);
        Mockito.when(StaticClass.staticMethod())
            .thenReturn(8);
        this.sut.method2();
        PowerMockito.verifyStatic();
        StaticClass.staticMethod();
    }

    @Test
    public void exampleWithPowerFinalTrue() {
        Mockito.when(this.finalClass.evaluateSomething())
            .thenReturn(true);
        this.sut.method1();
        Mockito.verify(this.finalClass, Mockito.times(1))
            .evaluateSomething();
    }

    @Test
    public void exampleWithPowerFinalFalse() {
        Mockito.when(this.finalClass.evaluateSomething())
            .thenReturn(false);
        this.sut.method1();
        Mockito.verify(this.finalClass, Mockito.times(1))
            .evaluateSomething();
    }
}
