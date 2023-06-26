class Solution {
    public String mergeAlternately(String word1, String word2) {
        int n = word1.length();
        int m = word2.length();
        String result = "";
        int size;
        if(n>m) size =n ;
        else size = m;

        for(int i = 0; i<size; i++){
            if(i<n) result += word1.charAt(i);
            if (i<m)result += word2.charAt(i);
        }

        return result;
    }
}