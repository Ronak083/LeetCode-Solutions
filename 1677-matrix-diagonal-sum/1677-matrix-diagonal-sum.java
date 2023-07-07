class Solution {
    public int diagonalSum(int[][] mat) {
        int ans = 0;
        int len = mat.length;

        
        for(int i =0;i<len;i++){
            ans += mat[i][i] + mat[i][len-i-1];
        }
        if(len%2!=0) {
            int mid = (len-1)/2;
            ans -= mat[mid][mid];
        }


        return ans;
        
    }
}