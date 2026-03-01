import java.util.*;

public class LargestElement{
    private int largest(int[] arr, int n){
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
            LargestElement ob = new LargestElement();
            System.out.println("Largest Element - "+ob.largest(arr,n));
        }
    }
}