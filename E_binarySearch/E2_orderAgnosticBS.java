import java.util.Arrays;

public class E2_orderAgnosticBS {
    public static void main(String[] args) {
        int[] nums = {70, 68, 30, 11, 5, 2, -4, -60};
        int target = -4;
        System.out.println(orderAgnostic(nums, target));
    }

    static int orderAgnostic(int[] nums, int target){
        
        if(nums.length == 0) return -1;

        int start = 0;
        int end = nums.length - 1;
        while(start <= end){
            int mid = start + ((end - start)/2);
            if(target == nums[mid]) return mid;
            else if(target > nums[mid]){
                if(nums[0] < nums[1]) start = mid + 1;
                else end = mid - 1;
            }
            else {
                if(nums[0] < nums[1]) end = mid - 1;
                else start = mid + 1;
            }
        }
        System.out.println("Target not found");
        return -1;
    }
}
