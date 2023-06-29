class Solution {
    public int[] shuffle(int[] nums, int n) {
            int size = 2*n;
            int[] ans = new int[size];
            int j=0;
            for(int i =0;i<n;i++){
                ans[j++] = nums[i];  
                ans[j++] = nums[i+n];              
            }
            return ans;
    }
}