package HomeWork;

public class Functionalinterfaceusinglambda {
    @FunctionalInterface
interface Calculator {

    int add(int a, int b);
}

public class FunctionalInterfaceDemo {

    public static void main(String[] args) {

        // Lambda expression
        Calculator c = (a, b) -> a + b;

        // Calling the method
        int result = c.add(10, 20);

        System.out.println("Sum = " + result);
    }
}
}
