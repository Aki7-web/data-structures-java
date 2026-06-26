package ArrayList;
import java.util.*;

//for finding if a pair exit whose sum is target in a [sorted + rotated] array


public class pairSum2 {

    public static int pivot(ArrayList<Integer> num){
        int pivot=-1;
        for(int j=0; j<num.size()-1; j++){
            if(num.get(j)>num.get(j+1)){
                pivot=j;
                break;
            }
        }
        return pivot;
    }

    public static boolean sum(ArrayList<Integer> num, int target){
        int n= num.size();
        int piv=pivot(num);
        int rp=piv;
        int lp=piv+1;
        
        
        while (lp!=rp) {
            if(num.get(lp)+num.get(rp)==target) return true;

            if(num.get(lp)+num.get(rp)<target){
                lp=(lp+1)%n; //modulo arithmetic for traversing the two pointers in a rotating manner
            }else{
                rp=(n+rp-1)%n;
            }
            

        }
        
        return false;
    }
    public static void main(String[] args) {
        ArrayList<Integer> list= new ArrayList<>();
        list.add(11);
        list.add(15);
        list.add(6);
        list.add(8);
        list.add(9);
        list.add(10);
        int target =27;
        System.out.println(sum(list, target));
    }
}
