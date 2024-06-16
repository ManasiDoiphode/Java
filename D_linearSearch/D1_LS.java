package D_linearSearch;

import java.util.Arrays;
import java.util.Scanner;

public class D1_LS {
    public static void main(String[] args) {
        int[] arr = {3, 6, 9, 61, 1, 43, 8, 24, 5, 11};
        //System.out.println(linearSearch(arr, 50));
        //System.out.println(searchInRange(arr, 8, 3, 7));
        System.out.println(findMin(arr));
    }

    static int linearSearch(int[] arr, int n){
        if(arr.length == 0){
            return -1;
        }
        for(int i = 0; i < arr.length; i++){
            if(arr[i] == n) return i;
        }
        return -1;
    }

    static int searchInRange(int[] arr, int target, int start, int end){
        if(arr.length == 0){
            return -1;
        }
        for(int i = start; i < end+1; i++){
            if(arr[i] == target) return i;
        }
        return -1;
    }

    static int findMin(int[] arr){
        int min = Integer.MAX_VALUE;
        for (int i : arr) {
            min = Math.min(min, i);
        }
        return min;
    }
}
