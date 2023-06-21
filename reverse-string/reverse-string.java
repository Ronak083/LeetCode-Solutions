class Solution {
    public void reverseString(char[] s) {
        int a = 0;
        int b = s.length-1;
        char temp;
        
        for(int i =0;i<s.length/2;i++){
            temp = s[a];
            s[a] = s[b];
            s[b] = temp;
            a++;
            b--;
        }
        
    }
}