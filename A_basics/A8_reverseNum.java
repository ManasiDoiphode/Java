public class A8_reverseNum {
    public static void main(String[] args) {
        int n = 25389;
        int rev = 1;
        while(n > 0){
            int rem = n % 10;
            rev *= 10;
            rev += rem;
            n /= 10;
        }
        System.out.println(rev);
    }
}
