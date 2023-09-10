class Solution {
    public int singleNonDuplicate(int[] nums) {
        int low = 0 ;
        int high = nums.length/2;

        while ( low < high){
            int mid = (low + high)/2;

            if(nums[mid * 2] == nums[mid * 2 + 1]){
                low = mid + 1;
            }
            else high = mid ;
            
        }
        return nums[low * 2];
    }

    
}