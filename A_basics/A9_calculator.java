import java.util.*;

public class A9_calculator {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int ans = 0;

        while(true){
            System.out.println("Enter the operator");
            int op = in.next().trim().charAt(0);

            if(op == '+' || op == '-' || op == '*' || op == '/' || op == '%'){
                System.out.println("Enter 2 operands");
                int a = in.nextInt();
                int b = in.nextInt();

                if(op == '+'){
                    ans = a+b;
                }
                if(op == '-'){
                    ans = a-b;
                }
                if(op == '*'){
                    ans = a*b;
                }
                if(op == '/'){
                    ans = a/b;
                }
                if(op == '%'){
                    ans = a%b;
                }
            }

            else if(op == 'x' || op == 'X') break;
            else{
                System.out.println("Invalid operator! \nEnter Valid operator");
                continue;
            }

            System.out.println(ans);
        }
    }
}
