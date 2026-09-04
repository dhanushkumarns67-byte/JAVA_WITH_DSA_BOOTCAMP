package DAY3.SESSION1;

class Animal2 {
    void makeSound() {
        System.out.println("Animal makes sound");
    }
}

class Dog2 extends Animal2 {

    @Override
    void makeSound() {
        System.out.println("Dog2 barks");
    }

    void skill() {
        System.out.println("Dog2 is playing with ball");
    }
}

public class DownCastingPolymorphism {
    public static void main(String[] args) {

        Animal2 a = new Dog2();

        Dog2 d = (Dog2) a;

        d.makeSound();
        d.skill();
    }
}