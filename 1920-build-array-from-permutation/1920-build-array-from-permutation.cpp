class Solution {
public:
    vector<int> buildArray(vector<int>& nums) {
    vector<int> ans;
        int a = 0;
        
    for(int i=0; i<nums.size();i++){
        a = nums[nums[i]];
        ans.push_back(a);
    }
        return ans;
    
    }
};