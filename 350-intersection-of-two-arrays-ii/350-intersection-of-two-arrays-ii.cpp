class Solution {
public:
    vector<int> intersect(vector<int>& nums1, vector<int>& nums2) {
        vector<int> ans;
        int m = nums1.size();
        int n = nums2.size();
        int i =0, j=0;
        sort(begin(nums1), end(nums1));
        sort(begin(nums2), end(nums2));
        
        while(i<m && j<n){
             if(nums1[i] == nums2[j]){
                 ans.push_back(nums1[i]);
                 i++;
                 j++;
             }
            else if(nums1[i]>nums2[j]){
                j++;
            }
            
            else i++;
        }
        return ans;       
    }
};