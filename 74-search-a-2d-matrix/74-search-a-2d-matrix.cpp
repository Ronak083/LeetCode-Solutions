class Solution {
public:
    bool searchMatrix(vector<vector<int>>& matrix, int target) {
    int n = matrix.size();
        int m = matrix[0].size();
        int le = 0, ri = m-1;
        
        while(le < n && ri > -1){
            int cur = matrix[le][ri];
            if(cur==target) return true;
            else if(cur > target) ri--;
            else le++;
        }
        
        return false;
       
    }
};