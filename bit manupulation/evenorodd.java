import java.util.*;

public class evenorodd{
    public static void oddEven(int n){
        int bitMask=1;
        if((n & bitMask)==1){
            System.out.print("odd");
        }else{
            System.out.print("even");
        }
    }
    public static void main(String args[]){
        oddEven(4);
        oddEven(5);
    }
}