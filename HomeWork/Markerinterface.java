package HomeWork;
public class Markerinterface {
    interface Student {
    // Empty interface
}

static class Person implements Student {

    void display() {
        System.out.println("Person is a student.");
    }
}

public class MarkerInterfaceDemo {
    public static void main(String[] args) {

        Person p = new Person();

        if (p instanceof Student) {
            System.out.println("Student marker detected.");
            p.display();
        }
    }
}
}
