package DAY4.SESSION2;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;
//List
//Interface which stores ordered collection of element but Dynamic
//Allows duplicate,null
//index starts from 0
public class SetExample {
    public static void main(String[] args){
        @SuppressWarnings("unused")
        List<String>names2= new LinkedList<>();
        List<String>names =new ArrayList<>();
        @SuppressWarnings("unused")
        List<Integer>stack=new Stack<>();
        names.add("Dhanush");
        names.add("Dhanush");
        names.add("Dhruv");
        names.add("Dacchu");
        names.add("Jashwanth");
        names.add("Bob");
        System.out.println(names);
        System.out.println(names.get(1));
      //Update
        System.out.println(names.set(1,"Ram"));
        System.out.println(names.remove(2));
for (   @SuppressWarnings("unused")
String name : names) {
        System.out.println(names);
}

    }
    }
// get
// remove
// set
// contains
// size()
// isempty