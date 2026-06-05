

public class happynum {
    public static boolean happy(int n){
        while(n>9){
        int sum=0;
        while (n>0) {
            sum+= (n%10)*(n%10);
            n=n/10;
        }
        n=sum;
        
    }
    if(n==1 || n==7) {
        return true;
    }else{
        return false;
    }
    }

    public static void main(String[] args) {
        System.out.println(happy(42));
    }
}
