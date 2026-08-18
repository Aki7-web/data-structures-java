package GreedyAlgorithms;
import java.util.*;

//to find a way to cover the max number of activities with a given start and end time, u cant perform two activites
//at the same time
//here the activites are "end time sorted" which needs to be done in case not already done

public class ActivitySelection {
    public static void main(String[] args) {
        int start[]={1,3,0,5,8,5};
        int end[]={2,4,6,7,9,9};

        //end time basis sorted ----next code will be for if the end time wasnt sorted
        int maxAct=0;
        ArrayList<Integer> ans= new ArrayList<>();

        //1st activity the 1st index activity ofcourse as its end time is least so it will be finished fast
        //add the index of the activites to the arraylist
        maxAct=1;
        ans.add(0);
        int lastEnd= end[0];

        for(int i=1; i<end.length;i++){ //O(n) time complx
            if(start[i]>=lastEnd){
                //new activity
                maxAct++;
                ans.add(i);
                lastEnd=end[i];
            }
        }

        System.out.println("max number of acts="+maxAct);
        for(int i=0; i<ans.size();i++){
            System.out.print("A"+ans.get(i)+" ");
        }
    }
}
