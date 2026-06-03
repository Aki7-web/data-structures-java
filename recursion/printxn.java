public class printxn {

    public static int printxpown(int x, int n){  //O(n) time complexity BAD
        if(n==1) return x;
        return x*printxpown(x, n-1);
    }

    public static int printxn(int x, int n){ // good time complx O(logn)base 2
        if (n==1) return x;                //since power is halfing so time complexity and number of levels reduced
        
      //  if(n%2==0) return printxn(x, n/2)*printxn(x, n/2); here two times fx will be called so time complexity wont get better it would remain O(n)
        int halfPow= printxn(x, n/2); //this makes  the recursive call only once and hense saves time
         if(n%2==0) return halfPow*halfPow; //same var called twice thus optimised


        return x*halfPow*halfPow;
    }
    public static void main(String[] args) {
        System.out.println(printxn(2, 11));
    }
}
