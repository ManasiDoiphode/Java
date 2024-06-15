public class B2_scope {
    public static void main(String[] args) {
        int a = 10;
        //para = 5;  //error: para cannot be used here

        {
            //int a = 1;  //error: cannot reinitialise a
            a = 1;  //cam change its value
            int c = 3;
        }
        //c = 4;  //error: cannot use c here
    }
    static void random(int para){
        para = 20;
        int b = 30;
        //b = a;  //error: a cannot be used here
    }
}

//So, anything initialised outside block can be used inside but anything initialised inside a block cannot use outside.
