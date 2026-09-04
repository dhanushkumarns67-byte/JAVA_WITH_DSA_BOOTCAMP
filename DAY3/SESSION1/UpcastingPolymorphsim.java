package DAY3.SESSION1;

class UpcastAnimal {
    void makeSound() {
        System.out.println("Animal makes sound");
    }
}

class UpcastDog extends UpcastAnimal {

    @Override
    void makeSound() {
        System.out.println("Dog barks");
    }

    void skill() {
        System.out.println("Dog is playing with ball");
    }
}

public class UpcastingPolymorphsim {
    public static void main(String[] args) {

        UpcastAnimal a = new UpcastDog();   // Upcasting

        a.makeSound();          // Runtime polymorphism

        UpcastDog d = (UpcastDog) a;       // Downcasting
        d.skill();              // Access Dog's method
    }
}