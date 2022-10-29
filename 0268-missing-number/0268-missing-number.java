class Solution {
    public int missingNumber(int[] nums) {
        int Sum1 =0 , Sum2 = 0;
        
        for(int i =0 ; i<nums.length; i++){
            Sum1 += nums[i];
        }
        Sum2 = (nums.length)*(nums.length+1)/2;
        return Sum2-Sum1;
    }
}