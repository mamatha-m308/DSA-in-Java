// LC 121

class Solution {
    public int maxProfit(int[] prices) {
        int min =prices[0];    //initially 1st element of the array is min 
        int max=0;
        for(int i=1; i<prices.length; i++ ){   // i from 1 to n
        if(prices[i]<min){                   // if prices[i] if less then  min (min will updated)the min will replace with prices[i]
            min=prices[i];                    
        }
       int maxprofit=prices[i]-min;         // subtract from prices[i](curent i th)  to min to get max profit
        if(maxprofit>max){                  // if max profit is grater then max then it will replace with maxprofit
            max=maxprofit;
        }

        }
        return max;

    }
}
