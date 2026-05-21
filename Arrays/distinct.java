import java.util.*;

public class distinct {
    public static boolean distict(int number[]){
        for(int i=0; i<number.length;i++){
            for(int j=i+1;j<number.length;j++){
                if(number[j]==number[i]){
                    return true;
                }
            }
        }
        return false;
    }

    public static void main(String args[]){
        int numbers[]= {1,2,3,4,5,5,6,7};
        System.out.println(distict(numbers));
    }

}
