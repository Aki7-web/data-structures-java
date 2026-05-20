import java.util.*;

public class tapwater {

    public static int tapwater(int height[]){
        int n= height.length;
        //left max array

        int leftMax[]= new int[height.length];
        leftMax[0]=height[0];
        for(int i=1; i<n; i++){
            leftMax[i]=Math.max(height[i],leftMax[i-1]);
        }

        //right max array

        int rightMax[]= new int[height.length];
        rightMax[n-1]=height[n-1];
        for(int i=n-2; i>=0; i--){
            rightMax[i]=Math.max(height[i],rightMax[i+1]);
        }

        int totalWater=0;

        for (int j=0;j<n;j++){

             //min of left and right
            int waterlevel= Math.min(leftMax[j],rightMax[j]);

            //minus the height of that tower
            totalWater+= waterlevel-height[j];
        }
       

        return totalWater;

    }
    public static void main(String[] args) {
        int height[]= {4,2,0,6,3,2,5};
        System.out.println(tapwater(height));
    }
    
}
