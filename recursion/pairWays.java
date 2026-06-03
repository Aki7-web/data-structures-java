//FRIENDS PAIRING PROBLEM
//n friends in a party, can stay single or pair with another friend
//once paired cannot paired with someone else
    //total ways n people can be there

public class pairWays {
    public static int ways(int n){
        //base case
        if(n==1 || n==2) return n;

        //single
        int singleWays= ways(n-1);

        //paired
        int pairedWays= (n-1)*ways(n-2);

        int totWays= singleWays+pairedWays;
        return totWays;
    }

    public static void main(String[] args) {
        System.out.println(ways(4));
    }
}
