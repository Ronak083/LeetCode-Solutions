class Solution {
    public char findTheDifference(String s, String t) {
        int total = 0;
        for(int i =0;i<s.length();i++){
            total += t.charAt(i);
            total -= s.charAt(i);
        }
        total += t.charAt(s.length());

        return (char)total;
      

        
    }
}