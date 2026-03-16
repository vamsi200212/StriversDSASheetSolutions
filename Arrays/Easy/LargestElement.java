import java.util.*;

public class LargestElement{
    public static int largest(int[] arr, int n){
        int max = Integer.MIN_VALUE;
        for(int ele: arr){
            if(ele>max) max = ele;
        }
        return max;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            int[] arr = new int[n];
            for(int i=0;i<n;i++) arr[i] = sc.nextInt();
            System.out.println("Largest Element - "+largest(arr,n));
        }
    }
}