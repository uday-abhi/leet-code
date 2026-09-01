class Solution {
    public int maxSubArray(int[] nums) {
        int sum=0;
        int ans=Integer.MIN_VALUE;
        for(int i:nums){   
            if(sum<0) sum=0;
            sum+=i;
        ans=Math.max(ans,sum);
        }
        return ans;
    }
}