package com.bridgelabz;
import java.util.Scanner;
public class PrimeNumber {
    public static void main(String args[]) {
        int n,r;
        System.out.println("enter the number");
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        r=n/2;
        for(int i=2;i<r;i++) {
            if(n%i==0) {
                System.out.println("not prime:"+n);
            }
        }
        System.out.println("prime:"+n);
    }
}
