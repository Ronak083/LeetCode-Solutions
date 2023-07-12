class Solution {
    public int countOdds(int low, int high) {
        int ans = 0;
        int i = (high - low);
        if(i%2==0){
            if(low%2 == 0){
                ans = i/2;
            } else ans = (i/2) +  1;
        } else ans = (i+1)/2;
        return ans;

    }
}