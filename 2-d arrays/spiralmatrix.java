import java.util.*;

public class spiralmatrix{
    public static void printSpiral(int mat[][]){
        int startRow=0;
        int startCol=0;
        int endRow= mat.length-1;
        int endCol=mat[0].length-1;

        //printing spiral first top, then right then bottom then left then update values

        while(startRow<=endRow && startCol<=endCol){

        //top
        for(int j=startCol; j<=endCol; j++){
            System.out.print(mat[startRow][j]+" ");
        }

        //right
        for(int i=startRow+1; i<=endRow; i++){
            System.out.print(mat[i][endCol]+" ");
        }

        //bottom
        for(int j=endCol-1; j>=startCol; j--){
            if(startRow==endRow){
                break;
            }
            System.out.print(mat[endRow][j]+" ");
        }

        //left
        for(int i=endRow-1; i>=startRow+1; i--){
            if(startCol==endCol){
                break;
            }
            System.out.print(mat[i][startCol]+" ");
        }

        System.out.println();

        startRow++;
        startCol++;
        endRow--;
        endCol--;

    }

    }

    public static void main(String args[]){
        int mat[][]={{1,2,3,4},
                    {5,6,7,8},
                    {9,10,11,12},
                    {13,14,15,16}};
        printSpiral(mat);
    }

}