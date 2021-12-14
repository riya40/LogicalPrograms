/**
 * Printing The Given number in Reverse Order
 */
package com.bridgelabz;
import java.util.Scanner;
public class ReverseNumber {
    public static void main(String args[]) {
        int n,r=0,d;
        System.out.println("enter the number");
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        while(n!=0) {
            d=n%10;
            r=r*10+d;
            n=n/10;
        }
        System.out.println("the reverse number is:"+r);
    }
}
