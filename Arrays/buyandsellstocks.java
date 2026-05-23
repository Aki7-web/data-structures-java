import java.util.*;

public class buyandsellstocks {
    public static int stocks(int stock[]){
        int buyPrice=Integer.MAX_VALUE;
        int maxProfit=0;

        for(int i=0; i<stock.length;i++){
            if(buyPrice<stock[i]){
                int profit= stock[i]-buyPrice;
                maxProfit=Math.max(profit, maxProfit);
            }else{
                buyPrice=stock[i];
            }
        }

        return maxProfit;
 
    }

    public static void main(String args[]){
        int stock[]={7,6,4,3,1};
        System.out.println(stocks(stock));
    }

}
