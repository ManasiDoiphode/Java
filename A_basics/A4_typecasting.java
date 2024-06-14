public class A4_typecasting {
    public static void main(String[] args) {

        //automatic type conversion:
        //1. All byte, short and char values is promoted to int
        //2. If any expression is float, long, double, then entire thing will be promoted to it respectively.
        float number = 10;
        //int number1 = 34.49; //error
        

        //narrowng type conversion:
        int number3 = (int)89.89;
        System.out.println(number3);


        //automatic type promotion in expressions:
        byte b = (byte)267;
        System.out.println(b);

        byte b1 = 30;
        byte b2 = 20;
        byte b3 = 5;
        int b4 = b1*b2+b3;
        System.out.println(b4);

        byte b6 = 20;
        //b6 = b6*2;  //error as b6*2 is promoted to int so cannot store in byte.

        int a1 = 'A';
        System.out.println(a1);

        System.out.println("नमस्ते");

        byte by = 42;
        char ch = 'a';
        short sh = 1024;
        int i = 50000;
        float fl = 5.67f;
        double d = 0.1234;
        double ans = (fl * by)+(i / ch)-(d * sh);
        System.out.println(ans);

    }
}
