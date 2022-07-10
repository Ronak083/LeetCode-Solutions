class Solution {
public:
    int fib(int n) {
        if(n<=1) return n;
        int st = 0, nd = 1, rd = 1;
        for(int i =2; i<=n;i++){
            rd = st + nd;
            st = nd;
            nd = rd;
        }
        return rd;
    }
};