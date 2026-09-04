package DAY4.SESSION3;

@FunctionalInterface
interface NoParameterGreet{
    void sayHello();
}

public class NoParameterLambda {

    public static void main(String[] args) {
        NoParameterGreet g=()->System.out.println("Hello");//g instance og greet interface
        g.sayHello();
    }
}