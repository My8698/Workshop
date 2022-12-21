package practice.basics;

import java.util.Scanner;

public class palindrom {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        System.out.println("Enter Number:");
        int num= scn.nextInt();
        int reverse=0,rem,temp;
        temp=num;

        while (temp!=0)//for finding reverse number
        {
            rem=temp%10;
            reverse=reverse*10+rem;
            temp/=10;
        };
        if(num==reverse)
        System.out.println(num + " is Palindrome");
         else
             System.out.println(num + " is not Palindrome");
    }

}
