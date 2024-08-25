# BUY AND SELL STOCK (I-IV)
I have studied and analysed buy and sell stocks problem series from 1-4. For all the cases you can only keep one stock with you, meaning you are not allowed to buy until you sell the one that you have.
1. **Buy and Sell Stock-1** : You can perform only 1 transaction.
2. **Buy and Sell Stock-2** : You can perform any number of transactions.
3. **Buy and Sell Stock-3** : You can perform atmost 2 transactions.
4. **Buy and Sell Stock-4** : You can perform atmost k transactions.
## Buy and Sell Stock-1 
You can perform only one transaction i.e buy once and then sell it again.Idea is that, say you are selling it ont ith day , it means you should have bought it on any day before that ith day on which day the stock had least price.
## Buy and Sell Stock-2
You can perform any number transactions (BSBSBS... but not BBBSSSBBSS).So on each day you have the choice to buy or sell.
1. Buy : If you are allowed to buy then you have two options : either buy or not buy.
2. Sell : If you are allowed to sell then you have two option : either sell or not sell. <br/>So the pseudocode would be,<br/>
   if(canBuy) {
     profit=max(-prices[i]+f(i+1,!canBuy),0+f(i+1,canBuy));
   } else {
      profit=max(prices[i]+f(i+1,!canBuy),0+f(i+1,canBuy));
   }
## Buy and Sell Stock-3
In this case you are limited by number of transactions you do.You can only do atmost 2 transactions.<br/>
 if(trans==0) return 0;
 if(canBuy) {
     profit=max(-prices[i]+f(i+1,!canBuy,trans),0+f(i+1,canBuy,trans));
   } else {
      profit=max(prices[i]+f(i+1,!canBuy,trans-1),0+f(i+1,canBuy,trans));
   }
## Buy and Sell Stock-4
Here you can perform atmost k transactions.<br/>
 if(trans==0) return 0;
    if(canBuy) {
     profit=max(-prices[i]+f(i+1,!canBuy,trans),0+f(i+1,canBuy,trans));
   } else {
      profit=max(prices[i]+f(i+1,!canBuy,trans-1),0+f(i+1,canBuy,trans));
   }
