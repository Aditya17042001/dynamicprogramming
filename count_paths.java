//without DP
class Solution {
   // public static final long
   public int countPaths(int i,int j){
       if(i==0&&j==0) return 1;
       if(i<0||j<0) return 0;
       int left=countPaths(i-1,j);
       int right=countPaths(i,j-1);
       return left+right;
   }
    public int uniquePaths(int m, int n) {
        return countPaths(m-1,n-1);
    }
}
// with Dp
class Solution {
   // public static final long
   public int countPaths(int i,int j,int[][]dp){
       if(i==0&&j==0) return dp[i][j]=1;
       if(i<0||j<0) return 0;
       if(dp[i][j]!=-1) return dp[i][j];
       int left=countPaths(i-1,j,dp);
       int right=countPaths(i,j-1,dp);
       return dp[i][j]=left+right;
   }
    public int uniquePaths(int m, int n) {
        int[][] dp=new int[m][n];
        for(int[] columns :dp)
        Arrays.fill(columns,-1);
        return countPaths(m-1,n-1,dp);
    }
}
