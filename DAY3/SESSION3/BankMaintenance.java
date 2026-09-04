package DAY3.SESSION3;
import java.util.Scanner;

class Account {
    String name, number, startDate;
    float balance;

    Account(String name, String number, float balance, String startDate) {
        this.name = name;
        this.number = number;
        this.balance = balance;
        this.startDate = startDate;
    }
}

interface MaintenanceCharge {
    float computeMaintenanceCharge(int n);
}

class CurrentAccount extends Account implements MaintenanceCharge {
    CurrentAccount(String n, String no, float b, String d) {
        super(n, no, b, d);
    }

    public float computeMaintenanceCharge(int n) {
        return (100 * n) + 200;
    }
}

class SavingsAccount extends Account implements MaintenanceCharge {
    SavingsAccount(String n, String no, float b, String d) {
        super(n, no, b, d);
    }

    public float computeMaintenanceCharge(int n) {
        return (2 * 50 * n) + 50;
    }
}

public class BankMaintenance {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("1.Current Account");
        System.out.println("2.Savings Account");

        int choice = sc.nextInt();
        sc.nextLine();

        System.out.println("Name");
        String name = sc.nextLine();

        System.out.println("Account Number");
        String number = sc.nextLine();

        System.out.println("Account Balance");
        float balance = sc.nextFloat();
        sc.nextLine();

        System.out.println("Enter the Start Date(yyyy-mm-dd)");
        String date = sc.nextLine();

        System.out.println("Enter the Years");
        int years = sc.nextInt();

        if (choice == 1) {
            CurrentAccount a = new CurrentAccount(name, number, balance, date);
            System.out.printf("Maintenance Charge For Current Account %.2f",
                    a.computeMaintenanceCharge(years));
        } else {
            SavingsAccount a = new SavingsAccount(name, number, balance, date);
            System.out.printf("Maintenance Charge For Savings Account %.2f",
                    a.computeMaintenanceCharge(years));
        }

        sc.close();
    }
}