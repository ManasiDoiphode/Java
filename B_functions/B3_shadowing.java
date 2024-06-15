public class B3_shadowing {

    //class variable:
    static int x = 90;
    public static void main(String[] args) {
        System.out.println("before shadowing: " + x);
        int x;
        //System.out.println("after only declaring in a method: " + x);  //error
        x = 40;  //shadowing/overriding
        System.out.println("After initialising in a method: " + x);

        fun();
    }

    static void fun(){
        System.out.println("In different method: " + x);
    }
}
