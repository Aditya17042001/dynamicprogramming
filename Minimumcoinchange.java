class Solution {
    public int minCoinChange(int i,int t,int[] coins,List<Integer> ds){
        if(i==0){
          if(t%coins[i]==0) return t/coins[i]+ds.size();
          return Integer.MAX_VALUE;
        }
        int notTake=minCoinChange(i-1,t,coins,ds);
        int take=Integer.MAX_VALUE;
        if(coins[i]<=t){
        ds.add(coins[i]);
        take=minCoinChange(i,t-coins[i],coins,ds);
        ds.remove(ds.size()-1);}
        return take<notTake?take:notTake;
    }
    public int coinChange(int[] coins, int amount) {
        List<Integer> ds=new ArrayList<Integer>();
        int result= minCoinChange(coins.length-1,amount,coins,ds);
        if(result==Integer.MAX_VALUE) return -1;
        return result;
    }
}
