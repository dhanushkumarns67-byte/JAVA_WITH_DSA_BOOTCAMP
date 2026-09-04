package DAY3.SESSION1;

class Student {

    String name;
    int age;
    String course;

    // Parameterized constructor
    public Student(String name, int age, String course) {
        this.name = name;
        this.age = age;
        this.course = course;
    }

    // No-argument constructor
    public Student() {
        this("Dhanush Kumar NS", 22, "Java");
    }

    void view() {
        System.out.println(name + " " + age + " " + course);
    }
}

// Child class
class Child extends Student {

    public Child() {
        super("Jashwanth", 22, "Java");
    }
}

// Main class
public class ConstructorChaining {

    public static void main(String[] args) {

        Student s1 = new Student();
        s1.view();

        Student s2 = new Child();
        s2.view();
    }
}