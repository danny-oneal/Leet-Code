package dp;

public class JumpGame {
    public boolean canJump(int[] nums) {
        int lastGoodIdx = nums.length - 1;

        for(int i = lastGoodIdx; i < nums.length; i--) {
            if(i + nums[i] >= lastGoodIdx) {
                lastGoodIdx = i;
            }
        }

        return lastGoodIdx == 0;
    }
}
