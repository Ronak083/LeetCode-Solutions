class Solution {
    public int maximumWealth(int[][] accounts) {
        int max = 0;
        for(int i =0 ; i<accounts.length;i++){
            int wel = 0;
            for(int j =0 ; j<accounts[0].length;j++){
                wel += accounts[i][j];
            }
            if(wel>max) max = wel;
        }
        return max;        
    }
}