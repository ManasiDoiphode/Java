import java.util.*;

public class A6_fibonacci {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int prev = 0;
        int cur = 1;
        int count = 2;
        while(count <= n){
            int temp = cur;
            cur = cur + prev;
            prev = temp;
            count++;
        }
        System.out.println(cur);
        sc.close();
    }
}
