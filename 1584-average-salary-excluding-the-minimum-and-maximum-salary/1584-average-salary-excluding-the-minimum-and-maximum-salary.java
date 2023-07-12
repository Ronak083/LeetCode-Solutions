class Solution {
    public double average(int[] salary) {
        Arrays.sort(salary);
        int k =0;
        double sum =0;
        for(int i = 1 ;i<salary.length-1;i++){
            sum += salary[i];
            k++;
        }              
        return sum/k ;
    }
}