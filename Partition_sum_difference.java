public class Solution {
    public static int minSubsetSumDifference(int []arr, int n) {
        int arrsize=arr.length;
        int totalSum=0;
        for(int i=0;i<arrsize;i++)
         totalSum+=arr[i];
       boolean[][] dp=new boolean[arrsize][totalSum+1];
       for(int ind=0;ind<arrsize;ind++)
        dp[ind][0]=true;
       if(arr[0]<=n)dp[0][arr[0]]=true;
        for(int ind=1;ind<arrsize;ind++){
            for(int target=1;target<=totalSum;target++){
                boolean notTake=dp[ind-1][target];
               boolean take=false;
                if(arr[ind]<=target)
                take=dp[ind-1][target-arr[ind]];
                dp[ind][target]=take||notTake;
            }
        }
       
        int min=(int)Math.pow(10,9);
        for(int i=0;i<=totalSum;i++){
            if(dp[arrsize-1][i]==true)
               min=Math.min(min,Math.abs((totalSum-i)-i));
        }
        return min;
    }
}
