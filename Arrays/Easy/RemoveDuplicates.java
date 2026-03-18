import java.util.*;

public class RemoveDuplicates {
    public static int removeDuplicates(int[] nums) {
        int curr = 0;
        int k = 1;
        for(int i=0;i<nums.length;i++){
            if(nums[curr]<nums[i]) {
                nums[++curr] = nums[i];
                k++;
            }
        }
        return k;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            int[] arr = new int[n];
            for(int i=0;i<n;i++) arr[i] = sc.nextInt();
            System.out.println("Length - "+removeDuplicates(arr));
        }
    }
}