import java.util.*;

public class bubblesort{
    public static void bubble(int numbers[]){
        for(int i=0; i<numbers.length-1;i++){ //no. of turns
            int swap=0; //to break the loop in 1st turn if no swap occurs in it, meaning its sorted
            for(int j=0;j<numbers.length-1-i;j++){ //no. of swap checking conditions
                if(numbers[j]>numbers[j+1]){
                    int temp=numbers[j];
                    numbers[j]= numbers[j+1];
                    numbers[j+1]=temp;
                    swap++;
                }
               
            }
            if (swap==0) break;
        }
    }

    public static void print(int numbers[]){
        for(int i=0; i<numbers.length; i++){
            System.out.print(numbers[i]+" ");
        }
    }


    public static void main(String args[]){
        int numbers[]={1,9,8,4,5,6};
        bubble(numbers);
        print(numbers);
    }
}