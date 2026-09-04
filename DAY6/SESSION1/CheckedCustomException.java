package DAY6.SESSION1;

class InvalidAgException extends Exception{
    public InvalidAgException(String message){
        super(message);
    }
}
public class CheckedCustomException {
    static void CustomRegister(int age) throws InvalidAgException{
        if (age<18){
            throw new InvalidAgException("not eligible for licence");
        }
    }

    public static void main(String[] args) {
        try {
            CustomRegister(21);
        } catch (InvalidAgException e) {
            System.out.println("Exception :"+ e.getMessage());
        }
        System.out.println("go to next page");
    }
    
}
