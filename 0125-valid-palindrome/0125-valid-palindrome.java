class Solution {
    public boolean isPalindrome(String s) {
        if(s.length()==0 || s.length()==1) return true;
        s = s.toLowerCase();
        
        int start = 0;
        int end = s.length()-1;  

        while(start<=end){
            char i = s.charAt(start);
            char j = s.charAt(end);

            if(!Character.isLetterOrDigit(i)) start++;
            else if(!Character.isLetterOrDigit(j)) end--;
            else {
                if(i !=j) return false;
                start++;
                end--;
            }
        }   
        return true;
    }

    public static String removeNonAlphanumeric(String str)
    {        
        str = str.replaceAll("[^a-zA-Z0-9]", ""); 
        return str;
    }
}