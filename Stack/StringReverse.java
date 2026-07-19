package Stack;
import java.util.Stack;

public class StringReverse {
    public static String reverseString(String str){
        int idx=0;
        Stack<Character> s= new Stack<>();
    
        while(idx<str.length()){
            s.push(str.charAt(idx));
            idx++;
        }

        StringBuilder newStr= new StringBuilder("");
        while(!s.isEmpty()){
            char curr= s.pop();
            newStr.append(curr);
        }

        return newStr.toString();

    }

    public static void main(String[] args) {
        String str="aki";
        String rev=reverseString(str);
        System.out.println(rev);

    }
}
