package HomeWork;

public class Lambdaexpression {
    
    interface Greeting {
    void sayHello();
}

public class LambdaDemo {

    public static void main(String[] args) {

        Greeting g = () -> System.out.println("Hello Java!");

        g.sayHello();
    }
}
}
