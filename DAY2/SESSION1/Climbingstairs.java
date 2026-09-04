package DAY2.SESSION1;

import java.util.Scanner;

public class Climbingstairs {

    public static int climb(int n){
        //base case
        if(n == 0|| n == 1){
            return 1;
        }
        //recursive case
        return climb(n - 1) + climb(n - 2);
    }
    
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number of Stairs:");
        int n = sc.nextInt();
        System.out.println("The Combination:"+ climb(n));
    }
}
