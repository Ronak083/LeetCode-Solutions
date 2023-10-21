class Solution {
    public String mergeAlternately(String word, String word2) {
        int size = 0;
        if(word.length() <= word2.length()){
            size = word2.length();
        } else size = word.length();

        String s = "";

        for(int i = 0; i<size;i++){

            if(i<word.length()){
                s += word.charAt(i);
            } 
            if(i<word2.length()){
                s += word2.charAt(i);
            }
        }

        return s;
    }
}