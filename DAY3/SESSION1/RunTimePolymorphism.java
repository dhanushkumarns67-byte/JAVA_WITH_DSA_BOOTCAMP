package DAY3.SESSION1;

class Animal{
    void makeSound(){
        System.out.println("Animal makes sound");

    }
}
//child class
class Dog extends Animal{
        @Override
    void makeSound(){
        System.out.println("Dog barks");
    }
}
class Cat extends Animal{
    @Override
    void makeSound(){
        System.out.println("Cat meows");
    }
}
class elephant extends Animal{
    @Override
    void makeSound(){
        System.out.println("Elephant trumpets");
    }
}

public class RunTimePolymorphism {
    public static void main(String[] args) {
        Animal a;
        a = new Dog();
        a.makeSound();
        a = new Cat();
        a.makeSound();
        a = new elephant();
        a.makeSound();
    }
    
}