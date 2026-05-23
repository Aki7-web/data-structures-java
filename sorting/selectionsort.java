import java.util.*;

public class selectionsort{

    public static void selection(int num[]){
        for(int i=0; i<num.length-1;i++){
            int min=i;
            for(int j=i+1; j<num.length; j++){
                if (num[j]<num[min]){
                    min=j;
                }
            }
            //swap
            int temp= num[i];
            num[i]=num[min];
            num[min]=temp;
        }
    }


    public static void print(int arr[]){
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
    }

    public static void main(String args[]){
        int arr[]={5,8,5,2,6,4};
        selection(arr);
        print(arr);
    }
}