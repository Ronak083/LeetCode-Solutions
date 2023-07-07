class Solution {
    public boolean isRobotBounded(String instructions) {
        int x =0, y=0;
        char[] arr= {'N','W','S','E'}; //1,2,3,4
        int dic = 1;
        for(int i =0;i<instructions.length();i++){
            
            if(instructions.charAt(i) == 'G'){
                if(dic == 1) x++;
                else if(dic==3) x--;
                else if(dic == 2) y--;
                else if(dic == 4) y++;
            } else if(instructions.charAt(i)=='L'){
                if(dic == 4 ) dic = 1;
                else dic++; 
            } else if(instructions.charAt(i)=='R'){
                if(dic == 1 ) dic = 4;
                else dic--; 
            }
        }

        if(x==0 && y==0) return true;
        if(dic ==1) return false;

        return true;
    }
}