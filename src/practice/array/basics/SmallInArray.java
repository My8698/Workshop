package practice.array.basics;

public class SmallInArray {
    public static void main(String[] args) {
        int arr[]={10,20,30,40,5};
        int min=arr[0];
        for (int i=0;i<arr.length;i++){
            if (min>arr[i])
            {
                min=arr[i];
            }
        }
        System.out.print(min);
    }
}
