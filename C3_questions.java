import java.util.Arrays;

class C3_questions{
    public static void main(String[] args) {
        int[] arr = {1, 2, 5, 9, 11};

        // swap(arr, 0, 3);
        // System.out.println(Arrays.toString(arr));

        //System.out.println(max(arr));

        reverseArray(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    static int max(int[] arr){
        int max = 0;
        for (int i : arr) {
            max = Math.max(max, i);
        }
        return max;
    }

    static void reverseArray(int[] arr){
        for(int i = 0; i < arr.length/2; i++){
            int temp = arr[i];
            arr[i] = arr[arr.length - 1 - i];
            arr[arr.length - 1 - i] = temp;
        }
    }
}