import java.util.*;

public class triplets{

    public static void triplet(int nums[]){
        for(int i=0; i<nums.length; i++){
            for(int j=i+1; j<nums.length; j++){
                for(int k=j+1; k<nums.length; k++){
                    if(nums[i]+nums[j]+nums[k]==0){
                        System.out.print("("+ nums[i] + "," +nums[j] +","+nums[k]+")");
                    }
                }
            }
        }
    }

    public static void main(String args[]){
        int nums[]={-1,0,1,2,-1,-4};
        triplet(nums);
    }

}