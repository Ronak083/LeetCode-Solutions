class Solution {
    public int pivotIndex(int[] nums) {
        int lsum[] = new int[nums.length]; // left sum arrray of length nums
        int rsum[] = new int[nums.length]; // right sum arrayof length nums
        lsum[0]=nums[0];
        rsum[nums.length-1] = nums[nums.length-1];
        for(int i=1; i<nums.length ;i++){
            lsum[i] = lsum[i-1] + nums[i]; //adding nums[i] in lsum array
        }
        for(int i=nums.length-2; i>=0; i--){
            rsum[i] = rsum[i+1] + nums[i]; //adding nums[i] in rsum array
        }
        for(int i=0; i<nums.length;i++){
            if(lsum[i]==rsum[i])//checking if index is same or not, if same,
            return i; //return that index
        }
        return -1;
        
    }
}