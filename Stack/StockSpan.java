package Stack;
import java.util.Stack;

//max number of consecutive days for whoch prices are less than todays price is span of a stock

public class StockSpan {

    public static void stockSpan(int stock[],int span[]){
        Stack<Integer> s= new Stack<>();
        span[0]=1;

        s.push(0);

        for(int i=1;i<stock.length;i++){
            int currPrice= stock[i];
            while (!s.isEmpty() && currPrice > stock[s.peek()]) {
                s.pop();
            }
            if(s.isEmpty()){
                span[i]=i+1;
            }else{
                int prevHigh= s.peek();
                span[i]=i-prevHigh;
            }

            s.push(i);
        }
    }
    public static void main(String[] args) {
        int stock[]={100,80,60,70,80,85,100};
        int span[]=new int[stock.length];
        stockSpan(stock,span);

        for(int i=0;i<stock.length;i++){
            System.out.print(span[i]+" ");
        }
    }
}
