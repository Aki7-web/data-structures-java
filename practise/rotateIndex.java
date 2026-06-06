public class rotateIndex {
    public static void rotate(int arr[], int idx){
        int newarr[]=new int[arr.length];
        for(int i=0,j=idx+1;j<arr.length;i++,j++){
            newarr[i]=arr[j];
        }

        for(int i=0,j=arr.length-idx-1;i<=idx;i++,j++){
            newarr[j]=arr[i];
        }

        //copying new arr
        for(int i=0; i<arr.length;i++){
            arr[i]=newarr[i];
        }
    }

     public static void printArr(int arr[]){
        for(int i=0; i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }

    public static void indexrotate(int arr[], int idx){
        int n=arr.length;
        int i=0; int j=idx;
        while(i<j){
            int temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            i++;
            j--;
        }

        int k=idx+1; int l=n-1;
        while(k<l){
            int temp=arr[k];
            arr[k]=arr[l];
            arr[l]=temp;
            k++;
            l--;
        }

        int m=0; int z=n-1;
        while(m<z){
            int temp=arr[m];
            arr[m]=arr[z];
            arr[z]=temp;
            m++;
            z--;
        }

    }
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6,7,8,9,10,11,12,13,14};
        //rotate(arr, 3);
        indexrotate(arr, 3);
        printArr(arr);
    }
}
