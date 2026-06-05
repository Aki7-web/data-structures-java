//acg time comp O(nlogn)
//worst case time compl O(n^2)  occurs when pivot is always smallest or largest element
//good space compl O(1) constant

public class quickSort {
    public static void quickSort(int arr[], int si, int ei){
        //base case
        if(si>=ei) return;

        int pivIdx= partition(arr, si, ei);
        quickSort(arr, si, pivIdx-1);
        quickSort(arr, pivIdx+1, ei);
    }

    public static int partition(int arr[], int si, int ei){
        int pivot=arr[ei];
        int i= si-1;
        for(int j=si; j<ei; j++){
            if(arr[j]<pivot){
                i++;
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
            }
        }
        i++;
        int temp=pivot;
        arr[ei]=arr[i];
        arr[i]=temp;

        return i;
    }

    public static void print(int arr[]){
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
    }

    public static void main(String[] args) {
         int arr[]={2,3,4,7,3,-9,9,4,6,42,7};
        quickSort(arr, 0, arr.length-1);
        print(arr);
    }

}
