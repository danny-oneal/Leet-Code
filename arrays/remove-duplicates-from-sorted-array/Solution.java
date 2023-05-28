class Solution {
    public int removeDuplicates(int[] nums) {
        // [-1, 0, 2, 2, 3]
        int newIndex = 1;
        for (int i = 1; i < nums.length; i++) {
            if(nums[i - 1] != nums[i]) {
                nums[newIndex] = nums[i];
                newIndex++;
            }
        }
        return newIndex;
    }
}