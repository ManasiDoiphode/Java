import java.util.Arrays;

public class B4_variableArguements {
    public static void main(String[] args) {
        fun(2, 543, 56, 644, 4, 65);
        String name = "a";
        float f = 23.54f;
        multiple(name, f, 3, 2, 4);
    }
    static void fun(int ...v){
        System.out.println(Arrays.toString(v));
    }

    static void multiple(String name, float f, int ...v){  //order matters here, and also the varargs should be at the end
        System.out.println(Arrays.toString(v));
    }
}
