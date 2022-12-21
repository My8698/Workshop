package practice.basics;

import java.util.Scanner;

public class sunofdigit {
    public static void main(String[] args)
    {
        Scanner scn=new Scanner(System.in);
        System.out.println("Enter Number:");
        int num=scn.nextInt();int sum=0;

        while(num!=0){
            sum += num%10;
            num=num/10;
        }
        System.out.println("Sum of Digits:" +sum);
    }
}
