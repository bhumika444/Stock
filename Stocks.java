import java.util.*;
class Stocks {
        public int maxProfit(int[] prices) {
        int n=prices.length;
        int profit=0;
        int buy=prices[0];
        for(int i=1;i<n;i++)
        {
            if(buy>prices[i])
            {
                buy=prices[i];
            }
            else if(prices[i]-buy > profit)
            {
                profit=prices[i]-buy;
            }
            // profit=sell-buy;
        }
        return profit;
        // return n;
    }
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] prices=new int[n];
        for(int i=0;i<n;i++)
        {
            prices[i]=sc.nextInt();
        }
        Stocks stockpredict=new Stocks();
        int maxProfit=stockpredict.maxProfit(prices);
        System.out.println("Maximum Profit: " + maxProfit);


    }
}