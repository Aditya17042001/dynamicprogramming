import java.util.* ;
import java.io.*; 
public class Solution {
    public static boolean f(int ind,int target,int[] arr,int[][] dp){
        if(target==0) return true;
        if(dp[ind][target]!=-1) return dp[ind][target]==0?false:true;
        if(ind==0) return arr[0]==target;
        boolean notTake=f(ind-1,target,arr,dp);
        boolean take=false;
        if(arr[ind]<=target)
        take=f(ind-1,target-arr[ind],arr,dp);
        dp[ind][target]=take||notTake?1:0;
        return take||notTake;
    }
    public static boolean subsetSumToK(int n, int k, int arr[]){
        int[][] dp=new int[n][k+1];
        for(int[] row:dp)
         Arrays.fill(row,-1);
       return f(n-1,k,arr,dp);
    }
}
