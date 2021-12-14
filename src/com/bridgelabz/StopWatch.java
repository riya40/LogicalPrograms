/**
 * Stop Watch Program
 * Measure the Elapsed Time Between Start and End
 */
package com.bridgelabz;
import java.util.Scanner;
public class StopWatch {
    public static void main(String args[]) {
        System.out.println("Press any key to start watch");
        Scanner sc=new Scanner(System.in);
        char now=sc.next().charAt(0);
        long start=System.currentTimeMillis();
        System.out.println("Press any key to stop watch");
        char st=sc.next().charAt(0);
        long stop=System.currentTimeMillis();
        float totaltime=(float)(stop-start)/1000;
        System.out.println("the total time is:"+totaltime +"seconds");
    }
}
