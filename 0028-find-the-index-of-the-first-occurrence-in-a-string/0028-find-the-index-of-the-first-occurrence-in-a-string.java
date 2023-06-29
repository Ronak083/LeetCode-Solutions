class Solution {
    public int strStr(String haystack, String needle) {
        if(needle.length()>haystack.length()) {return -1;}   
        for(int i = 0; i<=haystack.length()-needle.length();i++){
            int nindex = 0;            
            while(nindex<needle.length() && haystack.charAt(i+nindex)==needle.charAt(nindex)){
                nindex++;
                if(nindex==needle.length()) return i;
            }
        }
        return -1;
    }
}