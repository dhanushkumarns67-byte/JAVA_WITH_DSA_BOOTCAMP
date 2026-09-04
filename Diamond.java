public class Diamond {
interface A {
    default void show() {
        System.out.println("A");
    }
}

interface B extends A {
    @Override
    default void show() {
        System.out.println("B");
    }
}

interface C extends A {
    @Override
    default void show() {
        System.out.println("C");
    }
}

static class D implements B, C {

    @Override
    public void show() {
        B.super.show();
        C.super.show();
    }
}

public static class Main {
    public static void main(String[] args) {
        D obj = new D();
        obj.show();
    }
}
}
