class Solution {
    public double myPow(double x, int n) {
        //if (x < -10000 || x > 10000) {
        //    return 0;
        //}
        //if(n==1) {
        //    return x;
        //} else if(n==0){
        //    return 1.00000;
        //} else if(n<=0){
        //    return 1/x*myPow(x,n+1);
        //}
        //return x * myPow(x,n-1);
        return Math.pow(x, n); 

    }
}