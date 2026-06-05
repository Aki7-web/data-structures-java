//reversing array elements in groups

public class revArrGroup {
    public static void revArr(int arr[], int g){
       int i=0; int j=g-1;
       int k=0; int l=g-1;
        while(i<=arr.length-1 && j<=arr.length-1){
        while(i<j){
            int temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            i++;
            j--;
       }
       k+=g;
       l+=g;
       i=k;
       j=l;
       }
       if(i<=arr.length-1){
        j=arr.length-1;
        while(i<j){
            int temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            i++;
            j--;
       }
       }
    }

    public static void printArr(int arr[]){
        for(int i=0; i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }

    public static void main(String[] args) {
        int arr[]={1,3,4,6,8,3,5,7,4,6,8};
        revArr(arr, 3);
        printArr(arr);
    }
}
