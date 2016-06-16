package nonstandard;

public class AClass {

    private boolean flag;

    private AFinalClass finalClass;

    public AClass(final boolean flag) {
        this.flag = flag;
        this.finalClass = new AFinalClass(flag);
    }

    public void method1() {
        final InnerClass inner = new InnerClass();
        if (this.finalClass.evaluateSomething()) {
            inner.method7();
        } else {
            inner.method8();
        }
    }

    public void method2() {
        final int result = StaticClass.staticMethod();
        if (result == 0) {
            method4();
        } else if ((result > 0) && (result <= 5)) {
            method5();
        } else {
            method6();
        }
    }

    public void method3() {
        if (this.flag) {
            method1();
        } else {
            method2();
        }
    }

    private void method4() {
    }

    private void method5() {
    }

    private void method6() {
    }

    private class InnerClass {

        void method7() {
        }

        void method8() {
        }
    }

}
