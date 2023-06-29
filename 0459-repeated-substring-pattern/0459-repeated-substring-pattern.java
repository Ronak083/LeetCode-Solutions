class Solution {
    public boolean repeatedSubstringPattern(String s) {
         int l = s.length();
         String sub = "";
         String myS = "";
         for(int i = 1; i<=l/2;i++){
             if(l%i==0){
                 int m = l/i;
                 sub = s.substring(0,i);
                 for(int j =0;j<m;j++){
                     myS += sub;
                 }
                 if(myS.equals(s)) return true;
                 sub = "";
                 myS = "";
            }

         }
         return false;
    }
}