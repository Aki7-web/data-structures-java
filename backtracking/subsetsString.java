package backtracking;

public class subsetsString {

    public static void subset(String str, String ans, int i){
        //base case
        if(i==str.length()){
                if(ans.length()==0){
                System.out.println("null");
            }else{
                System.out.println(ans);
            }
            return;
            }

        //yes char choice
        subset(str, ans+str.charAt(i), i+1);

        //no char choice
        subset(str, ans, i+1);
    }
    public static void main(String[] args) {
        String str= "aki";
        subset(str, "", 0);
    }
    
}
