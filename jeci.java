import java.util.*;

public class jeci {

    public static void kadanes(int numbers[]){
        int ms= Integer.MIN_VALUE; //maxsum
        int cs=0; //current sum
        
        for(int i=0; i<numbers.length; i++){
            cs+=numbers[i];

            if(cs>ms){  //if array consists of all negative
                ms=cs;
            }

            if(cs<0){ // no negative taken forward
                cs=0;
            }
        }
        System.out.println(ms);
        System.out.println();
    }
            
    public static void main(String[] args) {
    int numbers[]={-2,-3,-1,-4,-5};
    kadanes(numbers);
            }
    
}
