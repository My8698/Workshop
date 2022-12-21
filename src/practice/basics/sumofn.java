package practice.basics;

import java.util.Scanner;

public class sumofn {
    public static void main(String[] args) {


        Scanner scn = new Scanner(System.in);
        System.out.print("Enter Number:");
        int num = scn.nextInt();
        int sum = 0;
        for (int i=1;i<=num;i++)
            sum += i;
        System.out.println(sum);

    }
}
