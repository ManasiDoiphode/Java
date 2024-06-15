import java.util.Scanner;

public class B6_questions {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        prime(n);
        armstrong(n);
    }

    static void prime(int n){
        int i = 2;
        while(i * i <= n){
            if(n%i == 0) {
                System.out.println("Not prime");
                return;
            }
            else{
                i++;
            }
        }
        System.out.println("Prime");
    }

    static void armstrong(int n){
        int og = n;
        int sum = 0;
        while(n > 0){
            int rem = n % 10;
            sum += rem * rem * rem;
            n /= 10;
        }
        if(sum == og) System.out.println("Armstrong");
        else System.out.println("Not armstrong");
    }
}
