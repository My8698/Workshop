import java.util.Scanner;
/**
 * workshop1 problem statement
 */
public class SumOfDigits {
    /**
     * to print sum of digits of given number
     */
    public static void main(String[] args) {
        /**
         * taking variable sum to store sum of digits
         * initially sum=0
         * and digit-> to store single digit
         */
        int number,sum=0,digit;
        /**
         * scanner to take user input
         */
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enetr Number:->");
        number=scanner.nextInt();
        while (number>0)
        {
            /**
             * code to seperate digits
             */
            digit=number%10;
            sum=sum+digit;
            number=number/10;//177/10=17
        }
        System.out.println("Sum of digits:->"+sum);
    }
}
