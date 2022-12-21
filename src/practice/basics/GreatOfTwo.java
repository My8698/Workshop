package practice.basics;

import java.util.Scanner;

public class GreatOfTwo {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        System.out.println("Enter First Number:->");
        int no1=scn.nextInt();
        System.out.println("Enter Second Number:->");

        int no2=scn.nextInt();
        if(no1>no2)
            System.out.println("Greatest number is:"+no1);
        else if(no1<no2)
            System.out.println("Greatest number is:"+no2);
        else
            System.out.println("Both are equal");

    }
}
