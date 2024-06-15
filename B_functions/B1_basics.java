class B1_basics{
    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 9;
        System.out.println(sum(num1, num2));

        String name = "Manasi";
        System.out.println(greeting(name));

        int a = 10;
        int b = 5;
        swap(a, b);
        System.out.println("Actual values: " + a + " " + b);  //For primitives, only value is passed.

        changeName(name);
        System.out.println("actual name: " + name);  //for nonprimitives(objects and strings), reference is passed.

        int[] arr = {2, 6, 22, 8};
        changeArr(arr);
        System.out.println(arr[0]);
    }

    //Function syntax:
    /*
     * Access_mmodifier return_type function_name(parameters){
     *  //body
     *  //return statement
     * }
     */

    static int sum(int num1, int num2){
        return num1+num2;
    }

    static String greeting(String name){
        String greet = "Hi " + name + ", how are you?";
        return greet;
    }

    static void swap(int A, int B){
        int temp = A;
        A = B;
        B = temp;
        System.out.println("Arguements: " + A + " " + B);
    }

    static void changeName(String name){
        name = "ankita";
        System.out.println("changed Name: " + name);
    }

    static void changeArr(int[] arr){
        arr[0] = 99;
    }
}