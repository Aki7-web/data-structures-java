package GreedyAlgorithms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class ActivitySelectionWithoutSortingEnd {
    //now we have to sort the end times of the activites
    public static void main(String[] args) {
        int start[]={1,3,0,5,8,5};
        int end[]={2,4,6,7,9,9};

        //sorting //first creating a 2d array with index start and end time as 3 cols
        int act[][]= new int[start.length][3];
        for(int i=0; i<start.length;i++){
            act[i][0]=i;
            act[i][1]=start[i];
            act[i][2]=end[i];
        }

        //now sorting wrt 3rd col
        Arrays.sort(act,Comparator.comparingDouble(o->o[2]));

        //initialising
        int maxAct=0;
        ArrayList<Integer> ans= new ArrayList<>();


        //wrt matrix now after sorting
        maxAct=1;
        ans.add(act[0][0]);
        int lastEnd= act[0][2];

        for(int i=1; i<end.length;i++){
            if(act[i][1]>=lastEnd){ //start time
                //new activity
                maxAct++;
                ans.add(act[i][0]); //index of ith row in the sorted matrix
                lastEnd=act[i][2]; //end time of ith row of sorted matrix
            }
        }

        System.out.println("max number of acts="+maxAct);
        for(int i=0; i<ans.size();i++){
            System.out.print("A"+ans.get(i)+" ");
        }



    }
}
