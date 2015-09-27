package example;

public class AnotherCoolClass {

    private boolean flag;

    public void method1() {
    }

    public void method2() {
    }

    public void method3() {
        if (this.flag) {
            method1();
        } else {
            method2();
        }
    }

    public void method4() {
    }

    class InnerClass {

        void method5() {
        }
    }

}
