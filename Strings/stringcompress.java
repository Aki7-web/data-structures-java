import java.util.*;

public class stringcompress{
    public static String compress(String str){ //O(n) linear time compx as both for and while loops together iterates of length of string
        StringBuilder sb= new StringBuilder("");
        for(int i=0; i<str.length();i++){
            Integer count=1;  //very imp integer object to be defined so that it can be converted to string to concatenate with the character
            while(i<str.length()-1 && str.charAt(i+1)==str.charAt(i)){
                count++;
                i++;
            }
            if(count>1){
                sb.append(str.charAt(i)+ count.toString()); //count to string then + with char
            }else{
                sb.append(str.charAt(i));
            }
        }
        return sb.toString();
    }
    public static void main(String args[]){
        String str="aabsshhtcc";
        System.out.print(compress(str));
    }
}