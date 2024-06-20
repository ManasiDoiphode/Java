import java.util.*;
class E1_bs{
    public static void main(String[] args) {
        int[] nums = {-2, 1, 4, 5, 8, 9, 11, 43, 70};
        int target = 9;
        System.out.println(bs(nums, target));
    }

    static int bs(int[] nums, int target){
        if(nums.length == 0) return -1;
        Arrays.sort(nums);

        int start = 0;
        int end = nums.length - 1;
        while(start <= end){
            int mid = start + ((end - start)/2);
            if(target == nums[mid]) return mid;
            else if(target > nums[mid]) start = mid + 1;
            else end = mid - 1;
        }
        System.out.println("Target not found");
        return -1;
    }
}