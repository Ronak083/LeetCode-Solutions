class Solution {
public:
    int firstUniqChar(string s) {
        unordered_map<string , int> ht;
        int n = s.length();
        
        for( int i =0; i<n;i++){
            bool ronak = false;
                   for( int j =0; j<n;j++){
                          if(s[i]==s[j] && i!=j) {
                          ronak = true;
                          break;
                          }
                   }

                 if(ronak == false){
                     return i;
                 }
        }
        return -1;
    }
};