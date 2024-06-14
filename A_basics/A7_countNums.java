public class A7_countNums {
    public static void main(String[] args) {
        int n = 44837494;
        int count = 0;
        while(n>0){
            int rem = n % 10;
            n = n / 10;
            if(rem == 4) count++;
        }
        System.out.println(count);
    }
}
