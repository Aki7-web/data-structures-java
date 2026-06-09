package backtracking;
//first fill array 1 to 5 through recursive calls then while returning minus 2 at each step(backtracking)

public class arrayBacktrack {
    public static void changeArr(int arr[], int i, int val){
        //base case
        if(i==arr.length){
            print(arr);
            return;
        }

        //recursion
        arr[i]=val;
        changeArr(arr, i+1, val+1);
        arr[i]-=2;

    }

    public static void print(int arr[]){
        for(int i=0; i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int arr[]= new int[5];
        changeArr(arr, 0, 1);
        print(arr);
    }
}
