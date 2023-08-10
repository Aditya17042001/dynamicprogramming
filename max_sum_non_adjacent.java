class Solution {
    public int f(int i,int[] nums){
        if(i==0) return nums[i]; //it means you have reached a state where ////you decided to pick 0th index house/element
        if(i<0) return 0;
        int pick=nums[i]+f(i-2,nums);
        int notpick=0+f(i-1,nums);
        return Math.max(pick,notpick);
    }
    public int rob(int[] nums) {
        return f(nums.length-1,nums);
    }
}
