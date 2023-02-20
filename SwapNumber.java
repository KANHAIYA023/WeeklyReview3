package Com.WeeklyReview3;

import java.util.Scanner;

public class SwapNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the number x is: ");
        int x = sc.nextInt();
        System.out.print("enter the number y is: ");
        int y = sc.nextInt();

        //swap
        x = x+y;
        y = x-y;
        x = x-y;
        System.out.println(" swapping--> here x is :" + x + " and y is : " + y);
    }
}
