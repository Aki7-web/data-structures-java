package Stack;
import java.util.Stack;
import java.util.*;

//largest rectangle area in the histogram

public class HistogramMaxArea {
    public static int maxAreaHis(int arr[]){
        int n= arr.length;
        int nxtRight[]= new int[arr.length];
        int nxtLeft[]= new int[arr.length];

        Stack<Integer> s= new Stack<>();//stack made first time
        //next smaller right
        for(int i=n-1;i>=0;i--){
            while(!s.isEmpty() && arr[s.peek()]>=arr[i]){
                s.pop();
            }
            if(s.isEmpty()){
                nxtRight[i]=n;
            }else{
                nxtRight[i]=s.peek();
            }
            s.push(i);
        }

        //next smaller left
        //for 2nd stack usage empty the earlier made stack

        s= new Stack<>();

        for(int i=0;i<n;i++){
            while(!s.isEmpty() && arr[s.peek()]>=arr[i]){
                s.pop();
            }
            if(s.isEmpty()){
                nxtLeft[i]=-1;
            }else{
                nxtLeft[i]=s.peek();
            }
            s.push(i);
        }

         int maxArea=0;

        for(int i=0; i<n; i++){
            int l=nxtLeft[i];
            int m= nxtRight[i];
            int w= m-l-1;
            int h= arr[i];
            int currArea= w*h;
            maxArea=Math.max(maxArea, currArea);
        }

        return maxArea;
    }

    public static void main(String[] args) {
        int arr[]={2,1,5,6,2,3};//heights in histogram
        System.out.println(maxAreaHis(arr));
    }
}
