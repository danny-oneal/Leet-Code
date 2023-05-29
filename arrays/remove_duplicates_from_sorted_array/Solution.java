package remove_duplicates_from_sorted_array;

class Solution {
    public int removeDuplicates(int[] nums) {
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


/*

    // [-1, 0, 2, 2, 3]

    newIndex        1
    i               1

    newIndex        2
    i               2







 */