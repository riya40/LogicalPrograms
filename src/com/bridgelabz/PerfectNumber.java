/**
 * Printing the Number is Perfect or Not
 */
package com.bridgelabz;
import java.util.Scanner;

public class PerfectNumber {
    public static void main(String args[]) {
        int n,sum=0,i;
        System.out.println("enter value");
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        for(i=1;i<n;i++) {
            //calculate sum of factors
            if(n%i==0) {
                sum+=i;
            }
        }
        if(sum==n) {
            System.out.println("perfect number");
        }
        else {
            System.out.println("not perfect");
        }
    }
}
