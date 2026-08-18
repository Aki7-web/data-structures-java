package GreedyAlgorithms;
import java.util.*;

public class MinimumSumAbsoluteDifference {
    public static void main(String[] args) { //O(nlogn) because of sorting
        int A[]={4,1,8,7};
        int B[]={2,3,6,5};

        Arrays.sort(A);
        Arrays.sort(B);

        int min=0;
        for(int i=0;i<A.length;i++){
            min+=Math.abs(A[i]-B[i]);
        }

        System.out.println(min);
    }
}
