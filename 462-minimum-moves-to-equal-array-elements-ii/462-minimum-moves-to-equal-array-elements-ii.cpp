class Solution {
public:
    int minMoves2(vector<int>& nums) {
        /*int n = nums.size();
        int ran = 0 ;
        for(int i =0; i< n;i++){
          ran += nums[i];
        }
        
        int average = 0;
        
        if(ran%2==0) average = ran/n;
        else average = (ran-1)/n;
        
        int count = 0;
        for(int i = 0 ; i < n ; i++){
            while(nums[i]>average){
                count++;
                nums[i] = nums[i]-1;
            }
            
            while(nums[i] < average){
                count++;
                nums[i] = nums[i]+1;
            }
        }
        return count;*/
        
    
        int n = nums.size ();
        sort (nums.begin(), nums.end());
        int mid = n/2, i = 0, count = 0;
        for (i = 0; i < n; i++)
            count += abs (nums [i] - nums [mid]);
        return count;
    }
};