
//Without DP
class Solution {
    public int uniquePaths(int i,int j,int[][] obstacleGrid){
         if(i>=0&&j>=0&&obstacleGrid[i][j]==1) return 0;
          if(i<0||j<0) return 0;
        if(i==0&&j==0) return 1;
        int up=uniquePaths(i-1,j,obstacleGrid);
        int left=uniquePaths(i,j-1,obstacleGrid);
        return up+left;
      
       
    }
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        int m=obstacleGrid[0].length;
        int n=obstacleGrid.length;
        return uniquePaths(n-1,m-1,obstacleGrid);
    }
}
// with Dp
class Solution {
    public int uniquePaths(int i,int j,int[][] obstacleGrid,int[][] dp){
         if(i>=0&&j>=0&&obstacleGrid[i][j]==1) return dp[i][j]=0;
         
          if(i<0||j<0) return 0;
          if(dp[i][j]!=-1) return dp[i][j];
        if(i==0&&j==0) return dp[i][j]=1;
        int up=uniquePaths(i-1,j,obstacleGrid,dp);
        int left=uniquePaths(i,j-1,obstacleGrid,dp);
        return dp[i][j]=up+left;
      
       
    }
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        int m=obstacleGrid[0].length;
        int n=obstacleGrid.length;
        int[][] dp=new int[n][m];
        for(int[]column:dp)
        Arrays.fill(column,-1);
        return uniquePaths(n-1,m-1,obstacleGrid,dp);
    }
}
