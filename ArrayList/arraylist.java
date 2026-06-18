package ArrayList;
//arraylist is a part of java collection framework
// is a class whose objects can be made
//it has dymanic memory unlike normal arrays
//it doesnt use primitive datatypes like int, char ,etc
//uses Integer, Boolean,Float, classes that start with capital letter.

import java.util.*;

public class arraylist {
    public static void main(String[] args) {
         ArrayList<Integer> list= new ArrayList<>(); //defined arraylist with name list, () constructor called

    //add method O(1)
    list.add(1);
    list.add(6);
    System.out.println(list);

    //add method O(n), when u add at an index and shift rest to right
    list.add(1, 7);
    System.out.println(list);

    //to get a element O(1)
    System.out.println(list.get(2));

    //remove elemtn O(n)
    list.remove(1);
    System.out.println(list);

    //set elemtn at index O(n)
    list.set(0,2);
    System.out.println(list);

    //contains elemtnt boolean O(n)
    System.out.println(list.contains(2));

    //size
    System.out.println(list.size());

    //swapping
    int temp=list.get(0);
    list.set(0,list.get(1));
    list.set(1, temp);
    System.out.println(list);

    //sorting
    Collections.sort(list);
    System.out.println(list);

    Collections.sort(list, Collections.reverseOrder()); //reverseOrder is comparator fxtn desc
    System.out.println(list);

    }
   


}
