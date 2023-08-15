// without Dp
class Solution {
    public int minPath(int i,int j,int[][] grid){
         if(i<0||j<0) return (int)Math.pow(10,9);
        if(i==0&&j==0) return grid[0][0];
      int up=grid[i][j]+minPath(i-1,j,grid);
      int left=grid[i][j]+minPath(i,j-1,grid);

        return Math.min(up,left);
    }
    public int minPathSum(int[][] grid) {
        int m =grid.length-1;
        int n=grid[0].length-1;
        return minPath(m,n,grid);
    }
}
// with Dp
class Solution {
    public int minPath(int i,int j,int[][] grid,int[][] dp){
         if(i<0||j<0) return (int)Math.pow(10,9);
        if(i==0&&j==0) return dp[i][j]=grid[0][0];
        if(dp[i][j]!=-1) return dp[i][j];
      int up=grid[i][j]+minPath(i-1,j,grid,dp);
      int left=grid[i][j]+minPath(i,j-1,grid,dp);

        return dp[i][j]=Math.min(up,left);
    }
    public int minPathSum(int[][] grid) {
        int m =grid.length-1;
        int n=grid[0].length-1;
        int[][] dp=new int[m+1][n+1];
        for(int[]columns :dp)
        Arrays.fill(columns,-1);
        return minPath(m,n,grid,dp);
    }
}
// with DP using Tabulation
class Solution {
 
    public int minPathSum(int[][] grid) {
        int m =grid.length;
        int n=grid[0].length;
        int[][] dp=new int[m+1][n+1];
       dp[0][0]=grid[0][0];
         for(int i=1; i<m; i++){
            dp[i][0] = grid[i][0] + dp[i-1][0];
        }
        for(int i=1; i<n; i++){
            dp[0][i] = grid[0][i] + dp[0][i-1];
        }

       for(int i=1;i<m;i++){
           for(int j=1;j<n;j++){
               int up=grid[i][j]+dp[i-1][j];
               int left=grid[i][j]+dp[i][j-1];
               dp[i][j]=Math.min(up,left);
           }
       }
       return dp[m-1][n-1];
    }
}
