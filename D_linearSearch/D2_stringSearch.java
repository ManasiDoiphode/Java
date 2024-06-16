package D_linearSearch;

public class D2_stringSearch {
    public static void main(String[] args) {
        String str = "I am manasi";
        char ch = ' ';
        System.out.println(isCharInString(str, ch));
    }
    static boolean isCharInString(String str, char ch){
        for(int i = 0; i < str.length(); i++){
            if(str.charAt(i) == ch) return true;
        }
        return false;
    }
}
