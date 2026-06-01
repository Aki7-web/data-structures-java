public class fibbonacci {
    public static int fibo(int n){
        if(n==0 || n==1){ //max n to 1 level stack can be there so space complexity O(n)
            return n;   // time complexity exponential O(2^n)
        }
        return fibo(n-1)+fibo(n-2);
    }

    public static void main(String[] args) {
        System.out.println(fibo(6));
    }
}
