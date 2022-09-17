class Solution {
public:
    int maxSubArray(vector<int>& nums) {
       int mini= INT_MIN;
        int Currmaxi =0;
        
        for(int i =0; i<nums.size();i++){
        Currmaxi= Currmaxi+ nums[i];
            
            if(Currmaxi>mini)
            mini=Currmaxi;
            
            if(Currmaxi<0)
            Currmaxi = 0;
        }
        return mini;
    }
};