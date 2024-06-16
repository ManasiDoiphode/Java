import java.util.*;
import java.util.Scanner;

class C1_arrays{
    public static void main(String[] args) {
        //Arrays syntax:
        /*
         * datatype [] array_name = new datatype[size];
         * OR
         * datatype[] name = {ele1, ele2, .....};
         */
        array();
        array2d();
    }

    static void array(){
        int[] arr = new int[3];
        System.out.println(arr[2]);

        String[] str = new String[5];
        System.out.println(str[0]);

        Scanner sc = new Scanner(System.in);
        int[] a = new int[4];
        for(int i = 0; i < a.length; i++){
            a[i] = sc.nextInt();
        }
        for (int i : a) {
            System.out.print(i + " ");
        }


        String strFormat = Arrays.toString(a);
        System.out.println(strFormat);
    }

    static void array2d(){
        //syntax:
        /*
         * datatype [][] name = new datatype[must write no. of rows][may/maynot write no. of columns];
         * OR
         * datatype [][] name = {
         * {},
         * {},
         * {}
         * }
         */

        Scanner sc = new Scanner(System.in);
        int[][] arr = new int[3][3];
        int rowNo = arr.length;
        int colNo = arr[0].length; 

        for(int i = 0; i < rowNo; i++){
            for(int j = 0; j < colNo; j++){
                arr[i][j] = sc.nextInt();
            }
        }

        System.out.println(Arrays.toString(arr));
        for (int[] c : arr) {
            System.out.println(Arrays.toString(c));
        }
    }
}