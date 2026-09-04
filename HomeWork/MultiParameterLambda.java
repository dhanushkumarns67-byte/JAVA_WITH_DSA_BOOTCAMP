package HomeWork;

@FunctionalInterface
interface Addition {
    int add(int a, int b);
}

public class MultiParameterLambda {
    public static void main(String[] args) {

        Addition obj = (a, b) -> {
            return a + b;
        };

        System.out.println("Result: " + obj.add(10, 20));
    }
}