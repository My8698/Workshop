package practice.basics;

import java.util.Scanner;

public class positiveornegative {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        System.out.print("Enter Number:");
        int num=scn.nextInt();
        if (num>0)
            System.out.println("Number is Positive");
        else if(num<0)
            System.out.println("Number is negative");
        else
            System.out.println("Number is zero");
    }
}
