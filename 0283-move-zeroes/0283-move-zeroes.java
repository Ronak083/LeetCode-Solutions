class Solution {
    public void moveZeroes(int[] nums) {
        int snowBall = 0;
        for(int i = 0 ;i<nums.length;i++){
            if(nums[i]==0){
                snowBall++;    
            }
            else if(snowBall>0){              
                
                nums[i-snowBall] = nums[i];
                nums[i] = 0;
            }
        }
        
    }
}