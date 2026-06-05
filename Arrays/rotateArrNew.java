public class rotateArrNew {
    public static int rotateArr(int arr[], int tar, int si, int ei){
        //base case
        if(si>ei) return -1;

        int mid=si+(ei-si)/2;

        if(arr[mid]==tar) return mid;

        //line 1
        if(arr[si]<=arr[mid]){
            //left of line1
            if(arr[si]<=tar && tar<=arr[mid]){
                return rotateArr(arr, tar, si, mid-1);
            }else{ //right of line1
                return rotateArr(arr, tar, mid+1, ei);
            }
        }else{//line2
            if(arr[mid]<=tar && tar<=arr[ei]){
                return rotateArr(arr, tar, mid+1, ei);//right side of line2
            }else{
                return rotateArr(arr, tar, si, mid-1);//left side of line 2
            }
        }
    }

    public static void main(String[] args) {
        int arr[]={4,5,6,7,0,1,2};
        System.out.println(rotateArr(arr,0,0,arr.length-1));
    }
}
