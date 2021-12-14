/**
 * Generating The Coupon Number
 */
package com.bridgelabz;
import java.util.Scanner;
public class CouponNumber {
    public static void generatenumber(int n) {
        String Alphanumeric="abcdefghijklmnopqrstuvwxyz"+"1234567890";
        StringBuffer sb=new StringBuffer();
        System.out.println("enter the coupon number generation");
        Scanner scanner=new Scanner(System.in);
        int g=scanner.nextInt();
        for(int j=0;j<g;j++) {
            for (int i = 0; i < n; i++) {
                int ch = (int) (Alphanumeric.length() * Math.random());
                sb.append(Alphanumeric.charAt(ch));
            }
            System.out.println(sb);
        }
    }
    public static void main(String args[]) {
        int n=(int)Math.floor(Math.random()*10)%10;
        CouponNumber c=new CouponNumber();
        c.generatenumber(n);

    }
}
