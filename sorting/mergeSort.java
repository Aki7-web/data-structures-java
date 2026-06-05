//time comp O(nlogn) nice
//space comp O(n) takes space for that new array,

public class mergeSort {
    public static void mergeSort(int arr[], int si, int ei){
        //base case
        if(si>=ei) return;

        //mid
        int mid= si +(ei-si)/2;

        //left side sort
        mergeSort(arr, si, mid);

        //right side sort
        mergeSort(arr, mid+1, ei);

        //merge both sides
        merge(arr, si, mid ,ei);
    }

    public static void merge(int arr[], int si, int mid, int ei){
        int i=si;
        int j=mid+1;
        int k=0;

        //temp arr
        int temp[]= new int[ei-si+1];

        //storing inside temp
        while(i<=mid && j<=ei){
            if(arr[i]<arr[j]){
                temp[k++]=arr[i++];
            }else{
                temp[k++]=arr[j++];
            }
        }
        while(i<=mid){
             temp[k++]=arr[i++];
        }
        while(j<=ei){
            temp[k++]=arr[j++];
        }

        //copying temp back to orig arr
        for(int n=0,m=si;n<temp.length;m++,n++){
            arr[m]=temp[n];
        }
    }

    public static void print(int arr[]){
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
    }

    public static void main(String[] args) {
        int arr[]={2,3,4,7,3,-9,9,4,6,42,7};
        mergeSort(arr, 2, 7);
        print(arr);
    }
}
