
package ArrayList;
import java.util.*;

//for given n lines on x axis, use 2 lines to form container that holds max water
//O(n^2) brute force

public class ContainerWithMostWater {

    //brute force O(n^2)
    public static int Waterr(ArrayList<Integer> height){
        int maxWater= -1;
        for(int i=0;i<height.size();i++){
            for(int j=i+1;j<height.size();j++){
                int ht= Math.min(height.get(i), height.get(j));
                int wt= j-i;
                int currWater= ht * wt;
                maxWater= Math.max(maxWater,currWater);
            }
        }
        return maxWater;
    }

    //2 pointer approach O(n)
    public static int Waterr2(ArrayList<Integer> height){
        int maxWater=-1;
        int lp=0;
        int rp=height.size()-1;
        while (lp<rp) {
             int ht= Math.min(height.get(lp), height.get(rp));
                int wt= rp-lp;
                int currWater= ht * wt;
                maxWater= Math.max(maxWater,currWater);

                if(height.get(lp)<height.get(rp)){
                    lp++;
                }else{
                    rp--;
                }
        }

        return maxWater;
    }
    public static void main(String[] args) {
        ArrayList<Integer> water= new ArrayList<>();
        water.add(1);
        water.add(8);
        water.add(7);
        water.add(2);
        water.add(1);
        water.add(3);
        water.add(7);
        water.add(6);
        water.add(3);
        water.add(1);
        water.add(2);

        System.out.println(Waterr(water));
        System.out.println(Waterr2(water));
    }
}
