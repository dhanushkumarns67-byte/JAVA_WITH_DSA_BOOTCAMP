package DAY3.SESSION2;

abstract class Bank{
    String name;
    double balance;
    public Bank(String name,double balance){
        this.name=name;
        this.balance=balance;
    }
    //abstract method
    abstract void display();
    //concrete method
    void deposit(double amount){
        balance+=amount;
        System.out.println(name + "|" + balance);
    }
}
class savings extends Bank{
    public savings(String name,double balance){
        super(name,balance);
    }
    @Override
    void display(){
        System.out.println(balance);
    }
}

public class AbstractClassExample {
    public static void main(String[] args){
        //Bank b=new Bank();
        Bank b=new savings("Dhanush",10000);
        b.display();
        b.deposit(1000);
    }
}