import java.util.*;

public class setIthBit {
    public static int setIthBit(int n , int i){ //set the i to 1
       int  bitMask= 1<<i;
       return n | bitMask;

    }
    public static void main(String args[]){
        System.out.println(setIthBit(10,0));
    }
}

