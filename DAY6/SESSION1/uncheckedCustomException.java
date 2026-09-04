package DAY6.SESSION1;
class InvalidScoreException extends RuntimeException{
    public InvalidScoreException(String message){
        super(message);
    }
}
public class uncheckedCustomException {
    public static void marksCheck(int marks){
        if(marks<0 || marks>100){
            throw new InvalidScoreException("Invalid marks");
        }
    }
    public static void main(String[] args) {
        try{
            marksCheck(150);
        }catch(InvalidScoreException e){
            System.out.println("Exception"+ e.getMessage());
        }
        System.out.println("Program continues...");
    }
}
