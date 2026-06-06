package dividnconquersheet;

//Apply Merge sort to sort an array of Strings.
//(Assume that all the characters in all the Strings are in lowercase). 

public class stringSort {
    public static void mergeSort(String arr[], int si, int ei){
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

    public static void merge(String arr[], int si, int mid, int ei){
        int i=si;
        int j=mid+1;
        int k=0;

        //temp arr
        String temp[]= new String[ei-si+1];

        //storing inside temp
        while(i<=mid && j<=ei){
            if(arr[i].compareTo(arr[j])<0){
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

    public static void print(String arr[]){
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
    }

    public static void main(String[] args) {
        String arr[]={"sun", "earth", "mars", "mercury"};
        mergeSort(arr, 0, arr.length-1);
        print(arr);
    }
}
