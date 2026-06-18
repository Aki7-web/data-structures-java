package backtracking;

//very bad time complex
//each traversed cell has 2 options down, or right
//and cells traversed would be n+m
//so tc: O(2^(n+m)) exponential time complex very bad
//so we take the mathematical approach for linear time complexity O(n+m)
// ways= (n-1+m-1)!/((n-1)!*(m-1)!)
//n-1 and m-1 are total down and right movements and we permute them to see all combinations

public class grid {
    public static int gridway(int i, int j, int n, int m){
        //base case
        if(i==n-1 && j==m-1){
            return 1;
        }else if(i==n || j==m){
            return 0;
        }

        int w1= gridway(i+1, j, n, m);
        int w2= gridway(i, j+1, n, m);

        return w1+w2;
    }

    public static void main(String[] args) {
        int n=3; int m=3;
        System.out.println(gridway(0, 0, n, m));
    }
}
