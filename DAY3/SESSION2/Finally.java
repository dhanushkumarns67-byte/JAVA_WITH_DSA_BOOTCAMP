package DAY3.SESSION2;
public class Finally {
    public static void main(String[] args) {
        try{
            @SuppressWarnings("unused")
            int data=25/0;
        }
        catch(ArithmeticException e){
            System.out.println(e);
        }
        finally{
            System.out.println("finally block is executed");
        }
}
}