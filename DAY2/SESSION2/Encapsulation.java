package DAY2.SESSION2;

import java.util.Scanner;

class Person {
    private int balance;

    // Getter
    public int getBalance() {
        return balance;
    }

    // Setter
    public void setBalance(int balance) {
        this.balance = balance;
    }
}

public class Encapsulation {

    @SuppressWarnings("ConvertToTryWithResources")
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Person p = new Person();

        p.setBalance(1000);

        System.out.println(p.getBalance());

        sc.close();
    }
}