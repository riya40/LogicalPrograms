/**
 * Printing the Fibonacci Series
 */
package com.bridgelabz;
import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String args[])
    {
        int n,n1=0,n2=1,result,count =0;
        System.out.println("enter the value");
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        while(count<n) {
            System.out.println(n1);
            result=n1+n2;
            n1=n2;
            n2=result;
            count++;
            System.out.print("series:"+result);
        }

    }

}
