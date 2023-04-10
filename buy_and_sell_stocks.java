
public class buy_and_sell_stocks { 
    public static int buyAndSellStocks(int prices[]){
          int buyPrize=Integer.MAX_VALUE; 
          int maxProfit=0 ;
          for(int i=0;i<prices.length;i++){
            if(buyPrize<prices[i]){
                int profit=prices[i]-buyPrize; 
                maxProfit=Math.max(maxProfit,profit); 
            } 
            else{
                buyPrize=prices[i];
            }
          }   
          return maxProfit;


    }
    public static void main(String []args){
   int prices[]={7,1,5,3,6,4}; 
   System.out.println(buyAndSellStocks(prices));
    }
}
