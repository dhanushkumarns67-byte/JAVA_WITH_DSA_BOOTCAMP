package HomeWork;

@FunctionalInterface
interface BlockOperation {
    int calculate(int a, int b);
}

public class BlockedLambda {
    public static void main(String[] args) {

        BlockOperation obj = (a, b) -> {
            int result = a * b;
            System.out.println("Multiplication is:");
            return result;
        };

        System.out.println(obj.calculate(10, 5));
    }
}