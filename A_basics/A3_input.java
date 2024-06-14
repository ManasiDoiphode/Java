import java.util.Scanner;

public class A3_input {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("What is your name?");

        //String name = input.nextLine();
        String name = input.next();
        System.out.println("Hi " + name + "!");

        input.close();
    }
}