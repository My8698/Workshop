package practice.array;

public class SecondSmallEle {
    static int secSmallest(int arr[],int n)
    {
        int smallest=arr[0];
        for(int i=0;i<n;i++){
            if(arr[i]<smallest)
                smallest=arr[i];
        }
        int sec_smallest=Integer.MAX_VALUE;
        for (int i=0;i<n;i++){
            if (arr[i]!=smallest && arr[i]<sec_smallest)
                sec_smallest=arr[i];
        }
        return sec_smallest;
    }

    public static void main(String[] args) {
        int arr[]={12,44,30,53,22,9};
        int n= arr.length;
        System.out.print(secSmallest(arr,n));
    }
}
