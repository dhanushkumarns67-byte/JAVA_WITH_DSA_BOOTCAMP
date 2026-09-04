package DAY3.SESSION1;

class OverloadedStudent{
    int id;
    String name;
    float marks;
    OverloadedStudent(int id,String name,float marks){
        this.id = id;
        this.name = name;
        this.marks = marks;
    }
}
public class ConstructorOverloading {
    
    public static void main(String[] args) {
        OverloadedStudent s1 = new OverloadedStudent(1,"Dhruv",85.5f);
        OverloadedStudent s2 = new OverloadedStudent(2,"Daachu",90.0f);
        System.out.println("Student 1: ID=" + s1.id + ", Name=" + s1.name + ", Marks=" + s1.marks);
        System.out.println("Student 2: ID=" + s2.id + ", Name=" + s2.name + ", Marks=" + s2.marks);
    } 
}