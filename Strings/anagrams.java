import java.util.*;

public class anagrams{
    public static boolean anagram(String s1, String s2){
        if(s1.length()!=s2.length()){
            return false;
        }
        char st1[]= new char[s1.length()];
        char st2[]= new char[s2.length()];

        for(int i=0; i<s1.length();i++){
            st1[i]=s1.charAt(i);
        }

        for(int i=0; i<s2.length();i++){
            st2[i]=s2.charAt(i);
        }

        Arrays.sort(st1);
        Arrays.sort(st2);

        if(Arrays.equals(st1,st2)){
            return true;
        }else{
            return false;
        }

    }
    public static void main(String args[]){
        String s1="mom";
        String s2="omm";
        System.out.print(anagram(s1,s2));
    }
}