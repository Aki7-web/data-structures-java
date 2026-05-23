import java.util.*;

public class palindrome{
    public static boolean palindrome(String s){
        int n=s.length();
        for (int i=0; i<s.length();i++){
            if(s.charAt(i)!=s.charAt(n-1-i)){
                return false;
            }
        }
        return true;
    }

    public static void main(String args[]){
        String s="racecar";
        System.out.print(palindrome(s));
    }
}