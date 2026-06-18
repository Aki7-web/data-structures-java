package ArrayList;

import java.util.ArrayList;

public class twoDarrayList {
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> main= new ArrayList<>();

        ArrayList<Integer> list1= new ArrayList<>();
        ArrayList<Integer> list2= new ArrayList<>();
        ArrayList<Integer> list3= new ArrayList<>();

        for(int i=1;i<=5;i++){
            list1.add(i*1);
            list2.add(i*3);
            list3.add(i*5);
        }
        list2.remove(3);
        list2.remove(2);

        main.add(list1);
        main.add(list2);
        main.add(list3);

        System.out.println(main);

        for(int i=0; i<main.size();i++){
            ArrayList<Integer> curlist= main.get(i);
            for(int j=0;j<curlist.size();j++){
                System.out.print(curlist.get(j)+" ");

            }
            System.out.println();
        }

    }
}
