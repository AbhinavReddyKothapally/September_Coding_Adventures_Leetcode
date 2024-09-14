class Solution {
    public int longestSubarray(int[] nums) {
        int max=0;
        for(int i=0;i<nums.length;i++)
        max=Math.max(nums[i],max);
        int count=1,ans=1;
        for(int i=0;i+1<nums.length;i++)
        {
            if(nums[i]==max && nums[i+1]==max)
            count++;
            else
            {
                ans=Math.max(ans,count);
                count=1;
            }
        }
        return Math.max(ans,count);

    }
}
