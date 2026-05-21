import java.util.*;

public class rotatedarray {

    public static int target(int numbers[], int target){
        int low=0;
        int high=numbers.length-1;

        while(low<=high){

        int mid= (low+high)/2;
        if(numbers[mid]==target){
            return mid;
        }
        if(numbers[low]<numbers[mid]){ //if left side of mid is sorted
            if (numbers[low]<=target && numbers[mid]>=target){ //finding target in sorted array
                high=mid-1;
            }else{
                low=mid+1; //going to the right side if target not in left side
            }
        }else{ //if right array is sorted
            if(target>=numbers[mid] && target<=numbers[high]){ //finding target
                low=mid+1;
            }else{
                high=mid-1; //going to left if target not in right
            }
        }
        }
        return -1;
    }
    public static void main(String[] args) {
        int numbers[]={6,7,0,1,2,3,4,5};
        System.out.println(target(numbers,7));
    }
    
}
