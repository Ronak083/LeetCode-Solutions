class Solution {
    public void setZeroes(int[][] matrix) {
        Set<Integer> x = new HashSet<>();
        Set<Integer> y = new HashSet<>();
        for(int i =0; i<matrix.length;i++){
            for(int j =0;j< matrix[0].length;j++){
                if(matrix[i][j]==0){
                    x.add(i);
                    y.add(j);
                }
            }
        }
        for (int i = 0; i < matrix.length; i++) {
      for (int j = 0; j < matrix[0].length; j++) {
        if (x.contains(i) || y.contains(j)) {
          matrix[i][j] = 0;
        }
      }
    }
    }
}