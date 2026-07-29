package Stack;
import java.util.Stack;

//even though there are 2 loops ,but its O(n) and not O(n^2) which is the brute force one
//linear time complexity

//next greater right
//next greater left(loop reverse ,start from 0)
//next smaller right(the while loop condition reverse to pop the greater elements)
//next smaller left(both loop rev and while condition reverse)

public class NextGreaterElement {

    public static void nextGreaterElement(int arr[], int newArr[]){
        int n= arr.length;
        Stack<Integer> s= new Stack<>();
        for(int i=n-1;i>=0;i--){
            while (!s.isEmpty() && arr[s.peek()]<arr[i]) {
                s.pop();
            }
            if(s.isEmpty()){
                newArr[i]=-1;
            }else{
                newArr[i]=arr[s.peek()];
            }
            s.push(i);
        }

    }
    public static void main(String[] args) {
        int arr[]={6,8,0,1,3};
        int newArr[]= new int[arr.length];
        nextGreaterElement(arr, newArr);
        for(int i=0; i<newArr.length;i++){
            System.out.print(newArr[i]+" ");
        }
    }
}
