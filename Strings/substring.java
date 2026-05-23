import java.util.*;

public class substring{
    public static String substring(String str,int si, int ei){
        String substr="";
        for(int i=si;i<ei;i++){
            substr+=str.charAt(i);
        }
        return substr;
    }
    public static void main(String args[]){
        String str="helloji";
        //System.out.print(substring(str,0,4));
        System.out.print(str.substring(0,3));
    }
}