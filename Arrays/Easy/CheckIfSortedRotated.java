import java.util.Scanner;

public class CheckIfSortedRotated {
    public static int findBreakPoint(int[] nums) {
        int cnt = 0;
        for(int i=1;i<nums.length;i++){
            if(nums[i]<nums[i-1]) cnt++;
        }
        return cnt;
    }

    public static boolean check(int[] nums) {
        int cntBreakPoints = findBreakPoint(nums);
        int len = nums.length;
        if(cntBreakPoints==1 && nums[len-1]<=nums[0]) return true;
        else if (cntBreakPoints==0) return true;
        return false;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            int[] arr = new int[n];
            for(int i=0;i<n;i++) arr[i] = sc.nextInt();
            System.out.println("Check if rotated sorted - "+check(arr));
        }
    }
}
