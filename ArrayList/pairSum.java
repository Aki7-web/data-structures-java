package ArrayList;
import java.util.*;

//find if any pair in the sorted array sums to a target

public class pairSum {
    //brute force O(n^2) - uk

    //2 pointer approach O(n)
    public static boolean sumPair(ArrayList<Integer> num, int target){
        int lp=0;
        int rp=num.size()-1;
        while (lp<rp) {
            int sum=num.get(lp)+num.get(rp);
            if(sum==target) return true;
            if(sum<target){
                lp++;
            }else{
                rp--;
            }
        }

        return false;
    }
    
    public static void main(String[] args) {
        ArrayList<Integer> arr= new ArrayList<>();
        arr.add(1);
        arr.add(2);
        arr.add(3);
        arr.add(4);
        arr.add(5);
        arr.add(6);
        System.out.println(sumPair(arr, 15));
        System.out.println(sumPair(arr, 7));
        System.out.println(sumPair(arr, 1));

    }
}
