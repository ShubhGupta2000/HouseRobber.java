// HOUSE ROBBER
class Solution {
    public int rob(int[] nums) {
        int pre=0;
        int curr=0;
        for(int i=0;i<nums.length;i++){
            int tem=Math.max(nums[i]+pre,curr);
            pre=curr;
            curr=tem;
        }
        return curr;
    }
}
