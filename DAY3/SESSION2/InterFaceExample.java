package DAY3.SESSION2;

interface Animal {

    int NUM = 10; 
    default void eat() {
        System.out.println("Animal is eating");
    }
    void sleep();
}

class Monkey implements Animal {
    
    @Override
    public void eat() {
        System.out.println("Monkey is eating bananas");
    }
    
    @Override
    public void sleep() {
        System.out.println("Monkey is sleeping on trees");
    }
}

public class InterFaceExample {
    public static void main(String[] args) {
        Animal animal = new Monkey();
        animal.eat();
        animal.sleep();
    }
}
