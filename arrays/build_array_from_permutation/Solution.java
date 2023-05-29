package build_array_from_permutation;

class Solution {
    public static int[] buildArray(int[] nums) {
        int[] ans = new int[nums.length];

        for(int i = 0; i < nums.length; i++) {
            ans[i] = nums[nums[i]];
        }

        return ans;
    }

    public static void main(String[] args) {
        int[] testArr = {2, 4, 5, 5};
        System.out.println(buildArray(testArr));
    }
}