class Solution {
    public int[] decode(int[] encoded, int first) {
        int[] arr = new int[encoded.length + 1];
        int j = 0;
        arr[j++] = first;
        for(int i =0;i<encoded.length;i++){
            int x = encoded[i]^arr[i];
            arr[j++] = x;
        }
        return arr;

    }
}