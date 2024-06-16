package D_linearSearch;

public class D4_questions {
    public static void main(String[] args) {
        int[] nums = {2, 3, 5, 1892, -1, -50};
        System.out.println(evenDigits(nums));
    }

    static int evenDigits(int[] arr){
        int count = 0;
        for (int i : arr) {
            int digits = 0;
            while(Math.abs(i) > 0){
                digits++;
                i /= 10;
            }
            if(digits % 2 == 0) count++;
        }
        return count;
    }
}
