package DAY4.SESSION3;

@FunctionalInterface
interface SingleParameterGreet{
    void sayHello(String Hello);
}

public class SingleParameterLambda {
    public static void main(String[] args) {
        SingleParameterGreet g=(name)->System.out.println("Hello, " + name);
        g.sayHello("Dhanush");
    }
}
