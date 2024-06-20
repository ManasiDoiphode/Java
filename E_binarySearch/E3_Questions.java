import java.util.*;
public class E3_Questions {
    public static void main(String[] args) {
        int[] arr = {-1, 2, 4, 5, 8, 10, 13, 17, 19, 22};
        System.out.println(searchInInfinite(arr, 17));

    }

    static int ceiling(int [] nums, int target){
        //https://leetcode.com/problems/search-insert-position/description/
        int start = 0;
        int end = nums.length - 1;

        while(start <= end){
            int mid = start + ((end - start)/2);
            if(target == nums[mid]) return mid;
            else if(target > nums[mid]) start = mid + 1;
            else end = mid - 1;
        }
        return start;
    }

    public int[] searchRange(int[] nums, int target) {
        //https://leetcode.com/problems/find-first-and-last-position-of-element-in-sorted-array/
        int start = 0;
        int end = nums.length - 1;
        int[] ans = {-1, -1};

        while(start <= end){
            int mid = start + ((end - start)/2);
            if(target == nums[mid]){
                //find starting position
                int i = 1;
                while(mid - i >= 0 && nums[mid - i] == target){
                    i++;
                }
                ans[0] = mid - i + 1;

                //find ending position
                int j = 1;
                while(mid+j < nums.length && nums[mid + j] == target){
                    j++;
                }
                ans[1] = mid + j - 1;

                break;
            }
            else if(target > nums[mid]) start = mid + 1;
            else end = mid - 1;
        }
        return ans;
    }

    public char nextGreatestLetter(char[] letters, char target) {
        //https://leetcode.com/problems/find-smallest-letter-greater-than-target/
        int start = 0;
        int end = letters.length - 1;

        if(target >= letters[end]) return letters[0];

        while(start <= end){
            int mid = start + ((end - start)/2);
            if(target < letters[mid]) end = mid - 1;
            else start = mid + 1;
        }
        return letters[start];

    }

    static int searchInInfinite(int[] arr, int target){
        int s = 0;
        int e = 1;
        while(arr[e] < target) {
            int temp = e + 1;
            e = e + (e-s+1) * 2; 
            s = temp;
        }
        while(s <= e){
            
            int m = (s + e)/2;
            if(target == arr[m]) return m;
            else if(target > arr[m]) {
                s = m + 1;
            }
            else e = m - 1;
        }

        return -1;
    }


    
    
}
