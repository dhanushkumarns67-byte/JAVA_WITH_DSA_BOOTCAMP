package DAY2.SESSION1;

class Student {
    String name;
    int age;

    void display() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}

public class ClassesAndObejects {

    public static void main(String[] args) {

        // Creating an object
        Student s1 = new Student();

        // Assigning values
        s1.name = "Dhanush";
        s1.age = 19;

        // Calling method
        s1.display();
    }
}