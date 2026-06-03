public class occurance {

    public static int firstOccur(int arr[],int i, int key){  //O(n) worst case time and space complexity
        if(arr[i]==key) return i;
        if(i==arr.length-1) return -1;
        return firstOccur(arr, i+1, key);
    }

    public static int lastOccur(int arr[],  int i, int key){
        if (arr[i]==key) return i;
        if(i==0) return -1;
        return lastOccur(arr, i-1, key);
    }

    //backtracking approach for last occurance
    public static int lasttOccur(int arr[], int i, int key){
        if(i==arr.length) return -1;
        int found= lasttOccur(arr, i+1, key);
        if(found==-1 && arr[i]==key) return i;

        return found;
    }
    public static void main(String[] args) {
        int arr[]={1,5,3,4,5,3,6};
        System.out.println(lastOccur(arr, arr.length-1, 3));
        System.out.println(lasttOccur(arr, 0, 3));
    }
}
