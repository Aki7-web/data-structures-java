import java.util.*;

public class sum{ //sim of 1 to n

    public static int sum(int n){ //time compl O(n)
        if (n==1){                  // space comp O(n) in each stack fram a new n
            return 1;
        }
        return n+sum(n-1);
    }

    public static void main(String[] args) {
        System.out.println(sum(5));
    }
}