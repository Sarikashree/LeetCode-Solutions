// LeetCode 217: Contains Duplicate
// Approach: HashSet
// Time: O(n), Space: O(n)
class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashSet <Integer> set = new HashSet<>();
        for(int n:nums)
        {
            if(set.contains(n))
            {
                return true;
            }
            set.add(n);
        }
        return false;
    }
}
