package DAY6.SESSION1;

public class UncheckedException2 {
    public static void main(String[] args) {
        try {
            int number = Integer.parseInt("abc");
            System.out.println(number);
        } catch (NumberFormatException e) {
            System.out.println("Invalid number");
        }
    }
    
}
