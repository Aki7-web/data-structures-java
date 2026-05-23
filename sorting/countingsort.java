import java.util.*;

public class countingsort{

    public static void countSort(int arr[]){
        int largest= Integer.MIN_VALUE;
        for(int i=0; i<arr.length; i++){
            largest=Math.max(largest,arr[i]);
        }

        int count[]= new int[largest+1];
        for(int j=0;j<arr.length;j++){
            count[arr[j]]++;
        }

        //sorting
        int j=0;
        for(int k=0; k<count.length; k++){
            while(count[k]>0){
                arr[j]=k;
                j++;
                count[k]--;
            }
        }
    }

    public static void print(int arr[]){
        for(int i=0; i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }

    public static void main(String args[]){
        int arr[]={1,2,3,2,1,2,5,4,6,7,4,5,6,7,4,8};
        countSort(arr);
        print(arr);
    }
}