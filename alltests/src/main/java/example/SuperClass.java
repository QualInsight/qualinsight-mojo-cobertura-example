package example;

public abstract class SuperClass {

    public abstract void method1();

    public abstract void method2();

    public void method3(final boolean flag) {
        if (flag) {
            method1();
        } else {
            method2();
        }
    }

}
