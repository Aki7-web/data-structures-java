package GreedyAlgorithms;
import java.util.*;

public class FractionalKnapsack {//O(nlogn) dominated by sorting , O(n) is smaller compared to the other nlogn term
    //space complexity of O(n) for the 2d matrix created, having n rows and 2 cols, so O(2n)
    public static void main(String[] args) {
        int val[]={60,100,120};
        int weight[]={10,20,30};
        int W=50;

        //creating a matrix
        double  mat[][]=new double [val.length][2];
        for(int i=0;i<val.length;i++){
            double r= val[i]/(double)weight[i];
            mat[i][0]=r;
            mat[i][1]=i;
        }

        //sorting in respect to ratio of value/weight , the higher the more vit needs to be taken
        Arrays.sort(mat,Comparator.comparingDouble(o->o[0]));

        //now we want to take the weights more of the thing whos ratio is more, but since sorting is ascending so
        //we traverse the loop opposite way
        int cap= W;
        int maxVal=0;
        for(int i=mat.length-1;i>=0;i--){ //take i wrt mat that u made 
            int idx= (int)mat[i][1];
            if(cap>=weight[idx]){
                maxVal+=val[idx];
                cap=cap-weight[idx];
            }else{
                maxVal+=mat[i][0]*cap;
                break;
            }
        }

        System.out.println(maxVal);

    }
}

//UNDERSTAND THE DIFF BETWEEN WHERE TO USE IDX AND WHERE i OF MAT