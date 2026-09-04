package DAY3.SESSION3;
import java.util.Scanner;

class currentbill{
    double watts,hours;
    double amount(){
        return(watts*hours/1000)*1.5;
    }
}

class fan extends currentbill{}
class light extends currentbill{}
class TV extends currentbill{}

public class ElectricityBillCalculation {
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)){
        currentbill fan = new fan();
        currentbill light = new light();
        currentbill TV = new TV();
        fan.watts=sc.nextDouble();
        fan.hours=sc.nextDouble();  
        light.watts=sc.nextDouble();
        light.hours=sc.nextDouble();
        TV.watts=sc.nextDouble();
        TV.hours=sc.nextDouble();
        double totalbill = fan.amount() + light.amount() + TV.amount();
        System.out.printf("%.2f",totalbill);
        sc.close();
}
}
}