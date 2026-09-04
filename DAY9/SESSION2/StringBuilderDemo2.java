package DAY9.SESSION2;

public class StringBuilderDemo2 {
    public static void main(String[] args) {
        StringBuilder s1 = new StringBuilder("Dhanush");
        System.out.println("before change:" + s1);
        s1.replace(0, s1.length(), "Kumar");
        System.out.println("after replacement:" + s1);
    }
}