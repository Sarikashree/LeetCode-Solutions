// LeetCode 53: Maximum Subarray
// Approach: Kadane's Algorithm
// Time Complexity: O(n)
// Space Complexity: O(1)
class Solution {
    public int maxSubArray(int[] nums) {
        int maxSum=nums[0];
        int currentSum=0;
        for(int n:nums)
        {
            currentSum+=n;
            if(currentSum>maxSum)
            {
                maxSum=currentSum;
            }
            if(currentSum<0)
            {
                currentSum=0;
            }
        }
        return maxSum;
    }
}
