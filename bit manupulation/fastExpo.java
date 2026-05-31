public class fastExpo {

    public static int fastExpo(int a, int n){ //normal exponential O(n)= n
     // fast O(n)= logn as we iterate the number of time the bit is there in power which is logn + 1 max
        int ans=1;
        while(n>0){
            if((n&1)!=0){
                ans=ans*a;
            }
            a=a*a;
            n=n>>1;
        }
        return ans;
    }
    public static void main(String[] args) {
       System.out.println(fastExpo(3, 5));

    }
}
