class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> res = new ArrayList<>();
        if(matrix.length == 0 || matrix[0].length == 0) return res;

        int top =0;
        int bot = matrix.length-1;

        int left = 0;
        int right = matrix[0].length-1;

        while(true){
            for(int i = left;i<= right;i++) res.add(matrix[top][i]);
            top++;
            if(left > right || top > bot) break;

            for(int i = top;i<= bot;i++) res.add(matrix[i][right]);
            right--;
            if(left > right || top > bot) break;

            for(int i = right;i>= left;i--) res.add(matrix[bot][i]);
            bot--;
            if(left > right || top > bot) break;

            for(int i = bot;i>= top;i--) res.add(matrix[i][left]);
            left++;
            if(left > right || top > bot) break;
        }        
        return res;
    }
}