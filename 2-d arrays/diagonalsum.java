import java.util.*;

public class diagonalsum{
    public static int diagonalsum(int mat[][]){
        int sum=0;
        // for(int i=0; i<mat.length; i++){   //O(n^2)
        //     for (int j=0; j<mat[0].length; j++){
        //         if(i==j){
        //             sum+=mat[i][j];
        //         }else if(i+j==mat.length-1){
        //             sum+=mat[i][j];
        //         }
        //     }
        // }
        for(int i=0; i<mat.length; i++){  //O(n)
            sum+=mat[i][i];
            if(i!=mat.length-1-i){
                sum+=mat[i][mat.length-1-i];
            }
        }
        return sum;
    }

    public static void main(String args[]){
        int mat[][] ={{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
        System.out.print(diagonalsum(mat));
        
    }
}