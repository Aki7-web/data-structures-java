//no . of way to place 2 x 1 tiles in a 2 x n flooe in horz  or vert ways.

public class tiling{
    public static int tiling(int n){  // floor 2 x n , tile 2 x 1

        //base case
        if(n==0 || n==1) return 1;

        //vertical
        int verticalWays= tiling(n-1);

        //horizontal
        int horizontalWays= tiling(n-2); //like fibonacci

        int totWays= verticalWays+horizontalWays;
        return totWays;
    }

    public static void main(String[] args) {
        System.out.println(tiling(5));
    }
}