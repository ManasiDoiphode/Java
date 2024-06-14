import java.util.*;

public class A5_conditionals_loops {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        //if
        if(true) System.out.println("hi");
        if(false) System.out.println("Not hi");  //dead code
        
        if(true || false) System.out.println("hi");
        if(true && false) System.out.println("hi");

        //while loop:
        /*
         * syntax:
         * initialisation
         * while(condition){
         *  //body
         *  in/de crement
         * }
         */

        int count = 1;
        while(count != n){
            System.out.print(count + " ");
            count++;
        }

        //do while loop:
        /*
         * syntax:
         * do{
         *  //body
         * }while(condition)
         */
        int count1 = 1;
        do{
            System.out.print(count1 + " ");
            count1++;
        }while(count1 != n);


        //for loop:
        /*
         * syntax:
         * for(initialisation; condition; in/de crement){
         *  //body
         * }
         */

        for(int i = 1; i < n; i++){
            System.out.print(i + " ");
        }

        sc.close();
        findMax();


    }

    public static void findMax(){
        int a = 60;
        int b = 40;
        int c = 30;

        System.out.println(Math.max(a, Math.max(b, c)) + " is max");

        //OR

        // int max = a;
        // if(max<b) max = b;
        // if(max<c) max = c;
        // System.out.println(max + " is max");

        //OR

        // if(a>b){
        //     if(a>c){
        //         System.out.println("a is max");
        //     }
        //     else{
        //         System.out.println("c is max");
        //     }
        // }
        // else if(b>c){
        //     System.out.println("b is max");
        // }
        // else{
        //     System.out.println("c is max");
        // }
    }


}
