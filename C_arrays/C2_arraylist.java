import java.util.ArrayList;
import java.util.Scanner;

public class C2_arraylist {
    public static void main(String[] args) {
        multiArraylist();
    }
    static void arrayList(){
        //variable size of array
        //syntax:
        /*
         *ArrayList<object Datatype> name = new ArrayList<>(Initial_capacity); 
         */
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(4);
        list.add(6);
        list.add(3);
        System.out.println(list);

        System.out.println(list.contains(6));
        list.set(2, 99);
        list.remove(3);
        System.out.println(list);

    }

    static void multiArraylist(){
        Scanner sc = new Scanner(System.in);
        ArrayList<ArrayList<Integer>> ls = new ArrayList<>();

        //create 3 arraylists in ls
        //declaration:
        for(int i = 0; i < 3; i++){
            ls.add(new ArrayList<>());
        }

        //initialisation
        for(int i = 0; i < 3; i++){
            for(int j = 0; j < 3; j++){
                ls.get(i).add(sc.nextInt());
            }
        }

        //printing
        for(int i = 0; i < 3; i++){
            for(int j = 0; j < 3; j++){
                System.out.print(ls.get(i).get(j)); 
            }
            System.out.println();
        }
    }
}
