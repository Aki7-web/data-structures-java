import java.util.*;

public class transpose{
    public static void transpose(int mat[][]){
        int row=mat.length; int col=mat[0].length;
        int trans[][]= new int [col][row];
        for(int i=0;i<col; i++){
            for(int j=0; j<row; j++){
                trans[i][j]=mat[j][i];
            }
        }

        for(int i=0; i<trans.length;i++){
            for(int j=0; j<trans[0].length;j++){
                System.out.print(trans[i][j]+" ");
            }
            System.out.println();
        }
        
    }

    // public static void print(int mat[][]){
    //     for(int i=0; i<mat.length; i++){
    //         for(int j=0; j<mat[0].length; j++){
    //             System.out.print(mat[i][j]+" ");
    //         }
    //         System.out.println();
    //     }
    // }

    public static void main(String args[]){
        int mat[][]={{1,4,9}
                    ,{11,4,3}
                    ,{2,2,3}};
        transpose(mat);
    }
}