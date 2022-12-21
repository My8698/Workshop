package practice.basics;
import java.util.Scanner;
public class evenorodd {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        System.out.print("Enter Number:");
        int num=scn.nextInt();
        if(num%2==0)
            System.out.println("Number is Even");
        else
            System.out.println("Number is Odd");
    }
}
