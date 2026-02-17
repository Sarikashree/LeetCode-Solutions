class Solution {
    public void sortColors(int[] nums) {
        int left=0;
        int right=nums.length-1;
        while(left<=right)
        {
            if(nums[left]==0)
            {
                left++;
            }
            else
            {
                int temp=nums[left];
                nums[left]=nums[right];
                nums[right]=temp;
                right--;
            }
        }
        right=nums.length-1;
        while(left<=right)
        {
            if(nums[left]==1)
            {
                left++;
            }
            else
            {
                int temp=nums[left];
                nums[left]=nums[right];
                nums[right]=temp;
                right--;
            }
        }
    }
}
