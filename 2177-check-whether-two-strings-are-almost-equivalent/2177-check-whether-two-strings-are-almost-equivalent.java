class Solution {
    public boolean checkAlmostEquivalent(String word1, String word2) {
        HashMap<Character, Integer> map1= new HashMap<>();
        HashMap<Character, Integer> map2 =new HashMap<>();
        int n= word1.length();
        
        for(int i=0;i<n;i++){
            char c=word1.charAt(i);
            char d=word2.charAt(i);
            map1.put(c,map1.getOrDefault(c,0)+1);
            map2.put(d, map2.getOrDefault(d,0)+1);   
        }     

        for(char k: map1.keySet()){
            if(!map2.containsKey(k)) map2.put(k,0);
            if(map1.get(k)-map2.get(k)>3) return false;
        }

        for(char d: map2.keySet()){
            if(!map1.containsKey(d)) map1.put(d,0);
            if(map2.get(d)-map1.get(d)>3) return false;
        }
        
        return true;
    }
}