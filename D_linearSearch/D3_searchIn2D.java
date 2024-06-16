package D_linearSearch;

import java.util.Arrays;

public class D3_searchIn2D {
    public static void main(String[] args) {
        int[][] arr = {
            {5, 3, 9, 7},
            {11, 65},
            {4, -34, -5, 15}
        };
        System.out.println(Arrays.toString(searchIn2D(arr, 9)));
    }

    static int[] searchIn2D(int[][] arr, int target){
        for (int i = 0; i < arr.length; i++) {
            for(int j = 0; j < arr[i].length; j++){
                if(arr[i][j] == target) {
                    System.out.println("Target found");
                    return new int[]{i, j};
                }
            }
        }
        System.out.println("target not found");
        return new int[]{-1, -1};
    }
}
