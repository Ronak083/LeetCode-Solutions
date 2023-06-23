class Solution {
    public boolean isPalindrome(int x) {
        int ori = x;
        int rem = 0;
        int rev = 0;

        if(x<0) return false;

        while(x != 0){
            rem = x % 10;
            rev = rev * 10 + rem;
            x /= 10;
        }

        if(rev == ori) return true;


        return false;
    }
}