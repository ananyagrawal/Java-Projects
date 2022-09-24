package LEETCODE;

public class maxConsecutiveOnes {
    public int findMaxConsecutiveOnes(int[] nums) {
        int count=0, max_count=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==1)
                count++;
            else
                count=0;
            max_count=Math.max(max_count,count);
        }
        return max_count;
    }
}
