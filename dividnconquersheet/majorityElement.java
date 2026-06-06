package dividnconquersheet;

//majority element shoud appear more than floor operator(n/2) i.e 1.5 to 1, 3.5 to 3, n is arr length

public class majorityElement {
    public static int majority(int arr[]){ //brute force time compx: O(n^2)
        int n= arr.length;
       
    for(int i=0; i<arr.length;i++){
         int sum=1;
        for(int j=i+1;j<arr.length;j++){
            if (arr[j]==arr[i]){
                sum+=1;
            }
            if(sum>n/2) return arr[i];
        }
    }
    return -1;
    }
    public static void main(String[] args) {
        int arr[]={2,1,2,2};
        System.out.print(majority(arr));
    }
}
