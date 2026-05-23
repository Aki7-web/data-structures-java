import java.util.*;

public class practice{
    public static int lowervovel(String str){
        int count=0;
        for(int i=0; i<str.length();i++){
            if(str.charAt(i)=='a' || str.charAt(i)=='e' || str.charAt(i)=='i'|| str.charAt(i)=='o' || str.charAt(i)=='u'){
                count++;
            }
        }
        return count;
    }
    public static void main(String args[]){
        String str="akIoOunbdi";
       // System.out.print(lowervovel(str));
       //str=str.replace('k','l');
       //System.out.print(str);
      //String s1=new String("aki").intern();
       String s2= "aki";
       s2=s2.concat("aki");
       System.out.print(s2);
    }
}