//to remove duplicates in a string with char a to z
//boolean array with true at place if char appeared once
//index for 'a' will be 0 then so on
//for any given char index= 'currchar'-'a'

public class duplicates {
     public static void removeDup(String str, int idx, StringBuilder newStr, boolean arr[]){
        if(idx==str.length()){
            System.out.println(newStr.toString());
            return;
        }

        char currChar=str.charAt(idx);
        if(arr[currChar-'a']==true){
            removeDup(str, idx+1, newStr, arr);
        }else{
            arr[currChar-'a']=true;
            newStr=newStr.append(currChar);
            removeDup(str, idx+1, newStr, arr);
        }
     }

     public static void main(String[] args) {
        String str="ronaldo";
        StringBuilder newStr= new StringBuilder("");
        boolean arr[]= new boolean[26];
        removeDup(str, 0, newStr, arr);
     }
}
