package HomeWork;

public class interfacewithoutextendedkeyword {
    static interface Animal {

    // Default method
    default void eat() {
        System.out.println("Animal is eating.");
    }
}

static class Dog implements Animal {

    void bark() {
        System.out.println("Dog is barking.");
    }
}

public class InheritanceWithoutExtends {

    public static void main(String[] args) {

        Dog d = new Dog();

        // Method obtained from the interface
        d.eat();

        // Dog's own method
        d.bark();
    }
}
} 