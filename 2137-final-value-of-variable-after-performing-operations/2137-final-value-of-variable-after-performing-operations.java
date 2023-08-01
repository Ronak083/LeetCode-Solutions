class Solution {
    public int finalValueAfterOperations(String[] operations) {
        int x = 0;
        char c = '+';
        for(int i = 0; i<operations.length; i++){
            String m = operations[i];
            if( m.charAt(0) =='+' || m.charAt(2) =='+') x++;
            else x--;
        }
        return x;
    }
}