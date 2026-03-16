import java.util.Scanner;

public class SecondLargest {
    public static int getSecondLargest(int[] arr) { // O(N)
        int largest = arr[0];
        int sLargest = -1;
        for(int i=1;i<arr.length;i++){
            if(arr[i]>largest){
                sLargest = largest;
                largest = arr[i];
            } else if(arr[i]>sLargest && arr[i]<largest){
                sLargest = arr[i];
            } 
        }
        return sLargest;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            int[] arr = new int[n];
            for(int i=0;i<n;i++) arr[i] = sc.nextInt();
            System.out.println("Second Largest Element - "+getSecondLargest(arr));
        }
    }
}
