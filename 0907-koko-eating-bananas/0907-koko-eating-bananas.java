class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int low = 1 ;
        int high = Arrays.stream(piles).max().getAsInt();
        int ans = 0;
        while(low <= high){
            int mid = (low + high)/2;
            int th = fun(piles, mid);

            if(th <= h){
                ans = mid;
                high = mid - 1;
            } else{
                low = mid + 1;
            }
        }

        return ans;
        
    }
    private int fun(int[] piles, int k){
        int th = 0;
        for(int i = 0; i<piles.length;i++){
            th += Math.ceil((double)piles[i]/(double)k);
        }        
        return th;
    }
}