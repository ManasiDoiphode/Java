import java.util.*;

public class B5_methodOverloading {
    public static void main(String[] args) {
        fun(6);
        fun(10, 20);
        fun("manasi");
        fun(6, 4, 2, 9, 1, 3);
        fun("dfj", "sdhd", "df", "ut");
    }
    static void fun(int n){
        System.out.println(n);
    }
    static void fun(int a, int b){
        System.out.println(a+b);
    }
    static void fun(String n){
        System.out.println(n);
    }
    static void fun(int ...v){
        System.out.println(Arrays.toString(v));
    }
    static void fun(String ...v){
        System.out.println(Arrays.toString(v));
    }
}
