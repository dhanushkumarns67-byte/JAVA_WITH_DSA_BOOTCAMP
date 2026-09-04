package DAY2.SESSION2;

class GetterSetterPerson {
    private int balance;

    public GetterSetterPerson() {
        this.balance = 0;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        if (balance >= 0) {
            this.balance = balance;
        } else {
            System.out.println("Error: Balance cannot be negative!");
        }
    }
}

public class GettersAndSetters {

    public static void main(String[] args) {

        GetterSetterPerson p = new GetterSetterPerson();

        p.setBalance(1000);

        System.out.println(p.getBalance());
    }
}