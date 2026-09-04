package HomeWork;

public class aggregation {
    static class Address {

    String city;
    String state;

    Address(String city, String state) {
        this.city = city;
        this.state = state;
    }

    void displayAddress() {
        System.out.println("City: " + city);
        System.out.println("State: " + state);
    }
}

static class Student {

    String name;
    int age;
    Address address;   // Aggregation

    Student(String name, int age, Address address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }

    void displayStudent() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);

        address.displayAddress();
    }
}

public class AggregationDemo {

    public static void main(String[] args) {

        // Address object can exist independently
        Address address = new Address("Bangalore", "Karnataka");

        // Student has an Address
        Student student = new Student("Dhanush", 20, address);

        student.displayStudent();
    }
}
    
}
