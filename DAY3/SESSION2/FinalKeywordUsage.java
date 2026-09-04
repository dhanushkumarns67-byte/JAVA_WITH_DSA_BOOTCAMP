package DAY3.SESSION2;
final class Wallet{
    final int capacity=0;
    final void display(){
        System.out.println(capacity);
    }
}
public class FinalKeywordUsage {
    public static void main(String[] args){
        Wallet w=new Wallet();
        //w.capacity=200;
        w.display();
        System.out.println(w.capacity);
        }
}