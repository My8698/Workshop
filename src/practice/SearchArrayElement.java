package practice;
import java.util.Scanner;

/**
 * workshop 2 problem
 * Search element in given array using Oops concept
 */
public class SearchArrayElement{
    public void search()
    {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter size of array->");
        int size=scanner.nextInt();
        int array[]=new int[size];
        System.out.println("Enter elements of array->");

        for (int i=0;i<size;i++){
            array[i]=scanner.nextInt();
        }
        System.out.println("Elements of array are->");
        for (int i=0;i<size;i++){
            System.out.println(array[i]+"");
        }
        System.out.println("Enter element you want to search->");
        int search=scanner.nextInt();
        for (int i=0;i<size;i++){
            if (array[i]==search)
            {
                System.out.println("Element " + search + " found at " + i + " position ");
                break;
            }
            else {
                System.out.println("element not found");
            }
        }
    }
    public static void main(String[] args)
    {
        SearchArrayElement object=new SearchArrayElement();
        object.search();
    }
}
