package Stack;
import java.util.Stack;

public class ValidParenthesis {

    public static boolean valid(String str){
        Stack<Character> s= new Stack<>();
        //push opening brackets
        //check closing brackets condition
        //check empty condition

        for(int i=0; i<str.length();i++){
            if(str.charAt(i)=='(' || str.charAt(i)=='{' || str.charAt(i)=='['){
                s.push(str.charAt(i));
            }else{
                if(s.isEmpty()){ //imp condition if more number of closing brackets or only closing brackets there
                    return false;
                }
                if(str.charAt(i)==')'){
                if(s.peek()!='('){
                    return false;
                }else{
                    s.pop();
                }
            }
            if(str.charAt(i)=='}'){
                if(s.peek()!='{'){
                    return false;
                }else{
                    s.pop();
                }
            }
            if(str.charAt(i)==']'){
                if(s.peek()!='['){
                    return false;
                }else{
                    s.pop();
                }
            }
            }
            
        }
        if(!s.isEmpty()){
                return false;
            }
         return true;
    }
    public static void main(String[] args) {
        String str="((){}[])";
        String strr="{}}}}}";
        System.out.println(valid(str));
        System.out.println(valid(strr));
    }
}
